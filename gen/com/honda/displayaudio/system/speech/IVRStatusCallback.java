/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\speech\\IVRStatusCallback.aidl
 */
package com.honda.displayaudio.system.speech;
/**
 * a callback interface used by VRStatus.
 */
public interface IVRStatusCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.speech.IVRStatusCallback
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.speech.IVRStatusCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.speech.IVRStatusCallback interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.speech.IVRStatusCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.speech.IVRStatusCallback))) {
return ((com.honda.displayaudio.system.speech.IVRStatusCallback)iin);
}
return new com.honda.displayaudio.system.speech.IVRStatusCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onStatusUpdated:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onStatusUpdated(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.speech.IVRStatusCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void onStatusUpdated(boolean enabled, int icon_status, int ac_mode, int mic_mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
_data.writeInt(icon_status);
_data.writeInt(ac_mode);
_data.writeInt(mic_mode);
mRemote.transact(Stub.TRANSACTION_onStatusUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onStatusUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onStatusUpdated(boolean enabled, int icon_status, int ac_mode, int mic_mode) throws android.os.RemoteException;
}

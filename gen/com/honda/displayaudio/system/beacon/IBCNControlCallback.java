/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\beacon\\IBCNControlCallback.aidl
 */
package com.honda.displayaudio.system.beacon;
/**
 * a callback interface used by beaconService.
 */
public interface IBCNControlCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.beacon.IBCNControlCallback
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.beacon.IBCNControlCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.beacon.IBCNControlCallback interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.beacon.IBCNControlCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.beacon.IBCNControlCallback))) {
return ((com.honda.displayaudio.system.beacon.IBCNControlCallback)iin);
}
return new com.honda.displayaudio.system.beacon.IBCNControlCallback.Stub.Proxy(obj);
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
case TRANSACTION_onDataUpdated:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
int _arg1;
_arg1 = data.readInt();
this.onDataUpdated(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.beacon.IBCNControlCallback
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
@Override public void onDataUpdated(byte[] data, int len) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(data);
_data.writeInt(len);
mRemote.transact(Stub.TRANSACTION_onDataUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onDataUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onDataUpdated(byte[] data, int len) throws android.os.RemoteException;
}

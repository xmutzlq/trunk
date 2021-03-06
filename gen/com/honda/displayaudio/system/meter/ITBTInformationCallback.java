/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\meter\\ITBTInformationCallback.aidl
 */
package com.honda.displayaudio.system.meter;
/**
 * a callback interface used by TBTInfomationService.
 */
public interface ITBTInformationCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.meter.ITBTInformationCallback
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.meter.ITBTInformationCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.meter.ITBTInformationCallback interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.meter.ITBTInformationCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.meter.ITBTInformationCallback))) {
return ((com.honda.displayaudio.system.meter.ITBTInformationCallback)iin);
}
return new com.honda.displayaudio.system.meter.ITBTInformationCallback.Stub.Proxy(obj);
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
case TRANSACTION_onReplyGuideInfo:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.meter.ReplyGuideInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.honda.displayaudio.system.meter.ReplyGuideInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onReplyGuideInfo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onStatusUpdated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onStatusUpdated(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.meter.ITBTInformationCallback
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
@Override public void onReplyGuideInfo(com.honda.displayaudio.system.meter.ReplyGuideInfo data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onReplyGuideInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onStatusUpdated(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onStatusUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onReplyGuideInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onStatusUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onReplyGuideInfo(com.honda.displayaudio.system.meter.ReplyGuideInfo data) throws android.os.RemoteException;
public void onStatusUpdated(int status) throws android.os.RemoteException;
}

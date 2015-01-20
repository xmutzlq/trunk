/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\memory\\IMemoryInfomation.aidl
 */
package com.honda.displayaudio.system.memory;
public interface IMemoryInfomation extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.memory.IMemoryInfomation
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.memory.IMemoryInfomation";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.memory.IMemoryInfomation interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.memory.IMemoryInfomation asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.memory.IMemoryInfomation))) {
return ((com.honda.displayaudio.system.memory.IMemoryInfomation)iin);
}
return new com.honda.displayaudio.system.memory.IMemoryInfomation.Stub.Proxy(obj);
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
case TRANSACTION_getFileDescriptor:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _result = this.getFileDescriptor();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setValue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setValue(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.memory.IMemoryInfomation
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
@Override public android.os.ParcelFileDescriptor getFileDescriptor() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFileDescriptor, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setValue(int val) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(val);
mRemote.transact(Stub.TRANSACTION_setValue, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getFileDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public android.os.ParcelFileDescriptor getFileDescriptor() throws android.os.RemoteException;
public void setValue(int val) throws android.os.RemoteException;
}

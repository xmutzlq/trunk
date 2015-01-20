/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\modelinfo\\IModelInfo.aidl
 */
package com.honda.displayaudio.system.modelinfo;
public interface IModelInfo extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.modelinfo.IModelInfo
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.modelinfo.IModelInfo";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.modelinfo.IModelInfo interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.modelinfo.IModelInfo asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.modelinfo.IModelInfo))) {
return ((com.honda.displayaudio.system.modelinfo.IModelInfo)iin);
}
return new com.honda.displayaudio.system.modelinfo.IModelInfo.Stub.Proxy(obj);
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
case TRANSACTION_getDestinations:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getDestinations();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getPartsNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPartsNumber();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getBrand:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getBrand();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getNavigationType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getNavigationType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getEngineType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getEngineType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.modelinfo.IModelInfo
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
@Override public int[] getDestinations() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDestinations, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getPartsNumber() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPartsNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getBrand() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBrand, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getNavigationType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNavigationType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getEngineType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEngineType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getDestinations = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPartsNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getBrand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getNavigationType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getEngineType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public int[] getDestinations() throws android.os.RemoteException;
public java.lang.String getPartsNumber() throws android.os.RemoteException;
public int getBrand() throws android.os.RemoteException;
public int getNavigationType() throws android.os.RemoteException;
public int getEngineType() throws android.os.RemoteException;
}

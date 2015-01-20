/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\beacon\\IBCNControl.aidl
 */
package com.honda.displayaudio.system.beacon;
/**
 * an IPC Service interface used by beaconService.
 */
public interface IBCNControl extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.beacon.IBCNControl
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.beacon.IBCNControl";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.beacon.IBCNControl interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.beacon.IBCNControl asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.beacon.IBCNControl))) {
return ((com.honda.displayaudio.system.beacon.IBCNControl)iin);
}
return new com.honda.displayaudio.system.beacon.IBCNControl.Stub.Proxy(obj);
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
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.beacon.IBCNControlCallback _arg0;
_arg0 = com.honda.displayaudio.system.beacon.IBCNControlCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerCallback(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.beacon.IBCNControlCallback _arg0;
_arg0 = com.honda.displayaudio.system.beacon.IBCNControlCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.unregisterCallback(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getConnectStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getConnectStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_requestSelfCheck:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.requestSelfCheck();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.beacon.IBCNControl
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
@Override public boolean registerCallback(com.honda.displayaudio.system.beacon.IBCNControlCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean unregisterCallback(com.honda.displayaudio.system.beacon.IBCNControlCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getConnectStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConnectStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean requestSelfCheck() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestSelfCheck, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getConnectStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_requestSelfCheck = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public boolean registerCallback(com.honda.displayaudio.system.beacon.IBCNControlCallback cb) throws android.os.RemoteException;
public boolean unregisterCallback(com.honda.displayaudio.system.beacon.IBCNControlCallback cb) throws android.os.RemoteException;
public int getConnectStatus() throws android.os.RemoteException;
public boolean requestSelfCheck() throws android.os.RemoteException;
}

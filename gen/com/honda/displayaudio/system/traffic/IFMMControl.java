/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\traffic\\IFMMControl.aidl
 */
package com.honda.displayaudio.system.traffic;
/**
 * an IPC Service interface used by TrafficFMMService.
 */
public interface IFMMControl extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.traffic.IFMMControl
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.traffic.IFMMControl";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.traffic.IFMMControl interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.traffic.IFMMControl asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.traffic.IFMMControl))) {
return ((com.honda.displayaudio.system.traffic.IFMMControl)iin);
}
return new com.honda.displayaudio.system.traffic.IFMMControl.Stub.Proxy(obj);
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
com.honda.displayaudio.system.traffic.IFMMControlCallback _arg0;
_arg0 = com.honda.displayaudio.system.traffic.IFMMControlCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerCallback(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.traffic.IFMMControlCallback _arg0;
_arg0 = com.honda.displayaudio.system.traffic.IFMMControlCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.unregisterCallback(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setFrequency:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
boolean _result = this.setFrequency(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_requestStatus:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.requestStatus();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.traffic.IFMMControl
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
@Override public boolean registerCallback(com.honda.displayaudio.system.traffic.IFMMControlCallback cb) throws android.os.RemoteException
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
@Override public boolean unregisterCallback(com.honda.displayaudio.system.traffic.IFMMControlCallback cb) throws android.os.RemoteException
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
@Override public boolean setFrequency(float freq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(freq);
mRemote.transact(Stub.TRANSACTION_setFrequency, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean requestStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestStatus, _data, _reply, 0);
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
static final int TRANSACTION_setFrequency = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_requestStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public boolean registerCallback(com.honda.displayaudio.system.traffic.IFMMControlCallback cb) throws android.os.RemoteException;
public boolean unregisterCallback(com.honda.displayaudio.system.traffic.IFMMControlCallback cb) throws android.os.RemoteException;
public boolean setFrequency(float freq) throws android.os.RemoteException;
public boolean requestStatus() throws android.os.RemoteException;
}

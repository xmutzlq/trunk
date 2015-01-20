/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\speech\\IVRStatus.aidl
 */
package com.honda.displayaudio.system.speech;
/**
 * an IPC Service interface used by VRStatus.
 */
public interface IVRStatus extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.speech.IVRStatus
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.speech.IVRStatus";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.speech.IVRStatus interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.speech.IVRStatus asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.speech.IVRStatus))) {
return ((com.honda.displayaudio.system.speech.IVRStatus)iin);
}
return new com.honda.displayaudio.system.speech.IVRStatus.Stub.Proxy(obj);
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
com.honda.displayaudio.system.speech.IVRStatusCallback _arg0;
_arg0 = com.honda.displayaudio.system.speech.IVRStatusCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerCallback(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.speech.IVRStatusCallback _arg0;
_arg0 = com.honda.displayaudio.system.speech.IVRStatusCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.unregisterCallback(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startControl:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.startControl();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_endControl:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.endControl();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getIconStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getIconStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setIconStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setIconStatus(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAirConMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAirConMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAirConMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setAirConMode(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getMicMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getMicMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setMicMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setMicMode(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBooleanSetting:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.getBooleanSetting(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.speech.IVRStatus
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
@Override public boolean registerCallback(com.honda.displayaudio.system.speech.IVRStatusCallback cb) throws android.os.RemoteException
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
@Override public boolean unregisterCallback(com.honda.displayaudio.system.speech.IVRStatusCallback cb) throws android.os.RemoteException
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
@Override public boolean isEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean startControl() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startControl, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean endControl() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_endControl, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getIconStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getIconStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setIconStatus(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_setIconStatus, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getAirConMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAirConMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setAirConMode(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_setAirConMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getMicMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMicMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setMicMode(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_setMicMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getBooleanSetting(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_getBooleanSetting, _data, _reply, 0);
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
static final int TRANSACTION_isEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startControl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_endControl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getIconStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setIconStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getAirConMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setAirConMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getMicMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setMicMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getBooleanSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
}
public boolean registerCallback(com.honda.displayaudio.system.speech.IVRStatusCallback cb) throws android.os.RemoteException;
public boolean unregisterCallback(com.honda.displayaudio.system.speech.IVRStatusCallback cb) throws android.os.RemoteException;
public boolean isEnabled() throws android.os.RemoteException;
public boolean startControl() throws android.os.RemoteException;
public boolean endControl() throws android.os.RemoteException;
public int getIconStatus() throws android.os.RemoteException;
public boolean setIconStatus(int status) throws android.os.RemoteException;
public int getAirConMode() throws android.os.RemoteException;
public boolean setAirConMode(int status) throws android.os.RemoteException;
public int getMicMode() throws android.os.RemoteException;
public boolean setMicMode(int status) throws android.os.RemoteException;
public boolean getBooleanSetting(java.lang.String name) throws android.os.RemoteException;
}

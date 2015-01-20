/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\meter\\ITBTInfomation.aidl
 */
package com.honda.displayaudio.system.meter;
/**
 * an IPC Service interface used by TBTInfomationService.
 */
public interface ITBTInfomation extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.meter.ITBTInfomation
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.meter.ITBTInfomation";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.meter.ITBTInfomation interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.meter.ITBTInfomation asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.meter.ITBTInfomation))) {
return ((com.honda.displayaudio.system.meter.ITBTInfomation)iin);
}
return new com.honda.displayaudio.system.meter.ITBTInfomation.Stub.Proxy(obj);
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
com.honda.displayaudio.system.meter.ITBTInformationCallback _arg0;
_arg0 = com.honda.displayaudio.system.meter.ITBTInformationCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerCallback(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.meter.ITBTInformationCallback _arg0;
_arg0 = com.honda.displayaudio.system.meter.ITBTInformationCallback.Stub.asInterface(data.readStrongBinder());
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
case TRANSACTION_setGuidDispDemand:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.meter.GuidDispDemand _arg0;
if ((0!=data.readInt())) {
_arg0 = com.honda.displayaudio.system.meter.GuidDispDemand.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setGuidDispDemand(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNavGuide:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.meter.NavGuide _arg0;
if ((0!=data.readInt())) {
_arg0 = com.honda.displayaudio.system.meter.NavGuide.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setNavGuide(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNavCurrent:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.meter.NavCurrent _arg0;
if ((0!=data.readInt())) {
_arg0 = com.honda.displayaudio.system.meter.NavCurrent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setNavCurrent(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setNavigationStatus:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setNavigationStatus(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.meter.ITBTInfomation
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
@Override public boolean registerCallback(com.honda.displayaudio.system.meter.ITBTInformationCallback cb) throws android.os.RemoteException
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
@Override public boolean unregisterCallback(com.honda.displayaudio.system.meter.ITBTInformationCallback cb) throws android.os.RemoteException
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
@Override public boolean setGuidDispDemand(com.honda.displayaudio.system.meter.GuidDispDemand data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setGuidDispDemand, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setNavGuide(com.honda.displayaudio.system.meter.NavGuide data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setNavGuide, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setNavCurrent(com.honda.displayaudio.system.meter.NavCurrent data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setNavCurrent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setNavigationStatus(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNavigationStatus, _data, _reply, 0);
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
static final int TRANSACTION_setGuidDispDemand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setNavGuide = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setNavCurrent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setNavigationStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public boolean registerCallback(com.honda.displayaudio.system.meter.ITBTInformationCallback cb) throws android.os.RemoteException;
public boolean unregisterCallback(com.honda.displayaudio.system.meter.ITBTInformationCallback cb) throws android.os.RemoteException;
public boolean isEnabled() throws android.os.RemoteException;
public boolean setGuidDispDemand(com.honda.displayaudio.system.meter.GuidDispDemand data) throws android.os.RemoteException;
public boolean setNavGuide(com.honda.displayaudio.system.meter.NavGuide data) throws android.os.RemoteException;
public boolean setNavCurrent(com.honda.displayaudio.system.meter.NavCurrent data) throws android.os.RemoteException;
public int getStatus() throws android.os.RemoteException;
public boolean setNavigationStatus(boolean enabled) throws android.os.RemoteException;
}

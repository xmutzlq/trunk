/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\naviinfo\\INaviInfoProvider.aidl
 */
package com.honda.displayaudio.system.naviinfo;
public interface INaviInfoProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.naviinfo.INaviInfoProvider
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.naviinfo.INaviInfoProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.naviinfo.INaviInfoProvider interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.naviinfo.INaviInfoProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.naviinfo.INaviInfoProvider))) {
return ((com.honda.displayaudio.system.naviinfo.INaviInfoProvider)iin);
}
return new com.honda.displayaudio.system.naviinfo.INaviInfoProvider.Stub.Proxy(obj);
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
case TRANSACTION_getConfigration:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.naviinfo.ConfigParam _result = this.getConfigration();
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
case TRANSACTION_getCurrentLocation:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.naviinfo.LocationInfo _result = this.getCurrentLocation();
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
case TRANSACTION_getCurrentTimeZone:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.naviinfo.TimeZoneInfo _result = this.getCurrentTimeZone();
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
case TRANSACTION_addListener:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.naviinfo.INaviInfoListener _arg0;
_arg0 = com.honda.displayaudio.system.naviinfo.INaviInfoListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.addListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeListener:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.naviinfo.INaviInfoListener _arg0;
_arg0 = com.honda.displayaudio.system.naviinfo.INaviInfoListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.removeListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.naviinfo.INaviInfoProvider
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
@Override public com.honda.displayaudio.system.naviinfo.ConfigParam getConfigration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.honda.displayaudio.system.naviinfo.ConfigParam _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConfigration, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.honda.displayaudio.system.naviinfo.ConfigParam.CREATOR.createFromParcel(_reply);
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
@Override public com.honda.displayaudio.system.naviinfo.LocationInfo getCurrentLocation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.honda.displayaudio.system.naviinfo.LocationInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentLocation, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.honda.displayaudio.system.naviinfo.LocationInfo.CREATOR.createFromParcel(_reply);
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
@Override public com.honda.displayaudio.system.naviinfo.TimeZoneInfo getCurrentTimeZone() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.honda.displayaudio.system.naviinfo.TimeZoneInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentTimeZone, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.honda.displayaudio.system.naviinfo.TimeZoneInfo.CREATOR.createFromParcel(_reply);
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
@Override public boolean addListener(com.honda.displayaudio.system.naviinfo.INaviInfoListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addListener, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeListener(com.honda.displayaudio.system.naviinfo.INaviInfoListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeListener, _data, _reply, 0);
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
static final int TRANSACTION_getConfigration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCurrentLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCurrentTimeZone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_addListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_removeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public com.honda.displayaudio.system.naviinfo.ConfigParam getConfigration() throws android.os.RemoteException;
public com.honda.displayaudio.system.naviinfo.LocationInfo getCurrentLocation() throws android.os.RemoteException;
public com.honda.displayaudio.system.naviinfo.TimeZoneInfo getCurrentTimeZone() throws android.os.RemoteException;
public boolean addListener(com.honda.displayaudio.system.naviinfo.INaviInfoListener listener) throws android.os.RemoteException;
public boolean removeListener(com.honda.displayaudio.system.naviinfo.INaviInfoListener listener) throws android.os.RemoteException;
}

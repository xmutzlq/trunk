/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\naviinfo\\INaviInfoSuplier.aidl
 */
package com.honda.displayaudio.system.naviinfo;
public interface INaviInfoSuplier extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.naviinfo.INaviInfoSuplier
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.naviinfo.INaviInfoSuplier";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.naviinfo.INaviInfoSuplier interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.naviinfo.INaviInfoSuplier asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.naviinfo.INaviInfoSuplier))) {
return ((com.honda.displayaudio.system.naviinfo.INaviInfoSuplier)iin);
}
return new com.honda.displayaudio.system.naviinfo.INaviInfoSuplier.Stub.Proxy(obj);
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
case TRANSACTION_configureNotification:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.naviinfo.ConfigParam _arg0;
if ((0!=data.readInt())) {
_arg0 = com.honda.displayaudio.system.naviinfo.ConfigParam.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.configureNotification(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCurrentLocation:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.naviinfo.LocationInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.honda.displayaudio.system.naviinfo.LocationInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setCurrentLocation(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCurrentTimeZone:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.naviinfo.TimeZoneInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.honda.displayaudio.system.naviinfo.TimeZoneInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setCurrentTimeZone(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.naviinfo.INaviInfoSuplier
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
@Override public boolean configureNotification(com.honda.displayaudio.system.naviinfo.ConfigParam param) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((param!=null)) {
_data.writeInt(1);
param.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_configureNotification, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setCurrentLocation(com.honda.displayaudio.system.naviinfo.LocationInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setCurrentLocation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setCurrentTimeZone(com.honda.displayaudio.system.naviinfo.TimeZoneInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setCurrentTimeZone, _data, _reply, 0);
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
static final int TRANSACTION_configureNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setCurrentLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setCurrentTimeZone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public boolean configureNotification(com.honda.displayaudio.system.naviinfo.ConfigParam param) throws android.os.RemoteException;
public boolean setCurrentLocation(com.honda.displayaudio.system.naviinfo.LocationInfo info) throws android.os.RemoteException;
public boolean setCurrentTimeZone(com.honda.displayaudio.system.naviinfo.TimeZoneInfo info) throws android.os.RemoteException;
}

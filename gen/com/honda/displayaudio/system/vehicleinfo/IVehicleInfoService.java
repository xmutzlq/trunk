/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\vehicleinfo\\IVehicleInfoService.aidl
 */
package com.honda.displayaudio.system.vehicleinfo;
public interface IVehicleInfoService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService))) {
return ((com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService)iin);
}
return new com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService.Stub.Proxy(obj);
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
case TRANSACTION_registAutoJudgeCallBack:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks _arg0;
_arg0 = com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks.Stub.asInterface(data.readStrongBinder());
this.registAutoJudgeCallBack(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregistAutoJudgeCallBack:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks _arg0;
_arg0 = com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks.Stub.asInterface(data.readStrongBinder());
this.unregistAutoJudgeCallBack(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_runningRegulation:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.runningRegulation();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_runningRegulationPark:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.runningRegulationPark();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getVinNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getVinNumber();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSerialNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getSerialNumber();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getDayNightStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDayNightStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getNaviDataPath:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getNaviDataPath();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getScreenOffStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getScreenOffStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getUSBMemPath:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getUSBMemPath(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService
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
@Override public void registAutoJudgeCallBack(com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks callbacks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callbacks!=null))?(callbacks.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registAutoJudgeCallBack, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregistAutoJudgeCallBack(com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks callbacks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callbacks!=null))?(callbacks.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregistAutoJudgeCallBack, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int runningRegulation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_runningRegulation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int runningRegulationPark() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_runningRegulationPark, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getVinNumber() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVinNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getSerialNumber() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSerialNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDayNightStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDayNightStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getNaviDataPath() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNaviDataPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getScreenOffStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getScreenOffStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getUSBMemPath(int portNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(portNumber);
mRemote.transact(Stub.TRANSACTION_getUSBMemPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registAutoJudgeCallBack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregistAutoJudgeCallBack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_runningRegulation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_runningRegulationPark = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getVinNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getSerialNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getDayNightStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getNaviDataPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getScreenOffStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getUSBMemPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public void registAutoJudgeCallBack(com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks callbacks) throws android.os.RemoteException;
public void unregistAutoJudgeCallBack(com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks callbacks) throws android.os.RemoteException;
public int runningRegulation() throws android.os.RemoteException;
public int runningRegulationPark() throws android.os.RemoteException;
public java.lang.String getVinNumber() throws android.os.RemoteException;
public java.lang.String getSerialNumber() throws android.os.RemoteException;
public int getDayNightStatus() throws android.os.RemoteException;
public java.lang.String getNaviDataPath() throws android.os.RemoteException;
public int getScreenOffStatus() throws android.os.RemoteException;
public java.lang.String getUSBMemPath(int portNumber) throws android.os.RemoteException;
}

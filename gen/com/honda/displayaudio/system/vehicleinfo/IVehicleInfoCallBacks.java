/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\vehicleinfo\\IVehicleInfoCallBacks.aidl
 */
package com.honda.displayaudio.system.vehicleinfo;
public interface IVehicleInfoCallBacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks))) {
return ((com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks)iin);
}
return new com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks.Stub.Proxy(obj);
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
case TRANSACTION_onReceiveAutoJudge:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onReceiveAutoJudge(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onReceiveAutoJudgePark:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onReceiveAutoJudgePark(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onSensorChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
float _arg2;
_arg2 = data.readFloat();
float _arg3;
_arg3 = data.readFloat();
float _arg4;
_arg4 = data.readFloat();
float _arg5;
_arg5 = data.readFloat();
float _arg6;
_arg6 = data.readFloat();
this.onSensorChanged(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_onReceiveDayNightStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onReceiveDayNightStatus(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onReceiveScreenOffStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onReceiveScreenOffStatus(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks
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
@Override public void onReceiveAutoJudge(int regulation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(regulation);
mRemote.transact(Stub.TRANSACTION_onReceiveAutoJudge, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onReceiveAutoJudgePark(int regulation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(regulation);
mRemote.transact(Stub.TRANSACTION_onReceiveAutoJudgePark, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onSensorChanged(int sensor, long uptimemillis, float values1, float values2, float values3, float values4, float values5) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sensor);
_data.writeLong(uptimemillis);
_data.writeFloat(values1);
_data.writeFloat(values2);
_data.writeFloat(values3);
_data.writeFloat(values4);
_data.writeFloat(values5);
mRemote.transact(Stub.TRANSACTION_onSensorChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onReceiveDayNightStatus(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onReceiveDayNightStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onReceiveScreenOffStatus(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onReceiveScreenOffStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onReceiveAutoJudge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onReceiveAutoJudgePark = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSensorChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onReceiveDayNightStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onReceiveScreenOffStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void onReceiveAutoJudge(int regulation) throws android.os.RemoteException;
public void onReceiveAutoJudgePark(int regulation) throws android.os.RemoteException;
public void onSensorChanged(int sensor, long uptimemillis, float values1, float values2, float values3, float values4, float values5) throws android.os.RemoteException;
public void onReceiveDayNightStatus(int status) throws android.os.RemoteException;
public void onReceiveScreenOffStatus(int status) throws android.os.RemoteException;
}

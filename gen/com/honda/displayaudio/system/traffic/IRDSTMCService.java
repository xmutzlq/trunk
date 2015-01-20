/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\traffic\\IRDSTMCService.aidl
 */
package com.honda.displayaudio.system.traffic;
public interface IRDSTMCService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.traffic.IRDSTMCService
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.traffic.IRDSTMCService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.traffic.IRDSTMCService interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.traffic.IRDSTMCService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.traffic.IRDSTMCService))) {
return ((com.honda.displayaudio.system.traffic.IRDSTMCService)iin);
}
return new com.honda.displayaudio.system.traffic.IRDSTMCService.Stub.Proxy(obj);
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
case TRANSACTION_registRDSTMCCallBacks:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.traffic.IRDSTMCCallBacks _arg0;
_arg0 = com.honda.displayaudio.system.traffic.IRDSTMCCallBacks.Stub.asInterface(data.readStrongBinder());
this.registRDSTMCCallBacks(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregistRDSTMCCallBacks:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.traffic.IRDSTMCCallBacks _arg0;
_arg0 = com.honda.displayaudio.system.traffic.IRDSTMCCallBacks.Stub.asInterface(data.readStrongBinder());
this.unregistRDSTMCCallBacks(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clearServiceList:
{
data.enforceInterface(DESCRIPTOR);
this.clearServiceList();
reply.writeNoException();
return true;
}
case TRANSACTION_getServices:
{
data.enforceInterface(DESCRIPTOR);
this.getServices();
reply.writeNoException();
return true;
}
case TRANSACTION_getSignalStrengthThresholds:
{
data.enforceInterface(DESCRIPTOR);
this.getSignalStrengthThresholds();
reply.writeNoException();
return true;
}
case TRANSACTION_getStatus:
{
data.enforceInterface(DESCRIPTOR);
this.getStatus();
reply.writeNoException();
return true;
}
case TRANSACTION_inhibitFrequency:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.inhibitFrequency(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_scan:
{
data.enforceInterface(DESCRIPTOR);
this.scan();
reply.writeNoException();
return true;
}
case TRANSACTION_setCountry:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _arg3;
_arg3 = data.readInt();
java.util.List<com.honda.displayaudio.system.traffic.LtnSid> _arg4;
_arg4 = data.createTypedArrayList(com.honda.displayaudio.system.traffic.LtnSid.CREATOR);
this.setCountry(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_setGrid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setGrid(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<com.honda.displayaudio.system.traffic.RDSTMCServiceInfo> _arg1;
_arg1 = data.createTypedArrayList(com.honda.displayaudio.system.traffic.RDSTMCServiceInfo.CREATOR);
this.setServices(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_tune:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.tune(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.traffic.IRDSTMCService
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
@Override public void registRDSTMCCallBacks(com.honda.displayaudio.system.traffic.IRDSTMCCallBacks iRDSTMCCallBacks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((iRDSTMCCallBacks!=null))?(iRDSTMCCallBacks.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registRDSTMCCallBacks, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregistRDSTMCCallBacks(com.honda.displayaudio.system.traffic.IRDSTMCCallBacks iRDSTMCCallBacks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((iRDSTMCCallBacks!=null))?(iRDSTMCCallBacks.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregistRDSTMCCallBacks, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearServiceList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearServiceList, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getServices() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getServices, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getSignalStrengthThresholds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSignalStrengthThresholds, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void inhibitFrequency(int frequency) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(frequency);
mRemote.transact(Stub.TRANSACTION_inhibitFrequency, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void scan() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_scan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setCountry(int countryCode, int countryCodeEx, boolean isRbds, int ltnSidCount, java.util.List<com.honda.displayaudio.system.traffic.LtnSid> ltnSidList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(countryCode);
_data.writeInt(countryCodeEx);
_data.writeInt(((isRbds)?(1):(0)));
_data.writeInt(ltnSidCount);
_data.writeTypedList(ltnSidList);
mRemote.transact(Stub.TRANSACTION_setCountry, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setGrid(int lowFrequency, int highFrequency, int spacing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(lowFrequency);
_data.writeInt(highFrequency);
_data.writeInt(spacing);
mRemote.transact(Stub.TRANSACTION_setGrid, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setServices(int serviceCount, java.util.List<com.honda.displayaudio.system.traffic.RDSTMCServiceInfo> serviceList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serviceCount);
_data.writeTypedList(serviceList);
mRemote.transact(Stub.TRANSACTION_setServices, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void tune(int frequency) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(frequency);
mRemote.transact(Stub.TRANSACTION_tune, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registRDSTMCCallBacks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregistRDSTMCCallBacks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_clearServiceList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getSignalStrengthThresholds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_inhibitFrequency = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_scan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setCountry = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setGrid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_tune = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
}
public void registRDSTMCCallBacks(com.honda.displayaudio.system.traffic.IRDSTMCCallBacks iRDSTMCCallBacks) throws android.os.RemoteException;
public void unregistRDSTMCCallBacks(com.honda.displayaudio.system.traffic.IRDSTMCCallBacks iRDSTMCCallBacks) throws android.os.RemoteException;
public void clearServiceList() throws android.os.RemoteException;
public void getServices() throws android.os.RemoteException;
public void getSignalStrengthThresholds() throws android.os.RemoteException;
public void getStatus() throws android.os.RemoteException;
public void inhibitFrequency(int frequency) throws android.os.RemoteException;
public void scan() throws android.os.RemoteException;
public void setCountry(int countryCode, int countryCodeEx, boolean isRbds, int ltnSidCount, java.util.List<com.honda.displayaudio.system.traffic.LtnSid> ltnSidList) throws android.os.RemoteException;
public void setGrid(int lowFrequency, int highFrequency, int spacing) throws android.os.RemoteException;
public void setServices(int serviceCount, java.util.List<com.honda.displayaudio.system.traffic.RDSTMCServiceInfo> serviceList) throws android.os.RemoteException;
public void tune(int frequency) throws android.os.RemoteException;
}

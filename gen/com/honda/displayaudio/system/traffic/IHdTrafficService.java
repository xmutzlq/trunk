/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\traffic\\IHdTrafficService.aidl
 */
package com.honda.displayaudio.system.traffic;
public interface IHdTrafficService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.traffic.IHdTrafficService
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.traffic.IHdTrafficService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.traffic.IHdTrafficService interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.traffic.IHdTrafficService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.traffic.IHdTrafficService))) {
return ((com.honda.displayaudio.system.traffic.IHdTrafficService)iin);
}
return new com.honda.displayaudio.system.traffic.IHdTrafficService.Stub.Proxy(obj);
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
case TRANSACTION_registerHdTrafficCallBacks:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.traffic.IHdTrafficCallBacks _arg0;
_arg0 = com.honda.displayaudio.system.traffic.IHdTrafficCallBacks.Stub.asInterface(data.readStrongBinder());
this.registerHdTrafficCallBacks(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterHdTrafficCallBacks:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.traffic.IHdTrafficCallBacks _arg0;
_arg0 = com.honda.displayaudio.system.traffic.IHdTrafficCallBacks.Stub.asInterface(data.readStrongBinder());
this.unregisterHdTrafficCallBacks(_arg0);
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
case TRANSACTION_scan:
{
data.enforceInterface(DESCRIPTOR);
this.scan();
reply.writeNoException();
return true;
}
case TRANSACTION_setGrid:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.setGrid(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
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
case TRANSACTION_notifyAasDataResult:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.notifyAasDataResult(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyHdAlternateFrequency:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.notifyHdAlternateFrequency(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.traffic.IHdTrafficService
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
@Override public void registerHdTrafficCallBacks(com.honda.displayaudio.system.traffic.IHdTrafficCallBacks iHdTrafficCallBacks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((iHdTrafficCallBacks!=null))?(iHdTrafficCallBacks.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerHdTrafficCallBacks, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterHdTrafficCallBacks(com.honda.displayaudio.system.traffic.IHdTrafficCallBacks iHdTrafficCallBacks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((iHdTrafficCallBacks!=null))?(iHdTrafficCallBacks.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterHdTrafficCallBacks, _data, _reply, 0);
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
@Override public void setGrid(boolean isHdSupported, int lowFrequency, int highFrequency, int spacing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isHdSupported)?(1):(0)));
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
@Override public void setServices(int parseResult, int[] portList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(parseResult);
_data.writeIntArray(portList);
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
@Override public void notifyAasDataResult(int portNumber, int sequenceNumber, boolean hasTraffic) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(portNumber);
_data.writeInt(sequenceNumber);
_data.writeInt(((hasTraffic)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_notifyAasDataResult, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyHdAlternateFrequency(int frequency) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(frequency);
mRemote.transact(Stub.TRANSACTION_notifyHdAlternateFrequency, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerHdTrafficCallBacks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterHdTrafficCallBacks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_clearServiceList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getSignalStrengthThresholds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_scan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setGrid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_tune = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_notifyAasDataResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_notifyHdAlternateFrequency = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void registerHdTrafficCallBacks(com.honda.displayaudio.system.traffic.IHdTrafficCallBacks iHdTrafficCallBacks) throws android.os.RemoteException;
public void unregisterHdTrafficCallBacks(com.honda.displayaudio.system.traffic.IHdTrafficCallBacks iHdTrafficCallBacks) throws android.os.RemoteException;
public void clearServiceList() throws android.os.RemoteException;
public void getSignalStrengthThresholds() throws android.os.RemoteException;
public void getStatus() throws android.os.RemoteException;
public void scan() throws android.os.RemoteException;
public void setGrid(boolean isHdSupported, int lowFrequency, int highFrequency, int spacing) throws android.os.RemoteException;
public void setServices(int parseResult, int[] portList) throws android.os.RemoteException;
public void tune(int frequency) throws android.os.RemoteException;
public void notifyAasDataResult(int portNumber, int sequenceNumber, boolean hasTraffic) throws android.os.RemoteException;
public void notifyHdAlternateFrequency(int frequency) throws android.os.RemoteException;
}

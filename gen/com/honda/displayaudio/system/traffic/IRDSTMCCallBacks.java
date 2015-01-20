/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\traffic\\IRDSTMCCallBacks.aidl
 */
package com.honda.displayaudio.system.traffic;
public interface IRDSTMCCallBacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.traffic.IRDSTMCCallBacks
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.traffic.IRDSTMCCallBacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.traffic.IRDSTMCCallBacks interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.traffic.IRDSTMCCallBacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.traffic.IRDSTMCCallBacks))) {
return ((com.honda.displayaudio.system.traffic.IRDSTMCCallBacks)iin);
}
return new com.honda.displayaudio.system.traffic.IRDSTMCCallBacks.Stub.Proxy(obj);
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
case TRANSACTION_gridCb:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.gridCb(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_rdsGroupCb:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.traffic.RdsGroup _arg0;
if ((0!=data.readInt())) {
_arg0 = com.honda.displayaudio.system.traffic.RdsGroup.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.rdsGroupCb(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_requestCountryInfoCb:
{
data.enforceInterface(DESCRIPTOR);
this.requestCountryInfoCb();
reply.writeNoException();
return true;
}
case TRANSACTION_scanProgressCb:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.scanProgressCb(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_serviceListCb:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<com.honda.displayaudio.system.traffic.RDSTMCServiceInfo> _arg1;
_arg1 = data.createTypedArrayList(com.honda.displayaudio.system.traffic.RDSTMCServiceInfo.CREATOR);
this.serviceListCb(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_signalStrengthThresholdCb:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.signalStrengthThresholdCb(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_statusCb:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.statusCb(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_tunedServiceCb:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.traffic.RDSTMCServiceInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.honda.displayaudio.system.traffic.RDSTMCServiceInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.tunedServiceCb(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.traffic.IRDSTMCCallBacks
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
@Override public void gridCb(int lowFrequency, int highFrequency, int spacing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(lowFrequency);
_data.writeInt(highFrequency);
_data.writeInt(spacing);
mRemote.transact(Stub.TRANSACTION_gridCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void rdsGroupCb(com.honda.displayaudio.system.traffic.RdsGroup rdsGroup) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((rdsGroup!=null)) {
_data.writeInt(1);
rdsGroup.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_rdsGroupCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestCountryInfoCb() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestCountryInfoCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void scanProgressCb(int percent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(percent);
mRemote.transact(Stub.TRANSACTION_scanProgressCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void serviceListCb(int serviceCount, java.util.List<com.honda.displayaudio.system.traffic.RDSTMCServiceInfo> serviceList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serviceCount);
_data.writeTypedList(serviceList);
mRemote.transact(Stub.TRANSACTION_serviceListCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void signalStrengthThresholdCb(int poorThreshold, int weekThreshold, int marginalThreshold, int strongThreshold, int veryStrongThreshold) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(poorThreshold);
_data.writeInt(weekThreshold);
_data.writeInt(marginalThreshold);
_data.writeInt(strongThreshold);
_data.writeInt(veryStrongThreshold);
mRemote.transact(Stub.TRANSACTION_signalStrengthThresholdCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void statusCb(int state, boolean rdsCarrier, int signalStrength, int frequency) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
_data.writeInt(((rdsCarrier)?(1):(0)));
_data.writeInt(signalStrength);
_data.writeInt(frequency);
mRemote.transact(Stub.TRANSACTION_statusCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void tunedServiceCb(com.honda.displayaudio.system.traffic.RDSTMCServiceInfo service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((service!=null)) {
_data.writeInt(1);
service.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_tunedServiceCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_gridCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_rdsGroupCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_requestCountryInfoCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_scanProgressCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_serviceListCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_signalStrengthThresholdCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_statusCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_tunedServiceCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void gridCb(int lowFrequency, int highFrequency, int spacing) throws android.os.RemoteException;
public void rdsGroupCb(com.honda.displayaudio.system.traffic.RdsGroup rdsGroup) throws android.os.RemoteException;
public void requestCountryInfoCb() throws android.os.RemoteException;
public void scanProgressCb(int percent) throws android.os.RemoteException;
public void serviceListCb(int serviceCount, java.util.List<com.honda.displayaudio.system.traffic.RDSTMCServiceInfo> serviceList) throws android.os.RemoteException;
public void signalStrengthThresholdCb(int poorThreshold, int weekThreshold, int marginalThreshold, int strongThreshold, int veryStrongThreshold) throws android.os.RemoteException;
public void statusCb(int state, boolean rdsCarrier, int signalStrength, int frequency) throws android.os.RemoteException;
public void tunedServiceCb(com.honda.displayaudio.system.traffic.RDSTMCServiceInfo service) throws android.os.RemoteException;
}

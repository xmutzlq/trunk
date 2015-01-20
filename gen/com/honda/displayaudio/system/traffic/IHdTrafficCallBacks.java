/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\traffic\\IHdTrafficCallBacks.aidl
 */
package com.honda.displayaudio.system.traffic;
public interface IHdTrafficCallBacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.traffic.IHdTrafficCallBacks
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.traffic.IHdTrafficCallBacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.traffic.IHdTrafficCallBacks interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.traffic.IHdTrafficCallBacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.traffic.IHdTrafficCallBacks))) {
return ((com.honda.displayaudio.system.traffic.IHdTrafficCallBacks)iin);
}
return new com.honda.displayaudio.system.traffic.IHdTrafficCallBacks.Stub.Proxy(obj);
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
case TRANSACTION_requestGridInfoCb:
{
data.enforceInterface(DESCRIPTOR);
this.requestGridInfoCb();
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
java.util.List<com.honda.displayaudio.system.traffic.HdTrafficServiceInfo> _arg0;
_arg0 = data.createTypedArrayList(com.honda.displayaudio.system.traffic.HdTrafficServiceInfo.CREATOR);
this.serviceListCb(_arg0);
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
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.statusCb(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_aasPortEnabledCb:
{
data.enforceInterface(DESCRIPTOR);
this.aasPortEnabledCb();
reply.writeNoException();
return true;
}
case TRANSACTION_aasDataCb:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
this.aasDataCb(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.traffic.IHdTrafficCallBacks
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
@Override public void requestGridInfoCb() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestGridInfoCb, _data, _reply, 0);
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
@Override public void serviceListCb(java.util.List<com.honda.displayaudio.system.traffic.HdTrafficServiceInfo> serviceList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
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
@Override public void statusCb(int state, int signalStrength, int frequency) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
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
@Override public void aasPortEnabledCb() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_aasPortEnabledCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void aasDataCb(int portNumber, int sequenceNumber, byte[] payloadData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(portNumber);
_data.writeInt(sequenceNumber);
_data.writeByteArray(payloadData);
mRemote.transact(Stub.TRANSACTION_aasDataCb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_gridCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_requestGridInfoCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_scanProgressCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_serviceListCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_signalStrengthThresholdCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_statusCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_aasPortEnabledCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_aasDataCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void gridCb(int lowFrequency, int highFrequency, int spacing) throws android.os.RemoteException;
public void requestGridInfoCb() throws android.os.RemoteException;
public void scanProgressCb(int percent) throws android.os.RemoteException;
public void serviceListCb(java.util.List<com.honda.displayaudio.system.traffic.HdTrafficServiceInfo> serviceList) throws android.os.RemoteException;
public void signalStrengthThresholdCb(int poorThreshold, int weekThreshold, int marginalThreshold, int strongThreshold, int veryStrongThreshold) throws android.os.RemoteException;
public void statusCb(int state, int signalStrength, int frequency) throws android.os.RemoteException;
public void aasPortEnabledCb() throws android.os.RemoteException;
public void aasDataCb(int portNumber, int sequenceNumber, byte[] payloadData) throws android.os.RemoteException;
}

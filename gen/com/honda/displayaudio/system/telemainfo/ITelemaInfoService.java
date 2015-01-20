/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AidlServiceDemo\\src\\com\\honda\\displayaudio\\system\\telemainfo\\ITelemaInfoService.aidl
 */
package com.honda.displayaudio.system.telemainfo;
public interface ITelemaInfoService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.honda.displayaudio.system.telemainfo.ITelemaInfoService
{
private static final java.lang.String DESCRIPTOR = "com.honda.displayaudio.system.telemainfo.ITelemaInfoService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.honda.displayaudio.system.telemainfo.ITelemaInfoService interface,
 * generating a proxy if needed.
 */
public static com.honda.displayaudio.system.telemainfo.ITelemaInfoService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.honda.displayaudio.system.telemainfo.ITelemaInfoService))) {
return ((com.honda.displayaudio.system.telemainfo.ITelemaInfoService)iin);
}
return new com.honda.displayaudio.system.telemainfo.ITelemaInfoService.Stub.Proxy(obj);
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
case TRANSACTION_addDialupInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> _arg1;
_arg1 = data.createTypedArrayList(com.honda.displayaudio.system.telemainfo.DialupInfo.CREATOR);
boolean _result = this.addDialupInfo(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateDialupInfoOne:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.honda.displayaudio.system.telemainfo.DialupInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.honda.displayaudio.system.telemainfo.DialupInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
boolean _result = this.updateDialupInfoOne(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateDialupInfoAll:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> _arg1;
_arg1 = data.createTypedArrayList(com.honda.displayaudio.system.telemainfo.DialupInfo.CREATOR);
boolean _result = this.updateDialupInfoAll(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDialupInfoOne:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.honda.displayaudio.system.telemainfo.DialupInfo _result = this.getDialupInfoOne(_arg0, _arg1);
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
case TRANSACTION_getDialupInfoAll:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> _result = this.getDialupInfoAll(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getCurrentDialupInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.honda.displayaudio.system.telemainfo.DialupInfo _result = this.getCurrentDialupInfo(_arg0);
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
case TRANSACTION_selectDialupInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
boolean _result = this.selectDialupInfo(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_deleteDialupInfoOne:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.deleteDialupInfoOne(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_deleteDialupInfoAll:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.deleteDialupInfoAll(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getLUFInfo:
{
data.enforceInterface(DESCRIPTOR);
com.honda.displayaudio.system.telemainfo.LUFInfo _result = this.getLUFInfo();
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
case TRANSACTION_getProvisioningFileName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getProvisioningFileName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_initProvisioningFile:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.initProvisioningFile();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getProvisioningFileUpdateTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getProvisioningFileUpdateTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setProvisioningFileUpdateTime:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.setProvisioningFileUpdateTime(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDialupUpdateTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getDialupUpdateTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setDialupUpdateTime:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.setDialupUpdateTime(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getLocationUploadStatus:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getLocationUploadStatus();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setLocationUploadStatus:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setLocationUploadStatus(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startUsingNetworkTCU:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.startUsingNetworkTCU();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopUsingNetworkTCU:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopUsingNetworkTCU();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.honda.displayaudio.system.telemainfo.ITelemaInfoService
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
@Override public boolean addDialupInfo(int type, java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> dialupInfoList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeTypedList(dialupInfoList);
mRemote.transact(Stub.TRANSACTION_addDialupInfo, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean updateDialupInfoOne(int type, com.honda.displayaudio.system.telemainfo.DialupInfo dialupInfo, int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
if ((dialupInfo!=null)) {
_data.writeInt(1);
dialupInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_updateDialupInfoOne, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean updateDialupInfoAll(int type, java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> dialupInfoList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeTypedList(dialupInfoList);
mRemote.transact(Stub.TRANSACTION_updateDialupInfoAll, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.honda.displayaudio.system.telemainfo.DialupInfo getDialupInfoOne(int type, int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.honda.displayaudio.system.telemainfo.DialupInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_getDialupInfoOne, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.honda.displayaudio.system.telemainfo.DialupInfo.CREATOR.createFromParcel(_reply);
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
@Override public java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> getDialupInfoAll(int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_getDialupInfoAll, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(com.honda.displayaudio.system.telemainfo.DialupInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.honda.displayaudio.system.telemainfo.DialupInfo getCurrentDialupInfo(int func) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.honda.displayaudio.system.telemainfo.DialupInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(func);
mRemote.transact(Stub.TRANSACTION_getCurrentDialupInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.honda.displayaudio.system.telemainfo.DialupInfo.CREATOR.createFromParcel(_reply);
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
@Override public boolean selectDialupInfo(int func, int type, int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(func);
_data.writeInt(type);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_selectDialupInfo, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean deleteDialupInfoOne(int type, int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_deleteDialupInfoOne, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean deleteDialupInfoAll(int type) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
mRemote.transact(Stub.TRANSACTION_deleteDialupInfoAll, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.honda.displayaudio.system.telemainfo.LUFInfo getLUFInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.honda.displayaudio.system.telemainfo.LUFInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLUFInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.honda.displayaudio.system.telemainfo.LUFInfo.CREATOR.createFromParcel(_reply);
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
@Override public java.lang.String getProvisioningFileName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProvisioningFileName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean initProvisioningFile() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_initProvisioningFile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getProvisioningFileUpdateTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProvisioningFileUpdateTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setProvisioningFileUpdateTime(long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_setProvisioningFileUpdateTime, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getDialupUpdateTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDialupUpdateTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDialupUpdateTime(long time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(time);
mRemote.transact(Stub.TRANSACTION_setDialupUpdateTime, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getLocationUploadStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLocationUploadStatus, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setLocationUploadStatus(boolean status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((status)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setLocationUploadStatus, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean startUsingNetworkTCU() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startUsingNetworkTCU, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean stopUsingNetworkTCU() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopUsingNetworkTCU, _data, _reply, 0);
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
static final int TRANSACTION_addDialupInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_updateDialupInfoOne = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_updateDialupInfoAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getDialupInfoOne = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getDialupInfoAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getCurrentDialupInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_selectDialupInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_deleteDialupInfoOne = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_deleteDialupInfoAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getLUFInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getProvisioningFileName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_initProvisioningFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getProvisioningFileUpdateTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setProvisioningFileUpdateTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getDialupUpdateTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_setDialupUpdateTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getLocationUploadStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setLocationUploadStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_startUsingNetworkTCU = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_stopUsingNetworkTCU = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
}
public boolean addDialupInfo(int type, java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> dialupInfoList) throws android.os.RemoteException;
public boolean updateDialupInfoOne(int type, com.honda.displayaudio.system.telemainfo.DialupInfo dialupInfo, int index) throws android.os.RemoteException;
public boolean updateDialupInfoAll(int type, java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> dialupInfoList) throws android.os.RemoteException;
public com.honda.displayaudio.system.telemainfo.DialupInfo getDialupInfoOne(int type, int index) throws android.os.RemoteException;
public java.util.List<com.honda.displayaudio.system.telemainfo.DialupInfo> getDialupInfoAll(int type) throws android.os.RemoteException;
public com.honda.displayaudio.system.telemainfo.DialupInfo getCurrentDialupInfo(int func) throws android.os.RemoteException;
public boolean selectDialupInfo(int func, int type, int index) throws android.os.RemoteException;
public boolean deleteDialupInfoOne(int type, int index) throws android.os.RemoteException;
public boolean deleteDialupInfoAll(int type) throws android.os.RemoteException;
public com.honda.displayaudio.system.telemainfo.LUFInfo getLUFInfo() throws android.os.RemoteException;
public java.lang.String getProvisioningFileName() throws android.os.RemoteException;
public boolean initProvisioningFile() throws android.os.RemoteException;
public long getProvisioningFileUpdateTime() throws android.os.RemoteException;
public void setProvisioningFileUpdateTime(long time) throws android.os.RemoteException;
public long getDialupUpdateTime() throws android.os.RemoteException;
public void setDialupUpdateTime(long time) throws android.os.RemoteException;
public boolean getLocationUploadStatus() throws android.os.RemoteException;
public boolean setLocationUploadStatus(boolean status) throws android.os.RemoteException;
public boolean startUsingNetworkTCU() throws android.os.RemoteException;
public boolean stopUsingNetworkTCU() throws android.os.RemoteException;
}

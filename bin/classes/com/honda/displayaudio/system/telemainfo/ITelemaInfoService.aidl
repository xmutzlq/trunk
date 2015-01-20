package com.honda.displayaudio.system.telemainfo;

import com.honda.displayaudio.system.telemainfo.DialupInfo;
import com.honda.displayaudio.system.telemainfo.LUFInfo;

interface ITelemaInfoService {
	boolean addDialupInfo(int type, in List<DialupInfo> dialupInfoList);
	boolean updateDialupInfoOne(int type, in DialupInfo dialupInfo, int index);
	boolean updateDialupInfoAll(int type, in List<DialupInfo> dialupInfoList);
	DialupInfo getDialupInfoOne(int type, int index);
	List<DialupInfo> getDialupInfoAll(int type);
	DialupInfo getCurrentDialupInfo(int func);
	boolean selectDialupInfo(int func, int type, int index);
	boolean deleteDialupInfoOne(int type, int index);
	boolean deleteDialupInfoAll(int type);
	LUFInfo getLUFInfo();
	String getProvisioningFileName();
	boolean initProvisioningFile();
	long getProvisioningFileUpdateTime();
	void setProvisioningFileUpdateTime(long time);
	long getDialupUpdateTime();
	void setDialupUpdateTime(long time);
	boolean getLocationUploadStatus();
	boolean setLocationUploadStatus(boolean status);
	boolean startUsingNetworkTCU();
	boolean stopUsingNetworkTCU();
}
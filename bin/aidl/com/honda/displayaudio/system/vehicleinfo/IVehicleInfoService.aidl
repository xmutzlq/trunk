package com.honda.displayaudio.system.vehicleinfo;

import com.honda.displayaudio.system.vehicleinfo.IVehicleInfoCallBacks;

interface IVehicleInfoService {
	void registAutoJudgeCallBack(in IVehicleInfoCallBacks callbacks);
	void unregistAutoJudgeCallBack(in IVehicleInfoCallBacks callbacks);
	int runningRegulation();
	int runningRegulationPark();
	String getVinNumber();
	String getSerialNumber();
	int getDayNightStatus();
	String getNaviDataPath();
	int getScreenOffStatus();
	String getUSBMemPath(int portNumber);
}
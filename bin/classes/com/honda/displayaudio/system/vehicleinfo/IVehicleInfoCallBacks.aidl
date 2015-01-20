package com.honda.displayaudio.system.vehicleinfo;

interface IVehicleInfoCallBacks {
	void onReceiveAutoJudge(int regulation);
	void onReceiveAutoJudgePark(int regulation);
	void onSensorChanged(int sensor, long uptimemillis, float values1, float values2,
											float values3, float values4, float values5);
	void onReceiveDayNightStatus(int status);
	void onReceiveScreenOffStatus(int status);
}
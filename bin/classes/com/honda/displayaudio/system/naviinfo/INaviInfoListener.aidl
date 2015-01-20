package com.honda.displayaudio.system.naviinfo;

import com.honda.displayaudio.system.naviinfo.LocationInfo;
import com.honda.displayaudio.system.naviinfo.TimeZoneInfo;

interface INaviInfoListener{
	void onLocationUpdated(in LocationInfo info);
	void onTimeZoneUpdated(in TimeZoneInfo info);
}

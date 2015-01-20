package com.honda.displayaudio.system.naviinfo;

import com.honda.displayaudio.system.naviinfo.ConfigParam;
import com.honda.displayaudio.system.naviinfo.LocationInfo;
import com.honda.displayaudio.system.naviinfo.TimeZoneInfo;

interface INaviInfoSuplier {
	boolean configureNotification(in ConfigParam param);
	boolean setCurrentLocation(in LocationInfo info);
	boolean setCurrentTimeZone(in TimeZoneInfo info);
}

package com.honda.displayaudio.system.naviinfo;

import com.honda.displayaudio.system.naviinfo.INaviInfoListener;
import com.honda.displayaudio.system.naviinfo.ConfigParam;
import com.honda.displayaudio.system.naviinfo.LocationInfo;
import com.honda.displayaudio.system.naviinfo.TimeZoneInfo;

interface INaviInfoProvider {
	ConfigParam getConfigration();
	LocationInfo getCurrentLocation();
	TimeZoneInfo getCurrentTimeZone();
	boolean addListener(in INaviInfoListener listener);
	boolean removeListener(in INaviInfoListener listener);
}

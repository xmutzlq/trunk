package com.honda.displayaudio.system.meter;
import com.honda.displayaudio.system.meter.ITBTInformationCallback;
import com.honda.displayaudio.system.meter.GuidDispDemand;
import com.honda.displayaudio.system.meter.NavGuide;
import com.honda.displayaudio.system.meter.NavCurrent;

/**
 * an IPC Service interface used by TBTInfomationService.
 */
interface ITBTInfomation
{
	boolean registerCallback(in ITBTInformationCallback cb);
	boolean unregisterCallback(in ITBTInformationCallback cb);
	boolean isEnabled();
	boolean setGuidDispDemand(in GuidDispDemand data);
	boolean setNavGuide(in NavGuide data);
	boolean setNavCurrent(in NavCurrent data);
	int getStatus();
	boolean setNavigationStatus(in boolean enabled);
}

package com.honda.displayaudio.system.speech;
import com.honda.displayaudio.system.speech.IVRStatusCallback;
/**
 * an IPC Service interface used by VRStatus.
 */
interface IVRStatus
{
	boolean registerCallback(in IVRStatusCallback cb);
	boolean unregisterCallback(in IVRStatusCallback cb);
	boolean isEnabled();
	boolean startControl();
	boolean endControl();
	int getIconStatus();
	boolean setIconStatus(in int status);
	int getAirConMode();
	boolean setAirConMode(in int status);
	int getMicMode();
	boolean setMicMode(in int status);
	boolean getBooleanSetting(in String name);
}

package com.honda.displayaudio.system.traffic;
import com.honda.displayaudio.system.traffic.IFMMControlCallback;
/**
 * an IPC Service interface used by TrafficFMMService.
 */
interface IFMMControl
{
	boolean registerCallback(in IFMMControlCallback cb);
	boolean unregisterCallback(in IFMMControlCallback cb);
	boolean setFrequency(float freq);
	boolean requestStatus(); 
}

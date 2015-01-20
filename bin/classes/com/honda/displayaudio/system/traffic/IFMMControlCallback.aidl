package com.honda.displayaudio.system.traffic;
/**
 * a callback interface used by TrafficService.
 */
interface IFMMControlCallback
{
	void onDataUpdated( in byte[] data, int len );
	void onStatusUpdated( float frequency, int signal);
}

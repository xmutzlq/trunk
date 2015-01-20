package com.honda.displayaudio.system.beacon;
/**
 * a callback interface used by beaconService.
 */
interface IBCNControlCallback
{
	void onDataUpdated( in byte[] data, int len );
}

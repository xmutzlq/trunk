package com.honda.displayaudio.system.beacon;

import com.honda.displayaudio.system.beacon.IBCNControlCallback;
/**
 * an IPC Service interface used by beaconService.
 */
interface IBCNControl
{
	boolean registerCallback(in IBCNControlCallback cb);
	boolean unregisterCallback(in IBCNControlCallback cb);
	int getConnectStatus();
	boolean requestSelfCheck(); 
}

package com.honda.displayaudio.system.traffic;

import com.honda.displayaudio.system.traffic.HdTrafficServiceInfo;

interface IHdTrafficCallBacks
{
	void gridCb(
	    int lowFrequency,
	    int highFrequency,
	    int spacing
	);
	void requestGridInfoCb();
	void scanProgressCb(
	    int percent
	);
	void serviceListCb(
	    in List<HdTrafficServiceInfo> serviceList
	);
	void signalStrengthThresholdCb(
	    int poorThreshold,		// Minimum RSSI for poor reception = 1 bar
	    int weekThreshold,		// Minimum RSSI for weak reception = 2 bars
	    int marginalThreshold,	// Minimum RSSI for marginal reception = 3 bars
	    int strongThreshold,	// Minimum RSSI for strong reception = 4 bars
	    int veryStrongThreshold	// Minimum RSSI for very strong reception = 5 bars
	);
	void statusCb(
	    int state,
	    int signalStrength,
	    int frequency
	);
	void aasPortEnabledCb();
	void aasDataCb(
	    int portNumber,
	    int sequenceNumber,
	    in byte[] payloadData
	);

}

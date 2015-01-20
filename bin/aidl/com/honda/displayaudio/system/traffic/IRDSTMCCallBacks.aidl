package com.honda.displayaudio.system.traffic;
import com.honda.displayaudio.system.traffic.RdsGroup;
import com.honda.displayaudio.system.traffic.RDSTMCServiceInfo;

interface IRDSTMCCallBacks
{
	void gridCb(
	    int lowFrequency,
	    int highFrequency,
	    int spacing
	);
	void rdsGroupCb(
	    in RdsGroup rdsGroup
	);
	void requestCountryInfoCb();
	void scanProgressCb(
	    int percent
	);
	void serviceListCb(
	    int serviceCount,
	    in List<RDSTMCServiceInfo> serviceList
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
	    boolean rdsCarrier,
	    int signalStrength,
	    int frequency
	);
	void tunedServiceCb(
	    in RDSTMCServiceInfo service
	);
}

package com.honda.displayaudio.system.traffic;

import com.honda.displayaudio.system.traffic.IHdTrafficCallBacks;

interface IHdTrafficService
{
	void registerHdTrafficCallBacks(
		in IHdTrafficCallBacks iHdTrafficCallBacks
	);
	void unregisterHdTrafficCallBacks(
		in IHdTrafficCallBacks iHdTrafficCallBacks
	);
	void clearServiceList();
	void getSignalStrengthThresholds();
	void getStatus();
	void scan();
	void setGrid(
	    boolean isHdSupported,
	    int lowFrequency,
	    int highFrequency,
	    int spacing
	);
	void setServices(
	    int parseResult,
	    in int[] portList
	);
	void tune(
	    int frequency
	);
	void notifyAasDataResult(
	    int portNumber,
	    int sequenceNumber,
	    boolean hasTraffic
	);
	void notifyHdAlternateFrequency(
	    int frequency
	);

}

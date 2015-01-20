package com.honda.displayaudio.system.traffic;

import com.honda.displayaudio.system.traffic.IRDSTMCCallBacks;
import com.honda.displayaudio.system.traffic.LtnSid;
import com.honda.displayaudio.system.traffic.RDSTMCServiceInfo;

interface IRDSTMCService
{
	void registRDSTMCCallBacks(
	    IRDSTMCCallBacks iRDSTMCCallBacks
	);
	void unregistRDSTMCCallBacks(
	    IRDSTMCCallBacks iRDSTMCCallBacks
	);
	void clearServiceList();
	void getServices();
	void getSignalStrengthThresholds();
	void getStatus();
	void inhibitFrequency(
	    int frequency
	);
	void scan();
	void setCountry(
	    int countryCode,
	    int countryCodeEx,
	    boolean isRbds,
	    int ltnSidCount,
	    in List<LtnSid> ltnSidList
	);
	void setGrid(
	    int lowFrequency,
	    int highFrequency,
	    int spacing
	);
	void setServices(
	    int serviceCount,
	    in List<RDSTMCServiceInfo> serviceList
	);
	void tune(
	    int frequency
	);
}

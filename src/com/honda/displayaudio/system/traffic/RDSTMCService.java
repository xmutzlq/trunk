package com.honda.displayaudio.system.traffic;

import java.util.List;

import android.os.RemoteException;

public class RDSTMCService extends IRDSTMCService.Stub

{

	@Override
	public void registRDSTMCCallBacks(IRDSTMCCallBacks iRDSTMCCallBacks)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregistRDSTMCCallBacks(IRDSTMCCallBacks iRDSTMCCallBacks)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearServiceList() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getServices() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSignalStrengthThresholds() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getStatus() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inhibitFrequency(int frequency) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCountry(int countryCode, int countryCodeEx, boolean isRbds,
			int ltnSidCount, List<LtnSid> ltnSidList) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGrid(int lowFrequency, int highFrequency, int spacing)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServices(int serviceCount,
			List<RDSTMCServiceInfo> serviceList) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tune(int frequency) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}

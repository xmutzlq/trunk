package com.honda.displayaudio.system.traffic;

import android.os.RemoteException;

public class HDTrafficService extends IHdTrafficService.Stub
{

	@Override
	public void registerHdTrafficCallBacks(
			IHdTrafficCallBacks iHdTrafficCallBacks) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterHdTrafficCallBacks(
			IHdTrafficCallBacks iHdTrafficCallBacks) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearServiceList() throws RemoteException {
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
	public void scan() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGrid(boolean isHdSupported, int lowFrequency,
			int highFrequency, int spacing) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServices(int parseResult, int[] portList)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tune(int frequency) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyAasDataResult(int portNumber, int sequenceNumber,
			boolean hasTraffic) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyHdAlternateFrequency(int frequency)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	

}

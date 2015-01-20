package com.honda.displayaudio.system.beacon;


import android.os.RemoteException;


public class BeaconService extends IBCNControl.Stub
{

	@Override
	public boolean registerCallback(IBCNControlCallback cb)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unregisterCallback(IBCNControlCallback cb)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getConnectStatus() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean requestSelfCheck() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	
}

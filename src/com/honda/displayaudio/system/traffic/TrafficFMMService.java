
package com.honda.displayaudio.system.traffic;

import android.os.RemoteException;


public class TrafficFMMService extends IFMMControl.Stub
{

	@Override
	public boolean registerCallback(IFMMControlCallback cb)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unregisterCallback(IFMMControlCallback cb)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setFrequency(float freq) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean requestStatus() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	
}

package com.honda.displayaudio.system.meter;

import android.content.Context;
import android.os.RemoteException;

public class TBTInfomationService extends ITBTInfomation.Stub {

	public TBTInfomationService(Context context) {
		super();
	}

	@Override
	public boolean registerCallback(ITBTInformationCallback cb)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unregisterCallback(ITBTInformationCallback cb)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setGuidDispDemand(GuidDispDemand data)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setNavGuide(NavGuide data) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setNavCurrent(NavCurrent data) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getStatus() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean setNavigationStatus(boolean enabled) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
}

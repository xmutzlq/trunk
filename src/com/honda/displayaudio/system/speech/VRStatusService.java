
package com.honda.displayaudio.system.speech;

import com.honda.displayaudio.system.*;
import android.content.Context;
import android.os.RemoteException;

public class VRStatusService extends IVRStatus.Stub
{
	public VRStatusService(Context context) {
		super();
	}
	
	@Override
	public boolean registerCallback(IVRStatusCallback cb)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unregisterCallback(IVRStatusCallback cb)
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
	public boolean startControl() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean endControl() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getIconStatus() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean setIconStatus(int status) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getAirConMode() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean setAirConMode(int status) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getMicMode() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean setMicMode(int status) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getBooleanSetting(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}

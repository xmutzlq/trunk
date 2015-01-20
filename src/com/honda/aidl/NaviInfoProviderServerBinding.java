package com.honda.aidl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

import com.honda.displayaudio.system.naviinfo.INaviInfoListener;
import com.honda.displayaudio.system.naviinfo.INaviInfoProvider;
import com.honda.displayaudio.system.naviinfo.LocationInfo;
import com.honda.displayaudio.system.naviinfo.TimeZoneInfo;

public class NaviInfoProviderServerBinding extends BaseServiceCallBack {
	private INaviInfoProvider mINaviInfoProvider;

	private static final String NAVI_INFO_SERVICE_ACTION = "com.honda.displayaudio.system.naviinfo.INaviInfoProvider";

	public NaviInfoProviderServerBinding(Context context) {
		super(context);
	}

	@Override
	public void onCreate() {
		Log.e("NaviInfoProviderServerBinding", "bindService");
		mContext.bindService(new Intent(getAction()), mServiceConnection,
				Context.BIND_AUTO_CREATE);
	}

	private INaviInfoListener.Stub mNaviInfoListener = new INaviInfoListener.Stub() {

		@Override
		public void onTimeZoneUpdated(final TimeZoneInfo info)
				throws RemoteException {
			runInUiThread(new Runnable() {
				@Override
				public void run() {
					Toast.makeText(mContext, "other app recive onTimeZoneUpdated= " + info.toString(),
							Toast.LENGTH_SHORT).show();
				}
			});
		}

		@Override
		public void onLocationUpdated(final LocationInfo info)
				throws RemoteException {
			runInUiThread(new Runnable() {
				@Override
				public void run() {
					Toast.makeText(mContext,
							"other app recive onLocationUpdated= " + info.toString(),
							Toast.LENGTH_SHORT).show();
				}
			});
		}
	};

	private void exitService() {
		try {
			if (mINaviInfoProvider != null) {
				mINaviInfoProvider.removeListener(mNaviInfoListener);
			}
		} catch (RemoteException e) {
		}

		if (mServiceConnection != null) {
			mContext.unbindService(mServiceConnection);
			mINaviInfoProvider = null;
		}
	}

	@Override
	public void onDestory() {
		exitService();
	}

	@Override
	void onActoinServiceDisconnected() {
		Log.e("NaviInfoProviderServerBinding", "onActoinServiceDisconnected");
		mNaviInfoListener = null;
	}

	@Override
	void onActionServiceConnected(IBinder service) {
		Log.e("NaviInfoProviderServerBinding", "onActionServiceConnected");
		mINaviInfoProvider = INaviInfoProvider.Stub.asInterface(service);
		if (mINaviInfoProvider != null) {
			try {
				mINaviInfoProvider.addListener(mNaviInfoListener);
				Log.e("NaviInfoProviderServerBinding", "registed");
			} catch (RemoteException e) {
			}
		}
	}

	@Override
	String getAction() {
		return NAVI_INFO_SERVICE_ACTION;
	}
}

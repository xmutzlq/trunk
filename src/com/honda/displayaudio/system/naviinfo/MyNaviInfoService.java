package com.honda.displayaudio.system.naviinfo;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;

public final class MyNaviInfoService extends Service {

	private static final String TAG = "NaviInfoService";

	private ConfigParam mConfigParam = null;

	private LocationInfo mLocationInfo = null;

	private TimeZoneInfo mTimeZoneInfo = null;

	private Handler mHandler = new Handler(Looper.getMainLooper()){};

	private RemoteCallbackList<INaviInfoListener> mListeners = new RemoteCallbackList<INaviInfoListener>();

	private NaviInfoProvider mNaviInfoProvider = new NaviInfoProvider();

	private NaviInfoSuplier mNaviInfoSuplier = new NaviInfoSuplier();

	public MyNaviInfoService() {
		super();
	}


	@Override
	public void onCreate() {
		Log.i(TAG, "onCreate");
		mConfigParam = new ConfigParam(0, 0, null, true, true, true, true, true, true, true, 0);
		mLocationInfo = new LocationInfo(0, 0, 0, 0, 0, 0);
		mTimeZoneInfo = new TimeZoneInfo();
	}

	@Override
	public IBinder onBind(Intent intent) {
		if(INaviInfoProvider.class.getName().equals(intent.getAction())) {
			return mNaviInfoProvider;
		}
		else if(INaviInfoSuplier.class.getName().equals(intent.getAction())) {
			return mNaviInfoSuplier;
		}
		else{
		}
		return null;
	}

	@Override
	public void onDestroy() {
		Log.i(TAG,"onDestroy");
	}

	public boolean configureNotification(ConfigParam param) {
		if(param != null){
			mConfigParam = param;
			return true;
		}
		return false;
	}

	public boolean setCurrentLocation(LocationInfo info) {
		if(info != null){
			mLocationInfo = info;
			return true;
		}
		return false;
	}

	public boolean setCurrentTimeZone(TimeZoneInfo info) {
		if(info != null){
			mTimeZoneInfo = info;
			return true;
		}
		return false;
	}

	public ConfigParam getConfigration() {
		return mConfigParam;
	}

	public LocationInfo getCurrentLocation() {
		return mLocationInfo;
	}

	public TimeZoneInfo getCurrentTimeZone() {
		return mTimeZoneInfo;
	}

	public boolean addListener(INaviInfoListener listener) {
		if(listener != null){
			mListeners.register(listener);
			return true;
		}
		return false;
	}

	public boolean removeListener(INaviInfoListener listener) {
		if(listener != null){
			mListeners.unregister(listener);
			return true;
		}
		return false;
	}

	private boolean checkUpdateLocation(LocationInfo newInfo) {
		if(mLocationInfo != newInfo){
			mHandler.post(new Runnable() {

				@Override
				public void run() {
					sendTo(mLocationInfo, null);
				}
			});
			return true;
		}
		return false;
	}

	private boolean checkUpdateTimeZone(TimeZoneInfo newInfo) {
		if(mTimeZoneInfo != newInfo){
			mHandler.post(new Runnable() {

				@Override
				public void run() {
					sendTo(mLocationInfo, null);
				}
			});
			return true;
		}
		return false;
	}

	private boolean checkUpdateCountryCode(LocationInfo newInfo) {
		return false;
	}

	private boolean checkUpdateAddress(LocationInfo newInfo) {
		return false;
	}

	private boolean checkUpdateRoadAttribute(LocationInfo newInfo) {
		return false;
	}

	private boolean checkUpdateSubdivisionCode(LocationInfo newInfo) {
		return false;
	}

	private boolean checkUpdateMapCode(LocationInfo newInfo) {
		return false;
	}

	private final class NaviInfoProvider extends INaviInfoProvider.Stub {
		private static final String TAG = "NaviInfoService.NaviInfoProvider";

		public NaviInfoProvider() {
		}

		@Override
		public ConfigParam getConfigration() {
			return MyNaviInfoService.this.getConfigration();
		}

		@Override
		public LocationInfo getCurrentLocation() {
			return MyNaviInfoService.this.getCurrentLocation();
		}

		@Override
		public TimeZoneInfo getCurrentTimeZone() {
			return MyNaviInfoService.this.getCurrentTimeZone();
		}

		@Override
		public boolean addListener(INaviInfoListener listener) {
			return MyNaviInfoService.this.addListener(listener);
		}

		@Override
		public boolean removeListener(INaviInfoListener listener) {
			return MyNaviInfoService.this.removeListener(listener);
		}
	}

	private final class NaviInfoSuplier extends INaviInfoSuplier.Stub {
		private static final String TAG = "NaviInfoService.NaviInfoSuplier";

		public NaviInfoSuplier() {
		}

		@Override
		public boolean configureNotification(ConfigParam param) {
			return MyNaviInfoService.this.configureNotification(param);
		}

		@Override
		public boolean setCurrentLocation(LocationInfo info) {
			checkUpdateLocation(info);
			return MyNaviInfoService.this.setCurrentLocation(info);
		}

		@Override
		public boolean setCurrentTimeZone(TimeZoneInfo info) {
			checkUpdateTimeZone(info);
			return MyNaviInfoService.this.setCurrentTimeZone(info);
		}
	}

	private void sendTo(LocationInfo linfo, TimeZoneInfo tinfo) {
		int tag = -1;
		if(linfo != null){
			tag = 0;
		}

		if(tinfo != null){
			tag = 1;
		}

		if(tag == -1){
			return;
		}

		int N = mListeners.beginBroadcast();
		try {
			for (int i = 0; i < N; i++) {
				switch (tag) {
				case 0:
					mListeners.getBroadcastItem(i).onLocationUpdated(linfo);
					break;
				case 1:
					mListeners.getBroadcastItem(i).onTimeZoneUpdated(tinfo);
					break;
				}
			}
		} catch (RemoteException e) {
		}
		mListeners.finishBroadcast();
	}
}

package com.honda.displayaudio.system.telemainfo;

import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import android.app.Service;
import android.content.Intent;

public class TelemaInfoService extends Service {
	final static String TAG = "TelemaInfoService";
	
	//明示的コンストラクタ
	public TelemaInfoService() {
		super();
	}
	
	@Override
	public void onCreate() {
		Log.i(TAG, "onCreate");
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		return binder;
	}
	@Override
	public void onDestroy() {
		Log.i(TAG,"onDestroy");
	}

	private ITelemaInfoService.Stub binder = new ITelemaInfoService.Stub() {
		public boolean addDialupInfo(int type, List<DialupInfo> dialupInfoList) {
			return false;
		}

		public boolean updateDialupInfoOne(int type, DialupInfo dialupInfo, int index) {
			return false;
		}

		public boolean updateDialupInfoAll(int type, List<DialupInfo> dialupInfoList) {
			return false;
		}

		public DialupInfo getDialupInfoOne(int type, int index) {
			return null;
		}

		public List<DialupInfo> getDialupInfoAll(int type) {
			return null;
		}

		public DialupInfo getCurrentDialupInfo(int func) {
			return null;
		}

		public boolean selectDialupInfo(int func, int type, int index) {
			return false;
		}

		public boolean deleteDialupInfoOne(int type, int index) {
			return false;
		}

		public boolean deleteDialupInfoAll(int type) {
			return false;
		}

		public LUFInfo getLUFInfo() {
			return null;
		}

		public String getProvisioningFileName() {
			return "";
		}

		public boolean initProvisioningFile() {
			return false;
		}

		public long getProvisioningFileUpdateTime() {
			return 0;
		}

		public void setProvisioningFileUpdateTime(long time) {
		}

		public long getDialupUpdateTime() {
			return 0;
		}

		public void setDialupUpdateTime(long time) {
		}

		public boolean getLocationUploadStatus() {
			return false;
		}

		public boolean setLocationUploadStatus(boolean status) {
			return false;
		}

		public boolean startUsingNetworkTCU() {
			return false;
		}

		public boolean stopUsingNetworkTCU() {
			return false;
		}
	};
}

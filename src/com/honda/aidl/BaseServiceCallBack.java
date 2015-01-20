package com.honda.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;

/**
 * ServiceConnection 回调
 * 
 * @author liqin.zeng
 */
public abstract class BaseServiceCallBack implements ServiceBindable {

	protected Context mContext;
	protected ServiceConnection mServiceConnection;
	private Handler mHandler;

	public BaseServiceCallBack(Context context) {
		mContext = context;
		mHandler = new Handler(Looper.getMainLooper());
		init();
	}

	protected void onIninit() {
	};

	private void init() {
		onIninit();
		mServiceConnection = new ServiceConnection() {

			@Override
			public void onServiceDisconnected(ComponentName name) {
				onActoinServiceDisconnected();
			}

			@Override
			public void onServiceConnected(ComponentName name, IBinder service) {
				onActionServiceConnected(service);
			}
		};
	}

	public void runInUiThread(Runnable runnable) {
		if (runnable == null) {
			return;
		}
		mHandler.post(runnable);
	}

	abstract void onActoinServiceDisconnected();

	abstract void onActionServiceConnected(IBinder service);

	abstract String getAction();
}

package com.honda.displayaudio.system.vehicleinfo;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;

public class VehicleInfoService extends Service {

	private boolean isStart;
	int dayNightState = 0; // default
	int times = 0;

	private static final int REPORT_MSG = 1;

	/**
	 * Our Handler used to execute operations on the main thread. This is used
	 * to schedule increments of our value.
	 */
	private final Handler mHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {

			// It is time to bump the value!
			case REPORT_MSG: {
				sendTo(2);
				times++;
				if (times >= 10 && times < 20) {
					dayNightState = 1;
				} else if (times == 50) {
					times = 0;
					dayNightState = 0;
				} else {
					dayNightState = 0;
				}
				Log.e("VehicleInfoService", "times = " + times);

				// Repeat every 1 second.
				if (isStart) {
					sendMessageDelayed(obtainMessage(REPORT_MSG), 1 * 1000);
				}
			}
			break;
			default:
				super.handleMessage(msg);
			}
		}
	};

	private final RemoteCallbackList<IVehicleInfoCallBacks> aidlActivityCmd = new RemoteCallbackList<IVehicleInfoCallBacks>();

	// Binder
	private final IVehicleInfoService.Stub mIVehicleInfoService = new IVehicleInfoService.Stub() {
		@Override
		public void registAutoJudgeCallBack(IVehicleInfoCallBacks callbacks) {
			VehicleInfoService.this.registAutoJudgeCallBack(callbacks);
		}

		@Override
		public void unregistAutoJudgeCallBack(IVehicleInfoCallBacks callbacks) {
			VehicleInfoService.this.unregistAutoJudgeCallBack(callbacks);
		}

		@Override
		public int runningRegulation() {
			return VehicleInfoService.this.runningRegulation();
		}

		@Override
		public int runningRegulationPark() {
			return VehicleInfoService.this.runningRegulationPark();
		}

		@Override
		public String getVinNumber() {
			return VehicleInfoService.this.getVinNumber();
		}

		@Override
		public String getSerialNumber() {
			return VehicleInfoService.this.getSerialNumber();
		}

		@Override
		public int getDayNightStatus() {
			return dayNightState;
		}

		@Override
		public String getNaviDataPath() {
			return VehicleInfoService.this.getNaviDataPath();
		}

		@Override
		public int getScreenOffStatus() {
			return VehicleInfoService.this.getScreenOffStatus();
		}

		@Override
		public String getUSBMemPath(int portNumber) {
			return VehicleInfoService.this.getUSBMemPath(portNumber);
		}
	};

	public VehicleInfoService() {
		super();
	}

	@Override
	public void onCreate() {
		super.onCreate();
		isStart = true;
		runSendTo();

	}

	@Override
	public IBinder onBind(Intent intent) {
		IBinder ret = null;

		// IVehicleInfoServiceの場合だけ、対応するBinderを返却
		if (IVehicleInfoService.class.getName().equals(intent.getAction())) {
			ret = mIVehicleInfoService;
		}

		return ret;
	}

	@Override
	public void onDestroy() {
		isStart = false;
	}

	public void registAutoJudgeCallBack(IVehicleInfoCallBacks callbacks) {
		aidlActivityCmd.register(callbacks);
	}

	public void unregistAutoJudgeCallBack(IVehicleInfoCallBacks callbacks) {
		aidlActivityCmd.unregister(callbacks);
	}

	public int runningRegulation() {
		// 無規制状態固定で返却
		return VehicleInfoConstants.DRIVER_DISTRACTION_STOP;
	}

	public int runningRegulationPark() {
		// 無規制状態固定で返却
		return VehicleInfoConstants.DRIVER_DISTRACTION_STOP;
	}

	public String getVinNumber() {
		// 固定で返却
		return "000000";
	}

	public String getSerialNumber() {
		// 固定で返却
		return "000000";
	}

	public int getDayNightStatus() {
		// 昼固定で返却
		return VehicleInfoConstants.DAYNIGHT_INFO_DAY;
	}

	public String getNaviDataPath() {
		// "/map"固定で返却
		return "/map";
	}

	public int getScreenOffStatus() {
		// 画面OFF非表示中固定で返却
		return VehicleInfoConstants.SCREENOFF_OFF;
	}

	public String getUSBMemPath(int portNumber) {
		String ret = null;

		switch (portNumber) {
		case 1:
			ret = "/usb1";
			break;

		case 2:
			ret = "/usb2";
			break;

		default:
			// 無処理
			break;
		}

		return ret;
	}

	private void runSendTo() {
		mHandler.sendEmptyMessage(REPORT_MSG);
	}

	/**
	 * 发送到接受端 0：onReceiveAutoJudge 1：onReceiveAutoJudgePark
	 * 2：onReceiveDayNightStatus 3：onReceiveScreenOffStatus 4：onSensorChanged
	 * 
	 * @param tag
	 * @throws RemoteException
	 */
	private void sendTo(int tag) {
		int N = aidlActivityCmd.beginBroadcast();
		try {
			for (int i = 0; i < N; i++) {
				switch (tag) {
				case 0:
					aidlActivityCmd.getBroadcastItem(i).onReceiveAutoJudge(
							VehicleInfoConstants.DRIVER_DISTRACTION_STOP);
					Log.e("VehicleInfoService", "onReceiveAutoJudge");
					break;
				case 1:
					aidlActivityCmd.getBroadcastItem(i).onReceiveAutoJudgePark(
							VehicleInfoConstants.DRIVER_DISTRACTION_STOP);
					Log.e("VehicleInfoService", "onReceiveAutoJudgePark");
					break;
				case 2:
					//					aidlActivityCmd.getBroadcastItem(i)
					//							.onReceiveDayNightStatus(dayNightState);
					//					Log.e("VehicleInfoService", "onReceiveDayNightStatus");
					break;
				case 3:
					aidlActivityCmd.getBroadcastItem(i)
					.onReceiveScreenOffStatus(
							VehicleInfoConstants.SCREENOFF_OFF);
					Log.e("VehicleInfoService", "onReceiveScreenOffStatus");
					break;
				case 4:
					aidlActivityCmd.getBroadcastItem(i).onSensorChanged(0,
							500L, 1, 2, 3, 4, 5);
					Log.e("VehicleInfoService", "onSensorChanged");
					break;
				}
			}
		} catch (RemoteException e) {
		}
		aidlActivityCmd.finishBroadcast();
	}
}

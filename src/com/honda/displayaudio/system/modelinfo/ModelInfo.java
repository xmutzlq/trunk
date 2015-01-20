package com.honda.displayaudio.system.modelinfo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ModelInfo extends Service {
	// Binder
	private IModelInfo.Stub mIModelInfo = new IModelInfo.Stub() {
		public int[] getDestinations() {
			return ModelInfo.this.getDestinations();
		}

		public String getPartsNumber() {
			return ModelInfo.this.getPartsNumber();
		}

		public int getBrand() {
			return ModelInfo.this.getBrand();
		}

		public int getNavigationType() {
			return ModelInfo.this.getNavigationType();
		}
		
		public int getEngineType() {
			return ModelInfo.this.getEngineType();
		}
	};

	public ModelInfo() {
		super();
	}

	public IBinder onBind(Intent intent) {
		IBinder ret = null;
		
		// IModelInfoの場合だけ、対応するBinderを返却
		if (IModelInfo.class.getName().equals(intent.getAction())) {
			ret = mIModelInfo;
		}
		
		return ret;
	}

	@Override
	public void onDestroy() {

	}

	public int[] getDestinations() {
		// 固定で返却
		int[] ret = { 1, 2, 3, 4, 5, 6, 7 };
		
		return ret;
	}

	public String getPartsNumber() {
		// 外部IFの例として記載されている値を返却
		return "39100-T6NA-A001-010";
	}

	public int getBrand() {
		// Honda固定で返却
		return 1;
	}

	public int getNavigationType() {
		// DA+固定で返却
		return 0;
	}

	public int getEngineType() {
		// GAS固定で返却
		return 0;
	}
}

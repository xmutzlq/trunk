package com.honda.displayaudio.system.telemainfo;

import android.os.Parcel;
import android.os.Parcelable;

public class LUFInfo implements Parcelable {
	private String imei;
	private String phonenum;

	LUFInfo(String imei, String phonenum) {
		this.imei = imei;
		this.phonenum = phonenum;
	}

	public String getImei() {
		return imei;
	}

	public String getPhoneNum() {
		return phonenum;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel in, int flags) {
		in.writeString(imei);
		in.writeString(phonenum);
	}

	public static final Parcelable.Creator<LUFInfo> CREATOR = new Parcelable.Creator<LUFInfo>() {
		@Override
		public LUFInfo createFromParcel(Parcel in) {
			LUFInfo lufInfo = new LUFInfo("", "");
			lufInfo.imei = in.readString();
			lufInfo.phonenum = in.readString();
			return lufInfo;
		}

		@Override
		public LUFInfo[] newArray(int size) {
			return new LUFInfo[size];
		}
	};
}

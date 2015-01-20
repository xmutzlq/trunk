package com.honda.displayaudio.system.naviinfo;

import android.util.Log;
import android.os.Parcelable;
import android.os.Parcel;

public final class TimeZoneInfo implements Cloneable, Parcelable {

	private static final String TAG = "TimeZoneInfo";

	private String mId = "";

	private int mRawOffset = 0;

	public static final Parcelable.Creator<TimeZoneInfo> CREATOR = new Parcelable.Creator<TimeZoneInfo>(){
		@Override
		public TimeZoneInfo createFromParcel(Parcel in) {
			return new TimeZoneInfo(in);
		}
		@Override
		public TimeZoneInfo[] newArray(int size) {
			return new TimeZoneInfo[size];
		}
	};

	public TimeZoneInfo() {

	}

	public boolean setID(String id) {
		return false;
	}

	public String getID() {
		return mId;
	}

	public boolean setRawOffset(int offset) {
		return false;
	}

	public int getRawOffset() {
		return mRawOffset;
	}

	public String[] getAvailableIDs() {
		return java.util.TimeZone.getAvailableIDs();
	}

	private TimeZoneInfo(Parcel in) {
		mId = in.readString();
		mRawOffset = in.readInt();
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel in, int flags) {
		in.writeString(mId);
		in.writeInt(mRawOffset);
	}
}

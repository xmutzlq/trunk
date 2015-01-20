package com.honda.displayaudio.system.naviinfo;

import android.util.Log;
import android.os.Parcelable;
import android.os.Parcel;

public final class ConfigParam implements Cloneable, Parcelable {

	private static final String TAG = "ConfigParam";
	private int mUpdateTiming = 0;

	private int mUpdateDistance = 0;

	private String mMapVersion = "";

	private boolean mNotificationLocation = false;

	private boolean mNotificationTimeZone = false;

	private boolean mNotificationCountryCode = false;

	private boolean mNotificationAddress = false;

	private boolean mNotificationRoadAttribute = false;

	private boolean mNotificationSubdivisionCode = false;

	private boolean mNotificationMapCode = false;

	private int mExtraType = 0;

	public ConfigParam(int updateTiming, int updateDistance, String mapVersion, boolean location, boolean timezone, boolean country, boolean address, boolean roadAttribute, boolean subdivisionCode, boolean mapCode, int extraType) {
	}

	public int getUpdateTiming() {
		return mUpdateTiming;
	}

	public int getUpdateDistance() {
		return mUpdateDistance;
	}

	public String getMapVersion() {
		return mMapVersion;
	}

	public boolean supportsLocation() {
		return mNotificationLocation;
	}

	public boolean supportsTimeZone() {
		return mNotificationTimeZone;
	}

	public boolean supportsCountryCode() {
		return mNotificationCountryCode;
	}

	public boolean supportsAddress() {
		return mNotificationAddress;
	}

	public boolean supportsRoadAttribute() {
		return mNotificationRoadAttribute;
	}

	public boolean supportsSubdivisionCode() {
		return mNotificationSubdivisionCode;
	}

	public boolean supportsMapCode() {
		return mNotificationMapCode;
	}

	public int getExtraType() {
		return mExtraType;
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel in, int flags) {
		in.writeInt(mUpdateTiming);
		in.writeInt(mUpdateDistance);
		in.writeString(mMapVersion);
		in.writeByte((byte) (mNotificationLocation ? 1 : 0));
		in.writeByte((byte) (mNotificationTimeZone ? 1 : 0));
		in.writeByte((byte) (mNotificationCountryCode ? 1 : 0));
		in.writeByte((byte) (mNotificationAddress ? 1 : 0));
		in.writeByte((byte) (mNotificationRoadAttribute ? 1 : 0));
		in.writeByte((byte) (mNotificationSubdivisionCode ? 1 : 0));
		in.writeByte((byte) (mNotificationMapCode ? 1 : 0));
		in.writeInt(mExtraType);
	}

	public static final Parcelable.Creator<ConfigParam> CREATOR = new Parcelable.Creator<ConfigParam>() {
		@Override
		public ConfigParam createFromParcel(Parcel in) {
			return new ConfigParam(in);
		}
		@Override
		public ConfigParam[] newArray(int size) {
			return new ConfigParam[size];
		}
	};

	private ConfigParam(Parcel in) {
		mUpdateTiming = in.readInt();
		mUpdateDistance = in.readInt();
		mMapVersion = in.readString();
		mNotificationLocation = in.readByte() != 0;
		mNotificationTimeZone = in.readByte() != 0;
		mNotificationCountryCode = in.readByte() != 0;
		mNotificationAddress = in.readByte() != 0;
		mNotificationRoadAttribute = in.readByte() != 0;
		mNotificationSubdivisionCode = in.readByte() != 0;
		mNotificationMapCode = in.readByte() != 0;
		mExtraType = in.readInt();
	}
}

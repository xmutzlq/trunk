package com.honda.displayaudio.system.naviinfo;

import android.util.Log;
import android.os.Parcelable;
import android.os.Parcel;

public final class LocationInfo implements Cloneable, Parcelable {

	private static final String TAG = "LocationInfo";

	private int mAccuracy = 0;

	private double mLatitude = 0.0d;

	private double mLongitude = 0.0d;

	private double mAltitude = 0.0d;

	private float mBearing = 0.0f;

	private float mSpeed = 0.0f;

	private String mCountryCode = "";

	private String mAddress = "";

	private int mRoadAttribute = 0;

	private String mCountrySubdivisionCode = "";

	private String mMapCode = "";
	
	private float mSpeedLimit = 0.0f;

	private int mLane = 0;

	private int mWidth = 0;

	private String mValueString = "";

	private int mValueInt = 0;

	private float mValueFloat = 0.0f;

	private double mValueDouble = 0.0f;
	
	public LocationInfo(int accuracy, double latitude, double longitude, double altitude, float bearing, float speed) {
	}

	public boolean setAccuracy(int accuracy) {
		return false;
	}

	public int getAccuracy() {
		return mAccuracy;
	}

	public boolean setLatitude(double latitude) {
		return false;
	}

	public double getLatitude() {
		return mLatitude;
	}

	public boolean setLongitude(double longitude) {
		return false;
	}

	public double getLongitude() {
		return mLongitude;
	}

	public boolean setAltitude(double altitude) {
		return false;
	}

	public double getAltitude() {
		return mAltitude;
	}

	public boolean setBearing(float bearing) {
		return false;
	}

	public float getBearing() {
		return mBearing;
	}

	public boolean setSpeed(float speed) {
		return false;
	}

	public float getSpeed() {
		return mSpeed;
	}

	public boolean setCountryCode(String country) {
		return false;
	}

	public String getCountryCode() {
		return mCountryCode;
	}

	public boolean setAddress(String address) {
		return false;
	}

	public String getAddress() {
		return mAddress;
	}

	public boolean setRoadAttribute(int roadAttribute) {
		return false;
	}

	public int getRoadAttribute() {
		return mRoadAttribute;
	}

	public boolean setCountrySubdivisionCode(String subdivisionCode) {
		return false;
	}

	public String getCountrySubdivisionCode() {
		return mCountrySubdivisionCode;
	}

	public boolean setMapCode(String mapCode) {
		return false;
	}

	public String getMapCode() {
		return mMapCode;
	}

	public boolean setSpeedLimit(float speed) {
		return false;
	}

	public float getSpeedLimit() {
		return mSpeedLimit;
	}

	public boolean setLane(int lane) {
		return false;
	}

	public int getLane() {
		return mLane;
	}

	public boolean setRoadWidth(int width) {
		return false;
	}

	public int getRoadWidth() {
		return mWidth;
	}

	public boolean setStringExtra(String value) {
		return false;
	}

	public String getStringExtra() {
		return mValueString;
	}

	public boolean setIntExtra(int value) {
		return false;
	}

	public int getIntExtra() {
		return mValueInt;
	}

	public boolean setFloatExtra(float value) {
		return false;
	}

	public float getFloatExtra() {
		return mValueFloat;
	}

	public boolean setDoubleExtra(double value) {
		return false;
	}

	public double getDoubleExtra() {
		return mValueDouble;
	}

	public static final Parcelable.Creator<LocationInfo> CREATOR = new Parcelable.Creator<LocationInfo>(){
		@Override
		public LocationInfo createFromParcel(Parcel in) {
			return new LocationInfo(in);
		}
		@Override
		public LocationInfo[] newArray(int size) {
				return new LocationInfo[size];
			}
	};

	private LocationInfo(Parcel in) {
		mAccuracy = in.readInt();
		mLatitude = in.readDouble();
		mLongitude = in.readDouble();
		mAltitude = in.readDouble();
		mBearing = in.readFloat();
		mSpeed = in.readFloat();
		mCountryCode = in.readString();
		mAddress = in.readString();
		mRoadAttribute = in.readInt();
		mCountrySubdivisionCode = in.readString();
		mMapCode = in.readString();
		mSpeedLimit = in.readFloat();
		mLane = in.readInt();
		mWidth = in.readInt();
		mValueString = in.readString();
		mValueInt = in.readInt();
		mValueFloat = in.readFloat();
		mValueDouble = in.readDouble();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel in, int arg1) {
		in.writeInt(mAccuracy);
		in.writeDouble(mLatitude);
		in.writeDouble(mLongitude);
		in.writeDouble(mAltitude);
		in.writeDouble(mBearing);
		in.writeDouble(mSpeed);
		in.writeString(mCountryCode);
		in.writeString(mAddress);
		in.writeInt(mRoadAttribute);
		in.writeString(mCountrySubdivisionCode);
		in.writeString(mMapCode);
		in.writeDouble(mSpeedLimit);
		in.writeInt(mLane);
		in.writeInt(mWidth);
		in.writeString(mValueString);
		in.writeInt(mValueInt);
		in.writeDouble(mValueFloat);
		in.writeDouble(mValueDouble);
	}
}
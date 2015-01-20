package com.honda.displayaudio.system.traffic;

import android.os.Parcel;
import android.os.Parcelable;

public class HdTrafficServiceInfo implements Parcelable
{
	private int mPortNumber;
	private int mServiceDataType;
	private int mMimeHash;
	
	public static final Parcelable.Creator<HdTrafficServiceInfo> CREATOR = new Parcelable.Creator<HdTrafficServiceInfo>()
	{
		@Override
		public HdTrafficServiceInfo createFromParcel(Parcel source)
		{
			return new HdTrafficServiceInfo(source);
		}

		@Override
		public HdTrafficServiceInfo[] newArray(int size)
		{
			return new HdTrafficServiceInfo[size];
		}
	};


	
	
	public int getmPortNumber() {
		return mPortNumber;
	}

	public void setmPortNumber(int mPortNumber) {
		this.mPortNumber = mPortNumber;
	}

	public int getmServiceDataType() {
		return mServiceDataType;
	}

	public void setmServiceDataType(int mServiceDataType) {
		this.mServiceDataType = mServiceDataType;
	}

	public int getmMimeHash() {
		return mMimeHash;
	}

	public void setmMimeHash(int mMimeHash) {
		this.mMimeHash = mMimeHash;
	}

	private HdTrafficServiceInfo(Parcel source)
	{
		readFromParcel(source);
	}
	
	/****************************************************************************
	 * readFromParcel(Parcel source)											*
	 ****************************************************************************/

	public void readFromParcel(Parcel source)
	{
		return;
	}
	
	@Override
	public int describeContents() {
		return 0;
	}

	/****************************************************************************
	 * writeToParcel(Parcel dest, int flags)									*
	 ****************************************************************************/

	@Override
	public void writeToParcel(Parcel dest, int flags)
	{
		return;
	}
}

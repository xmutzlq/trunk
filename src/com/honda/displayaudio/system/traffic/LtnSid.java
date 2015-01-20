package com.honda.displayaudio.system.traffic;

import android.os.Parcel;
import android.os.Parcelable;

public class LtnSid implements Parcelable
{
	private	int mLtn = 0;;
	private	int mSid = 0;
	
	public static final Parcelable.Creator<LtnSid> CREATOR = new Parcelable.Creator<LtnSid>()
	{
		@Override
		public LtnSid createFromParcel(Parcel source)
		{
			return new LtnSid(source);
		}

		@Override
		public LtnSid[] newArray(int size)
		{
			return new LtnSid[size];
		}
	};
	
	public	LtnSid(int ltn, int sid)
	{
		mLtn = ltn;
		mSid = sid;
	}
	


	public int getmLtn() {
		return mLtn;
	}



	public void setmLtn(int mLtn) {
		this.mLtn = mLtn;
	}



	public int getmSid() {
		return mSid;
	}



	public void setmSid(int mSid) {
		this.mSid = mSid;
	}



	private LtnSid(Parcel source)
	{
		readFromParcel(source);
	}
	
	/****************************************************************************
	 * readFromParcel(Parcel source)											*
	 ****************************************************************************/

	public void readFromParcel(Parcel source)
	{
		mLtn = source.readInt();
		mSid = source.readInt();
	}
	
	@Override
	public int describeContents() {
		return 0;
	}

	/****************************************************************************
	 * writeToParcel(Parcel dest, int flags)									*
	 ****************************************************************************/

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(mLtn);
		dest.writeInt(mSid);
	}
}

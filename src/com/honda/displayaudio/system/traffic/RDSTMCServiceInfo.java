package com.honda.displayaudio.system.traffic;

import android.os.Parcel;
import android.os.Parcelable;

public class RDSTMCServiceInfo implements Parcelable
{

	private int mCountryCode;    // From PI code (RDS) or supplied by Navigator (RDBS)
	private int mExtCountryCode;  // From Group 1A or supplied by Navigator.
	private int mLtn;        // From RDS group 3A.
	private int mSid;        // From RDS group 3A or 8A EAG.
	private int mLtnbe;        // From 8A EAG. Equal to Ltn if Ltn is nonzero.
	private int mEncid;
	private int mFrequency;
	private int mStrength;
	
	public int getmCountryCode() {
		return mCountryCode;
	}

	public void setmCountryCode(int mCountryCode) {
		this.mCountryCode = mCountryCode;
	}

	public int getmExtCountryCode() {
		return mExtCountryCode;
	}

	public void setmExtCountryCode(int mExtCountryCode) {
		this.mExtCountryCode = mExtCountryCode;
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

	public int getmLtnbe() {
		return mLtnbe;
	}

	public void setmLtnbe(int mLtnbe) {
		this.mLtnbe = mLtnbe;
	}

	public int getmEncid() {
		return mEncid;
	}

	public void setmEncid(int mEncid) {
		this.mEncid = mEncid;
	}

	public int getmFrequency() {
		return mFrequency;
	}

	public void setmFrequency(int mFrequency) {
		this.mFrequency = mFrequency;
	}

	public int getmStrength() {
		return mStrength;
	}

	public void setmStrength(int mStrength) {
		this.mStrength = mStrength;
	}


	public static final Parcelable.Creator<RDSTMCServiceInfo> CREATOR = new Parcelable.Creator<RDSTMCServiceInfo>()
	{
		@Override
		public RDSTMCServiceInfo createFromParcel(Parcel source)
		{
			return new RDSTMCServiceInfo(source);
		}
	
		@Override
		public RDSTMCServiceInfo[] newArray(int size)
		{
			return new RDSTMCServiceInfo[size];
		}
	};
			
	
	
	private RDSTMCServiceInfo(Parcel source)
	{
		readFromParcel(source);
	}
	
	/****************************************************************************
	 * readFromParcel(Parcel source)											*
	 ****************************************************************************/

	public void readFromParcel(Parcel source)
	{
		mCountryCode = source.readInt();
		mExtCountryCode = source.readInt();
		mLtn = source.readInt();
		mSid = source.readInt();
		mLtnbe = source.readInt();
		mEncid = source.readInt();
		mFrequency = source.readInt();
		mStrength = source.readInt();
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
		dest.writeInt(mCountryCode);
		dest.writeInt(mExtCountryCode);
		dest.writeInt(mLtn);
		dest.writeInt(mSid);
		dest.writeInt(mLtnbe);
		dest.writeInt(mEncid);
		dest.writeInt(mFrequency);
		dest.writeInt(mStrength);
	}

}

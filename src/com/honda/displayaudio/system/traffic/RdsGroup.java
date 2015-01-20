package com.honda.displayaudio.system.traffic;

import android.os.Parcel;
import android.os.Parcelable;

public class RdsGroup implements Parcelable
{
	private int mBlockA;					// Block A of the group
	private int mBlockB;					// Block B of the group
	private int mBlockC;					// Block C of the group
	private int mBlockD;					// Block D of the group
	private int mCorrectedErrorCount;		// Number of corrected errors in this group
	private int mUncorrectedErrorCount;		// Number of uncorrected errors in this group

	public static final Parcelable.Creator<RdsGroup> CREATOR = new Parcelable.Creator<RdsGroup>()
	{
		@Override
		public RdsGroup createFromParcel(Parcel source)
		{
			return new RdsGroup(source);
		}
	
		@Override
		public RdsGroup[] newArray(int size)
		{
			return new RdsGroup[size];
		}
	};
	

	
	public int getmBlockA()
	{
		return mBlockA;
	}

	public void setmBlockA(int mBlockA)
	{
		this.mBlockA = mBlockA;
	}

	public int getmBlockB()
	{
		return mBlockB;
	}

	public void setmBlockB(int mBlockB)
	{
		this.mBlockB = mBlockB;
	}

	public int getmBlockC()
	{
		return mBlockC;
	}

	public void setmBlockC(int mBlockC)
	{
		this.mBlockC = mBlockC;
	}

	public int getmBlockD()
	{
		return mBlockD;
	}

	public void setmBlockD(int mBlockD)
	{
		this.mBlockD = mBlockD;
	}

	public int getmCorrectedErrorCount()
	{
		return mCorrectedErrorCount;
	}

	public void setmCorrectedErrorCount(int mCorrectedErrorCount)
	{
		this.mCorrectedErrorCount = mCorrectedErrorCount;
	}

	public int getmUncorrectedErrorCount()
	{
		return mUncorrectedErrorCount;
	}

	public void setmUncorrectedErrorCount(int mUncorrectedErrorCount)
	{
		this.mUncorrectedErrorCount = mUncorrectedErrorCount;
	}

	private RdsGroup(Parcel source)
	{
		readFromParcel(source);
	}
	
	/****************************************************************************
	 * readFromParcel(Parcel source)											*
	 ****************************************************************************/

	public void readFromParcel(Parcel source)
	{
		mBlockA = source.readInt();
		mBlockB = source.readInt();
		mBlockC = source.readInt();
		mBlockD = source.readInt();
		mCorrectedErrorCount = source.readInt();
		mUncorrectedErrorCount = source.readInt();
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
		dest.writeInt(mBlockA);
		dest.writeInt(mBlockB);
		dest.writeInt(mBlockC);
		dest.writeInt(mBlockD);
		dest.writeInt(mCorrectedErrorCount);
		dest.writeInt(mUncorrectedErrorCount);
	}
}

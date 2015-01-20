/********************************************************************************/
/**
 *
 *	@file		GuidDispDemand.java
 *
 *	@author		LiangKy
 *	@date		2014.3.13	LiangKy	
 ********************************************************************************
 *	All Right Reserved. Copyright(C) 2014-2016, Clarion Co.,Ltd.
 ********************************************************************************/
package com.honda.displayaudio.system.meter;

import android.os.Parcel;
import android.os.Parcelable;

public class GuidDispDemand implements Parcelable
{

	/****************************************************************************
	*
	*****************************************************************************/
	private byte[] data;		// GUIDE_DISP_DEMAND
	
	public static final Parcelable.Creator<GuidDispDemand> CREATOR = new Parcelable.Creator<GuidDispDemand>()
			{
				@Override
				public GuidDispDemand createFromParcel(Parcel source)
				{
					return new GuidDispDemand(source);
				}
			
				@Override
				public GuidDispDemand[] newArray(int size)
				{
					return new GuidDispDemand[size];
				}
	};
	
	/****************************************************************************
	 * GuidDispDemand()															*
	 ****************************************************************************/
	/** GuidDispDemand
	 *
	 *	@param		
	 *
	 *	@retval		
	 *
	 */
	public GuidDispDemand()
	{
		data = new byte[8];
	}
	
	/****************************************************************************
	 * GuidDispDemand(Parcel source)											*
	 ****************************************************************************/
	/** GuidDispDemand
	 *
	 *	@param		Parcel source
	 *
	 *	@retval		?Ȃ?
	 *
	 */
	private GuidDispDemand(Parcel source)
	{
		readFromParcel(source);
	}
	
	@Override
	public int describeContents()
	{
		return 0;
	}
	
	/****************************************************************************
	 * writeToParcel(Parcel dest, int flags)									*
	 ****************************************************************************/

	@Override
	public void writeToParcel(Parcel dest, int flags)
	{
		dest.writeByteArray(data);
	}
	
	/****************************************************************************
	 * readFromParcel(Parcel source)											*
	 ****************************************************************************/

	public void readFromParcel(Parcel source)
	{
		source.readByteArray(data);
	}
	
	/****************************************************************************
	 * getDataArray()															*
	 ****************************************************************************/

	public byte[] getDataArray()
	{
		return data;
	}
	
	/****************************************************************************
	 * setDataArray()															*
	 ****************************************************************************/

	public void setDataArray(byte[] data)
	{
		//
		this.data = data;
	}
}

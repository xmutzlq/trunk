/********************************************************************************/
/** ReplyGuideInf
 *
 *	@file		ReplyGuideInfo.java
 *
 *	@author		LiangKy
 *	@date		2014.3.11	LiangKy	
 *
 ********************************************************************************
 *	All Right Reserved. Copyright(C) 2014-2016, Clarion Co.,Ltd.
 ********************************************************************************/
package com.honda.displayaudio.system.meter;

import android.os.Parcel;
import android.os.Parcelable;

public class ReplyGuideInfo implements Parcelable
{
	/****************************************************************************
	* 
	*****************************************************************************/
	private byte[] data;		// REPLY_GUIDE_INFO
	
	public static final Parcelable.Creator<ReplyGuideInfo> CREATOR = new Parcelable.Creator<ReplyGuideInfo>()
			{
				@Override
				public ReplyGuideInfo createFromParcel(Parcel source)
				{
					return new ReplyGuideInfo(source);
				}
			
				@Override
				public ReplyGuideInfo[] newArray(int size)
				{
					return new ReplyGuideInfo[size];
				}
	};
	
	/****************************************************************************
	 * ReplyGuideInfo()															*
	 ****************************************************************************/

	public ReplyGuideInfo()
	{
		data = new byte[4];
	}
	
	/****************************************************************************
	 * ReplyGuideInfo(Parcel source)											*
	 ****************************************************************************/

	private ReplyGuideInfo(Parcel source)
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

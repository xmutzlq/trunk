/********************************************************************************/
/** 
 *
 *	@file		NavGuide.java
 *
 *	@author		LiangKy
 *	@date		2014.3.13	LiangKy	
 *
 ********************************************************************************
 *	All Right Reserved. Copyright(C) 2014-2016, Clarion Co.,Ltd.
 ********************************************************************************/
package com.honda.displayaudio.system.meter;

import android.os.Parcel;
import android.os.Parcelable;

public class NavGuide implements Parcelable
{

	/****************************************************************************

	*****************************************************************************/
	private byte[] mpctrl;		// 
	private byte[][] mpdata;	// 
	private int pkt_num;		// 
	
	public static final Parcelable.Creator<NavGuide> CREATOR = new Parcelable.Creator<NavGuide>()
			{
				@Override
				public NavGuide createFromParcel(Parcel source)
				{
					return new NavGuide(source);
				}
		
				@Override
				public NavGuide[] newArray(int size)
				{
					return new NavGuide[size];
				}
	};
	
	/****************************************************************************
	 * NavGuide()																*
	 ****************************************************************************/

	public NavGuide()
	{
		mpctrl = new byte[4];
		mpdata = new byte[9][8];
		pkt_num = 0;
	}
	
	/****************************************************************************
	 * NavGuide(Parcel source)													*
	 ****************************************************************************/
	
	private NavGuide(Parcel source)
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
	/**
	 *
	 *	@param		Parcel dest
	 *				int flags
	 *
	 *	@retval
	 *
	 */
	@Override
	public void writeToParcel(Parcel dest, int flags)
	{
		dest.writeByteArray(mpctrl);
		
		//
		for(int i = 0; i < 9; i++)
		{
			dest.writeByteArray(mpdata[i]);
		}
		
		dest.writeInt(pkt_num);
	}
	
	/****************************************************************************
	 * readFromParcel(Parcel source)											*
	 ****************************************************************************/
	/** 
	 *
	 *	@param		Parcel source	
	 *
	 *	@retval	
	 *
	 */
	public void readFromParcel(Parcel source)
	{
		source.readByteArray(mpctrl);
		
		//
		for(int i = 0; i < 9; i++)
		{
			source.readByteArray(mpdata[i]);
		}
		
		pkt_num = source.readInt();
	}
	
	/****************************************************************************
	 * getMpctrlArray()															*
	 ****************************************************************************/
	/** MPCTRL_NAV_MID_GUIDE
	 *

	 *
	 */
	public byte[] getMpctrlArray()
	{
		return mpctrl;
	}
	
	/****************************************************************************
	 * setMpctrlArray()															*
	 ****************************************************************************/
	/** MPCTRL_NAV_MID_GUIDE
	 *
	 *	@param		byte[4] 
	 *				
	 *	@retval		
	 *
	 */
	public void setMpctrlArray(byte[] mpctrl)
	{
		// 
		this.mpctrl = mpctrl;
	}
	
	/****************************************************************************
	 * getMpdataArray()															*
	 ****************************************************************************/
	/** MPDATA_NAV_MID_GUIDE

	 */
	public byte[][] getMpdataArray()
	{
		return mpdata;
	}
	
	/****************************************************************************
	 * setMpdataArray()															*
	 ****************************************************************************/
	/** MPDATA_NAV_MID_GUIDE

	 *
	 */
	public void setMpdataArray(byte[][] mpdata)
	{
		// 
		this.mpdata = mpdata;
	}
	
	/****************************************************************************
	 * getPkt_num()															*
	 ****************************************************************************/

	public int getPkt_num()
	{
		return pkt_num;
	}
	
	/****************************************************************************
	 * setPkt_num(int pkt_num)													*
	 ****************************************************************************/

	public void setPkt_num(int pkt_num)
	{
		this.pkt_num = pkt_num;
	}
}
	

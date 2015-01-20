/********************************************************************************/
/** 
 *
 *	@file		NavCurrent.java
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

public class NavCurrent implements Parcelable
{

	/****************************************************************************
	*
	*****************************************************************************/
	private byte[] mpctrl;		// MPCTRL_NAV_MID_CURRENT
	private byte[][] mpdata;	// MPDATA_NAV_MID_CURRENT
	private int pkt_num;		// 
	
	public static final Parcelable.Creator<NavCurrent> CREATOR = new Parcelable.Creator<NavCurrent>()
			{
				@Override
				public NavCurrent createFromParcel(Parcel source)
				{
					return new NavCurrent(source);
				}
		
				@Override
				public NavCurrent[] newArray(int size)
				{
					return new NavCurrent[size];
				}
	};
	
	/****************************************************************************
	 * NavCurrent()																*
	 ****************************************************************************/
	/** NavCurrent
	 *
	 *	@param		?Ȃ?
	 *
	 *	@retval		?Ȃ?
	 *
	 */
	public NavCurrent()
	{
		mpctrl = new byte[4];
		mpdata = new byte[7][8];
		pkt_num = 0;
	}
	
	/****************************************************************************
	 * NavCurrent(Parcel source)													*
	 ****************************************************************************/
	/** NavCurrent
	 *
	 *	@param		Parcel source
	 *
	 *	@retval		
	 *
	 */
	private NavCurrent(Parcel source)
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
		
		// mpdata
		for(int i = 0; i < 7; i++)
		{
			dest.writeByteArray(mpdata[i]);
		}
		
		dest.writeInt(pkt_num);
	}
	
	/****************************************************************************
	 * readFromParcel(Parcel source)											*
	 ****************************************************************************/

	public void readFromParcel(Parcel source)
	{
		source.readByteArray(mpctrl);
		
		// mpdata
		for(int i = 0; i < 7; i++)
		{
			source.readByteArray(mpdata[i]);
		}
		
		pkt_num = source.readInt();
	}
	
	/****************************************************************************
	 * getMpctrlArray()															*
	 ****************************************************************************/

	public byte[] getMpctrlArray()
	{
		return mpctrl;
	}
	
	/****************************************************************************
	 * setMpctrlArray()															*
	 ****************************************************************************/

	public void setMpctrlArray(byte[] mpctrl)
	{
		// 
		this.mpctrl = mpctrl;
	}
	
	/****************************************************************************
	 * getMpdataArray()															*
	 ****************************************************************************/

	public byte[][] getMpdataArray()
	{
		return mpdata;
	}
	
	/****************************************************************************
	 * setMpdataArray()															*
	 ****************************************************************************/

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

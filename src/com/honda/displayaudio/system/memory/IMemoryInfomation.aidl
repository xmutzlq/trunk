package com.honda.displayaudio.system.memory;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
interface IMemoryInfomation
{
	ParcelFileDescriptor getFileDescriptor();
	void setValue(int val);
}
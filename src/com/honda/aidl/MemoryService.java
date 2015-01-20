package com.honda.aidl;

import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;

import com.honda.displayaudio.system.memory.IMemoryInfomation;

import java.io.IOException;
public class MemoryService extends IMemoryInfomation.Stub {

	private static final String TAG = MemoryService.class.getSimpleName();

	private MemoryFile mfile = null;

	public MemoryService() {
		try {
			mfile = new MemoryFile("Ashmem", 4);
			setValue(0);
		} catch (IOException ex) {
			Log.i(TAG, "Failed to create memory file.");
			ex.printStackTrace();
		} catch (RemoteException e) {
			Log.i(TAG, "Failed to connect service.");
			e.printStackTrace();
		}
	}

	@Override
	public ParcelFileDescriptor getFileDescriptor() throws RemoteException {
		Log.i(TAG, "Get File Descriptor.");
		ParcelFileDescriptor pfd = null;
		// try {
//			pfd = mfile.getInputStream();
		// } catch (IOException ex) {
		// Log.i(TAG, "Failed to get file descriptor.");
		// ex.printStackTrace();
		// }
		return pfd;
	}

	@Override
	public void setValue(int val) throws RemoteException {
		if (mfile == null) {
			return;
		}

		byte[] buffer = new byte[4];
		buffer[0] = (byte) ((val >>> 24) & 0xFF);
		buffer[1] = (byte) ((val >>> 16) & 0xFF);
		buffer[2] = (byte) ((val >>> 8) & 0xFF);
		buffer[3] = (byte) (val & 0xFF);

		try {
			mfile.writeBytes(buffer, 0, 0, 4);
			Log.i(TAG, "Set value " + val + " to memory file. ");
		} catch (IOException ex) {
			Log.i(TAG, "Failed to write bytes to memory file.");
			ex.printStackTrace();
		}
	}
}

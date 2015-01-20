package com.honda.displayaudio.system.telemainfo;

import android.net.Uri;

public class TelemaInfoConst {

	public static final int DIALUPINFO_TYPE_SERVER = 0;

	public static final int DIALUPINFO_TYPE_USER_HELPNET = 1;

	public static final int DIALUPINFO_TYPE_TCU_LUF = 2;

	public static final int DIALUPINFO_FUNC_HELPNET = 0;

	public static final int DIALUPINFO_FUNC_TCU_LUF = 1;

	public static final String PROVISIONING_FILE_NAME = "provisioningfile_server.xml";

	public static final Uri CONTENT_URI = Uri.parse("content://com.honda.displayaudio.system.telemainfo");
}

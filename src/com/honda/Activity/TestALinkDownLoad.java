package com.honda.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class TestALinkDownLoad extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// startActivity(new Intent("com.autonavi.xm.action.DOWNLOAD"));
		startActivity(new Intent("com.autonavi.xm.action.SETTINGS"));
	}
}

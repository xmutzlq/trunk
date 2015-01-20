package com.honda.Activity;

import android.app.Activity;
import android.widget.TextView;

public class TestBrocast2Activity extends Activity{
	@Override
	public void setContentView(int layoutResID) {
		super.setContentView(layoutResID);
		TextView tv = new TextView(getApplicationContext());
		tv.setText("点击返回");
		setContentView(tv);
	}
}

package com.honda.Activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Scroller;

public class TestBrocastActivity extends Activity{
	
	private TestButton mTestButton,mTestButton1;
	private Scroller mScroller;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mScroller = new Scroller(getApplicationContext());
		mTestButton = new TestButton(getApplicationContext());
		mTestButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mScroller.startScroll(0, 0, -100, -200, 3000);
			}
		});
		mTestButton1 = new TestButton(getApplicationContext());
		TestViewGroup testViewGroup = new TestViewGroup(getApplicationContext());
		testViewGroup.setBackgroundColor(Color.CYAN);
		testViewGroup.addView(mTestButton, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		testViewGroup.addView(mTestButton1, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		setContentView(testViewGroup, 
				new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
	}
	
	private final IntentFilter mIntentFilter = new IntentFilter("com.honda.Activity.Action.Bro");
	
	@Override
	protected void onResume() {
		super.onResume();
		registerReceiver(mReceiver, mIntentFilter);
	}
	
	private final BroadcastReceiver mReceiver = new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context context, Intent intent) {
			Log.e("TestBrocastActivity", "1111111111111111");
		}
	};
	
	private class TestButton extends Button{

		public TestButton(Context context) {
			super(context);
		}
		
		public TestButton(Context context, AttributeSet attrs) {
			super(context, attrs);
		}
		
		@Override
		protected void onSizeChanged(int w, int h, int oldw, int oldh) {
			super.onSizeChanged(w, h, oldw, oldh);
			setText("测试广播未注销的问题");
		}
		
		@Override
		public void computeScroll() {
		}
	}
	
	private class TestViewGroup extends LinearLayout{

		public TestViewGroup(Context context) {
			super(context);
		}
		
		public TestViewGroup(Context context, AttributeSet attrs) {
			super(context, attrs);
		}
		
		@Override
		public void computeScroll() {
			if(mScroller != null && mScroller.computeScrollOffset()){
				getChildAt(0).layout(-mScroller.getCurrX(), -mScroller.getCurrY(), 
						-(getWidth() + mScroller.getCurrX()), -(getHeight() + mScroller.getCurrY()));
			}
		}
	}
}

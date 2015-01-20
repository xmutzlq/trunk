package com.honda.Activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.honda.server.R;
import com.honda.util.GraphicsUtil;

public class MyGraphics extends Activity implements OnClickListener{

	private Button changeBtn;
	private ViewGroup showLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bitmap_test_lay);
		changeBtn = (Button)findViewById(R.id.bitmap_test);
		changeBtn.setOnClickListener(this);
		showLayout = (FrameLayout)findViewById(R.id.bitmap_show);
		
		
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.bitmap_test:
			mHandler.post(mRunnable);
			break;
		}
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		int action = event.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			
			break;
		case MotionEvent.ACTION_MOVE:
			break;
		}
		return super.onTouchEvent(event);
	}
	
	private final Handler mHandler = new Handler(Looper.getMainLooper());
	private final Runnable mRunnable = new Runnable() {
		
		@Override
		public void run() {
			showBitmapImage();
		}
	};
	
	private void showBitmapImage(){
		//获取原始bitmap
		Bitmap orgBitmap = GraphicsUtil.getBitmapFromResource(getApplicationContext(), R.drawable.ic_launcher);
		Matrix matrix = new Matrix();
//		matrix.setScale(0.5f, 0.5f);
		matrix.postRotate(45.0f);
		Bitmap newBitmap = Bitmap.createBitmap(
				orgBitmap, 0, 0, orgBitmap.getWidth(), orgBitmap.getHeight(), 
				matrix, true);
		MyImageView myImageView = new MyImageView(getApplicationContext());
		showLayout.removeAllViews();
		showLayout.addView(myImageView);
		//方法1：直接将bitmap转成bitmapDrawable设置view的背景
//		BitmapDrawable bitmapDrawable = new BitmapDrawable(newBitmap);
//		myImageView.setBackgroundDrawable(bitmapDrawable);
		myImageView.setBgResource(newBitmap);
		//方法2：为view设置layoutParams然后调用invalidate()方法刷新
//		LayoutParams lp = myImageView.getLayoutParams();
//		lp.width = newBitmap.getWidth();
//		lp.height = newBitmap.getHeight();
//		myImageView.setLayoutParams(lp);
//		myImageView.invalidate();
		//方法3：设置padding，内部会调用invalidate方法
//		myImageView.setPadding(0, 0, newBitmap.getWidth(), newBitmap.getHeight());
		//方法4：重写view的onMeasure方法，调用requestLayout
	}
	
	private static class MyImageView extends ImageView{

		private Bitmap mBtimap;
		private final Paint mPaint;
		
		public MyImageView(Context context) {
			super(context);
			mPaint = new Paint();
			mPaint.setColor(Color.RED);
			mPaint.setAntiAlias(true);
		}
		
		public MyImageView(Context context, AttributeSet attrs) {
			super(context, attrs);
			mPaint = new Paint();
			mPaint.setColor(Color.RED);
			mPaint.setAntiAlias(true);
		}
		
		public void setBgResource(Bitmap bitmap){
			mBtimap = bitmap;
			requestLayout();
		}

		@Override
		protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
			if(mBtimap != null){
				setMeasuredDimension(mBtimap.getWidth(), mBtimap.getHeight());
			}else{
				super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			}
		}
		
		@SuppressLint("DrawAllocation")
		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			Log.e("mygraphisc", "onDraw");
			if(mBtimap != null ){
				canvas.drawBitmap(mBtimap, 100, 100, null);
				mPaint.setAntiAlias(true);
				mPaint.setXfermode(new PorterDuffXfermode(Mode.XOR));
				mPaint.setStyle(Paint.Style.FILL);
				canvas.drawCircle(mBtimap.getWidth() / 2, mBtimap.getHeight() / 2, 10, mPaint);
			}
		}
	}
}

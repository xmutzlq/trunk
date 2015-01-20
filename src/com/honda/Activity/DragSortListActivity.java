package com.honda.Activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.Transformation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基本上实现了ListView拖拽交换位置
 * @author liqin.zeng
 *
 */
public class DragSortListActivity extends Activity implements OnItemLongClickListener, OnTouchListener{
	
	private WindowManager wm;
	private WindowManager.LayoutParams wmParams;
	
	private MySortListView lv;
	private TextView popView;
	
	private View itemView;
	
	private DataSave mDataSave;
	private List<Map<String, String>> list;
	private SimpleAdapter sa;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LayoutInflater lf = LayoutInflater.from(getApplicationContext());
		wm = (WindowManager)getApplicationContext().getSystemService("window");
		mDataSave = new DataSave();
		lv = new MySortListView(getApplicationContext());
		list = new ArrayList<Map<String, String>>();
		for (int i = 0; i < 8; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("item","item" + i);
			list.add(map);
		}
		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		sa = new SimpleAdapter(getApplicationContext(), 
				list, android.R.layout.simple_list_item_1, 
				new String[]{"item"}, new int[]{android.R.id.text1});
		lv.setLayoutParams(lp);
		lv.setAdapter(sa);
		lv.setOnItemLongClickListener(this);
		lv.setOnTouchListener(this);
		setContentView(lv);
		
		popView = (TextView)lf.inflate(android.R.layout.simple_list_item_1, null);
		popView.setText("悬浮");
		popView.setBackgroundColor(Color.RED);
		popView.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                	removePop(popView);
                    return true;
                default:
                    return false;
                }
			}
		});
		
		popView.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				int action = event.getAction();
				switch (action) {
				case MotionEvent.ACTION_DOWN:
					Log.e("DragSortListActivity", "popView ACTION_DOWN");
					break;
				case MotionEvent.ACTION_MOVE:
					mDataSave.location[0] = (int)event.getRawX();
					mDataSave.location[1] = (int)event.getRawY();
			        wm.updateViewLayout(popView, getLayoutParam(
	        		v.getMeasuredWidth(), v.getMeasuredHeight(), mDataSave.location, true));
			        //ListView item 滚动 
			        lv.dispatchTouchEvent(event);//在pop滚动的时候，将pop触屏事件派发到ListView的触屏事件
					break;
				case MotionEvent.ACTION_UP:
					removePop(popView);
					itemView.setVisibility(View.VISIBLE);
					lv.getChildAt(mDataSave.touchListItemPosition + 1).setVisibility(View.VISIBLE);
					int newPosition = lv.pointToPosition(0, mDataSave.location[1]);
					if(mDataSave.touchListItemPosition != newPosition){
						//交换位置
						Map<String, String> map1 = list.get(newPosition);
						Map<String, String> map2 = list.get(mDataSave.touchListItemPosition);
						if(newPosition > mDataSave.touchListItemPosition){
							list.remove(newPosition);
							list.remove(mDataSave.touchListItemPosition);
							list.add(mDataSave.touchListItemPosition, map1);
							list.add(newPosition, map2);
						}else{
							list.remove(mDataSave.touchListItemPosition);
							list.remove(newPosition);
							list.add(newPosition, map2);
							list.add(mDataSave.touchListItemPosition, map1);
						}
						sa.notifyDataSetChanged();
						lv.requestFocus();
						lv.removeDrawItemMirror();
					}
					break;
				}
				return false;
			}
		});
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		if(itemView != null && !itemView.isShown()){
			return popView.dispatchTouchEvent(ev);
		}
		return super.dispatchTouchEvent(ev);
	}
	
	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view,
			int position, long id) {
		if(position > lv.getCount() - 1){
			return true;
		}
		mDataSave.touchListItemPosition = position;
		itemView = lv.getChildAt(position);
		itemView.getLocationInWindow(mDataSave.location);
		itemView.setVisibility(View.INVISIBLE);
		mDataSave.pointOffSet = mDataSave.startY - mDataSave.location[1];
        wm.addView(popView, getLayoutParam(
        		itemView.getMeasuredWidth(), itemView.getMeasuredHeight(),
        		mDataSave.location));//创建View  
		return true;
	}
	
	private LayoutParams getLayoutParam(int width, int height, int[] location){
		return getLayoutParam(width, height, location, false);
	}
	
 	private LayoutParams getLayoutParam(int width, int height, int[] location, boolean isUpdate){
		if(wmParams==null){
			wmParams = new WindowManager.LayoutParams();  
			wmParams.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
			wmParams.flags = WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM;
			wmParams.format = PixelFormat.TRANSLUCENT;
		}
		wmParams.alpha = 0.8f;
		wmParams.gravity = Gravity.TOP | Gravity.LEFT;
		wmParams.height = height;
		wmParams.width = width;
		wmParams.x = location[0];
		if(isUpdate){
			wmParams.y = location[1] - Math.abs(mDataSave.pointOffSet);
		}else{
			wmParams.y = location[1];
		}
		return wmParams;
	}
	
	private void removePop(View view){
		wm.removeView(view);
	}

	private static class DataSave{
		public int pointOffSet;//调整window的位置为手指按下的位置
		public int startX;//保存手指按下的X点
		public int startY;//保存手指按下的Y点
		public int[] location = new int[2];//当前View的位置
		public int touchListItemPosition;
		public DataSave(){}
	}
	
	//ListView的Touch事件
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		Log.e("DragSortListActivity", "listview onTouch");
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			mDataSave.startY = (int)event.getRawY();
			mDataSave.startX = (int)event.getRawX();
			break;
		case MotionEvent.ACTION_MOVE:
//			if(itemView != null && itemView.isShown()){
//		        lv.startDrawItemMirror(mDataSave.touchListItemPosition + 1, (int)event.getRawY() - mDataSave.startY);
//		        lv.postInvalidate();
//			}
			lv.getChildAt(mDataSave.touchListItemPosition).scrollBy((int)event.getRawX() - mDataSave.startX, 0);
			mDataSave.startX = (int)event.getRawX();
	        break;
		case MotionEvent.ACTION_UP:
			lv.removeDrawItemMirror();
			Log.e("DragSortListActivity", "listview ACTION_UP");
			break;
		}
		return false;
	}
	
	private static class MySortListView extends ListView{

		private boolean isFirst = false;
		private boolean canDrawItem = false;
		private boolean scrollBy;
		private int deltRotate = 0;
		private int Position;
		private int mOffSetY;
		private final Paint mPaint = new Paint();
		private final Camera mCamera;
		
		public MySortListView(Context context) {
			super(context);
			mCamera = new Camera();
			setStaticTransformationsEnabled(true);
		}
		
		public MySortListView(Context context, AttributeSet attrs) {
			super(context, attrs);
			mCamera = new Camera();
			setStaticTransformationsEnabled(true);
		}
		
		@Override
		protected void dispatchDraw(Canvas canvas) {
			if(!isFirst){
				isFirst = true;
			}
			super.dispatchDraw(canvas);
		}
		
		@Override
		protected void onSizeChanged(int w, int h, int oldw, int oldh) {
			super.onSizeChanged(w, h, oldw, oldh);
		}
		
		@Override
		protected void onFocusChanged(boolean gainFocus, int direction,
				Rect previouslyFocusedRect) {
			super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
			Log.e("ItemMoveTest", "gainFocus = " + gainFocus + ",direction = "
					+ direction);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			if(canDrawItem){
				View child = getChildAt(Position);
				child.setVisibility(View.INVISIBLE);
				mPaint.setColor(Color.BLUE);
				mPaint.setAntiAlias(true);
				Log.e("DragSortListActivity", "mOffSetY = " + mOffSetY);
				canvas.drawRect(
						child.getLeft(), child.getTop() - mOffSetY, 
						child.getRight(), child.getBottom() - mOffSetY, 
						mPaint);
			}
		}
		
		@Override
		protected boolean getChildStaticTransformation(View child,
				Transformation t) {
			int position = getPositionForView(child);
			if(position == 0){
				t.clear();
				t.setTransformationType(Transformation.TYPE_MATRIX);
				mCamera.save();
				final Matrix imageMatrix = t.getMatrix();
				mCamera.rotateY(deltRotate);
				mCamera.getMatrix(imageMatrix);
				mCamera.restore();
				return true;
			}else{
				return super.getChildStaticTransformation(child, t);
			}
		}
		
		public void scrollByX(int x){
			deltRotate = x / 100;
			scrollBy = true;
			scrollBy(x, 0);
		}
		
		@Override
		public void scrollBy(int x, int y) {
			super.scrollBy(x, y);
		}
		
		public void removeDrawItemMirror(){
			canDrawItemMirror(false, 0, 0);
			isFirst = false;
			invalidate();
		}
		
		public void startDrawItemMirror(int position, int offSetY){
			canDrawItemMirror(true, position, offSetY);
		}
		
		private void canDrawItemMirror(boolean isDraw, int position, int offSetY){
			canDrawItem = isDraw;
			mOffSetY = offSetY;
			Position = position;
		}
	}
}

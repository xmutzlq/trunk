package com.honda.Activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ItemMoveTest extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new magicViewGroup(getApplicationContext()));
	}
	
	private class magicViewGroup extends ViewGroup{
		private ItemView item1;
		private ItemView item2;
		
		private int startX;
		private int startY;
		private int offSetX;
		private int offSetY;
		
		private boolean isNeedRequest;
		private int currentItem;
		
		public magicViewGroup(Context context) {
			super(context);
			init();
		}
		
		public magicViewGroup(Context context, AttributeSet attrs) {
			super(context, attrs);
			init();
		}

		private void init(){
			LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
			setLayoutParams(lp);
			item1 = new ItemView(getApplicationContext());
			item1.setTag("item1");
			item1.setText("item1");
			item2 = new ItemView(getApplicationContext());
			item1.setTag("item2");
			item2.setText("item2");
			addView(item1);
			addView(item2);
		}
		
		@Override
		protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
			super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			
			int specSizeWidth = MeasureSpec.getSize(widthMeasureSpec);
			int specSizeHeigh = MeasureSpec.getSize(heightMeasureSpec);
			int childCount = getChildCount();
			
			setMeasuredDimension(specSizeWidth, specSizeHeigh);
			
			for (int i = 0; i < childCount; i++) {
				View child = getChildAt(i);
                child.measure(child.getMeasuredWidth(), child.getMeasuredHeight());
			}
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			int margin = 10;
			int left = 0;
			int top = 10;
			
			if(isNeedRequest){
				View child = getChildAt(currentItem);
				child.layout(offSetX + left, offSetY + top, 
						offSetX + left + child.getMeasuredWidth(), offSetY + top + child.getMeasuredHeight());
				return;
			}
			
			int childCount = getChildCount();
			for (int i = 0; i < childCount; i++) {
				View child = getChildAt(i);
				child.layout(left, top, left + child.getMeasuredWidth(), top + child.getMeasuredHeight());
				left += child.getWidth() + margin;
				if(left > 800){
					top += child.getHeight() + margin;
				}
			}
		}
		
		@Override
		public void computeScroll() {
			super.computeScroll();
		}
		
		@Override
		public boolean onInterceptTouchEvent(MotionEvent ev) {
			return true;
		}
		
		@Override
		public boolean onTouchEvent(MotionEvent event) {
			int action = event.getAction();
			switch (action) {
			case MotionEvent.ACTION_DOWN:
				startX = (int)event.getX();
				startY = (int)event.getY();
				if(item1.isFocused()){
					currentItem = 0;
				}else{
					currentItem = 1;
				}
				return true;
			case MotionEvent.ACTION_MOVE:
				offSetX = (int)(event.getX()) - startX;
				offSetY = (int)(event.getY()) - startY;
				isNeedRequest = true;
				requestLayout();
				return false;
			case MotionEvent.ACTION_UP:
				startX = offSetX;
				startY = offSetY;
				return true;
			}
			return super.onTouchEvent(event);
		}
	}
	
	private class ItemView extends Button{

		public ItemView(Context context) {
			super(context);
		}
		
		public ItemView(Context context, AttributeSet attrs) {
			super(context, attrs);
		}
	
		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
		}
	}
}	

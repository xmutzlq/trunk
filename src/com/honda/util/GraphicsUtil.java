package com.honda.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

import java.io.ByteArrayOutputStream;

public class GraphicsUtil {
	//getBitmap from drawable
	public static Bitmap drawableToBitmap(Drawable drawable){
		Bitmap bitmap = Bitmap.createBitmap(
				drawable.getIntrinsicWidth(), 
				drawable.getIntrinsicHeight(), 
				drawable.getOpacity() != PixelFormat.OPAQUE ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
		Canvas canvas = new Canvas(bitmap);
		drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
		drawable.draw(canvas);
		return bitmap;
	}
	
	//getBitmap from resource
	public static Bitmap getBitmapFromResource(Context context, int id){
		Resources resource = context.getResources();
		Bitmap bitmap = BitmapFactory.decodeResource(resource, id);
		BitmapFactory.Options options = new Options();
		options.inJustDecodeBounds = true;
		options.inSampleSize = 1;
		return bitmap;
	}
	
	//bitmap to byte[]
	public static byte[] getByteFromBitmap(Bitmap bitmap){
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		bitmap.compress(Bitmap.CompressFormat.PNG, 
				100, stream);
		return stream.toByteArray();
	}
	
	//byte[] to bitmap
	public static Bitmap getBitmapFromBytes(byte[] b){
		if(b != null){
			return BitmapFactory.decodeByteArray(b, 0, b.length);
		}else{
			return null;
		}
	}
}

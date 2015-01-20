package com.honda.displayaudio.system.telemainfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;


import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;


import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;

public class TelemaInfoProvider extends ContentProvider
{
	private static final String TAG = "TelemaInfoProvider";

	@Override
	public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
		return null;
	}
	@Override
	public int delete(Uri uri, String where, String[] whereArgs) {
		return 0;
	}

	@Override
	public String getType(Uri uri) {
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues initialValues) {
		return null;
	}

	@Override
	public boolean onCreate() {
		return false;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
		return null;
	}

	@Override
	public int update(Uri uri, ContentValues values, String where, String[] whereArgs) {
		return 0;
	}
}

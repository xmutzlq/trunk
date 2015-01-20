package com.honda.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "autonavi.db";
	private static final int DATABASE_VERSION1 = 1;

	public DBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(MiniMapProvider.CREATE_TABLE_MINIMAP);
		db.execSQL(MarkerProvider.CREATE_TABLE_MARKER);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS "
				+ MiniMapProviderMetaData.MiniMapTableMetaData.TABLE_NAME);
		db.execSQL("DROP TABLE IF EXISTS "
				+ MarkerProviderMetaData.MarkerTableMetaData.TABLE_NAME);
		onCreate(db);
	}
}

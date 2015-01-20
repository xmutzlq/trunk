package com.honda.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DBHandler {
	protected SQLiteDatabase db;
	protected Context context;
	protected DBHelper dbHelper;

	public DBHandler(Context context) {
		this.context = context;
		dbHelper = new DBHelper(context);
	}

	public void open() {
		if (dbHelper != null) {
			if (db != null) {
				if (db.isOpen()) {
					db.close();
				}
			}
			db = dbHelper.getWritableDatabase();
		}
	}

	public void close() {
		Log.v("DBHandler", "close");
		if (db != null) {
			db.close();
		}
	}
}

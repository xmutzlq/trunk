package com.honda.provider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.provider.BaseColumns;
import android.text.TextUtils;

import com.honda.provider.MarkerProviderMetaData.MarkerTableMetaData;

public class MarkerProvider extends ContentProvider {

	private DBHelper mOpenHelper;
	public static final String CREATE_TABLE_MARKER = "create table "
			+ MarkerTableMetaData.TABLE_NAME + " (" + MarkerTableMetaData._ID
			+ " integer primary key autoincrement, "
			+ MarkerTableMetaData.MINIMAP_ID + " VARCHAR(50), "
			+ MarkerTableMetaData.MINIMAP_TYPE + " VARCHAR(50), "
			+ MarkerTableMetaData.MINIMAP_DATA + " BLOB, "
			+ MarkerTableMetaData.LASTMOD + " text" + ");";

	private static final int INCOMING_MINIMAP_COLLECTION_URI_INDICATOR = 1; // 多条
	private static final int INCOMING_SINGLE_MINIMAP_URI_INDICATOR = 2; // 单条

	private static Object obj = new Object();

	private final UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

	@Override
	public boolean onCreate() {
		sUriMatcher.addURI(MarkerProviderMetaData.AUTHORITY, "icon",
				INCOMING_MINIMAP_COLLECTION_URI_INDICATOR);
		sUriMatcher.addURI(MarkerProviderMetaData.AUTHORITY, "icon/#",
				INCOMING_SINGLE_MINIMAP_URI_INDICATOR);

		mOpenHelper = new DBHelper(getContext());
		return true;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		synchronized (obj) {
			SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
			String limit = uri.getQueryParameter("limit");
			switch (sUriMatcher.match(uri)) {
			case INCOMING_MINIMAP_COLLECTION_URI_INDICATOR:
				qb.setTables(MarkerTableMetaData.TABLE_NAME);
				break;

			case INCOMING_SINGLE_MINIMAP_URI_INDICATOR:
				qb.setTables(MarkerTableMetaData.TABLE_NAME);
				qb.appendWhere(BaseColumns._ID + "="
						+ uri.getPathSegments().get(1));
				break;

			default:
				throw new IllegalArgumentException("Unknown URI " + uri);
			}

			String orderBy;
			if (TextUtils.isEmpty(sortOrder)) {
				orderBy = MarkerTableMetaData.DEFAULT_SORT_ORDER;
			} else {
				orderBy = sortOrder;
			}
			try {
				SQLiteDatabase db = mOpenHelper.getReadableDatabase();
				Cursor c = qb.query(db, projection, selection, selectionArgs,
						null, null, orderBy, limit);

				c.setNotificationUri(getContext().getContentResolver(), uri);
				return c;
			} catch (Exception e) {
				return null;
			}
		}
	}

	@Override
	public String getType(Uri uri) {
		switch (sUriMatcher.match(uri)) {
		case INCOMING_MINIMAP_COLLECTION_URI_INDICATOR:
			return MarkerTableMetaData.CONTENT_TYPE;

		case INCOMING_SINGLE_MINIMAP_URI_INDICATOR:
			return MarkerTableMetaData.CONTENT_ITEM_TYPE;

		default:
			throw new IllegalArgumentException("Unknown URI " + uri);
		}
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		synchronized (obj) {
			if (sUriMatcher.match(uri) != INCOMING_MINIMAP_COLLECTION_URI_INDICATOR) {
				throw new IllegalArgumentException("Unknown URI " + uri);
			}

			SQLiteDatabase db = mOpenHelper.getWritableDatabase();
			long rowId = db.insert(MarkerTableMetaData.TABLE_NAME, "", values);
			if (rowId > 0) {
				Uri insertedDownloadUri = ContentUris.withAppendedId(
						MarkerTableMetaData.CONTENT_URI, rowId);
				getContext().getContentResolver().notifyChange(
						insertedDownloadUri, null);
				return insertedDownloadUri;
			}

			throw new SQLException("Failed to insert row into " + uri);
		}
	}

	@Override
	public int delete(Uri uri, String where, String[] whereArgs) {
		synchronized (obj) {
			SQLiteDatabase db = mOpenHelper.getWritableDatabase();
			int count;
			switch (sUriMatcher.match(uri)) {
			case INCOMING_MINIMAP_COLLECTION_URI_INDICATOR:
				count = db.delete(MarkerTableMetaData.TABLE_NAME, where,
						whereArgs);
				break;

			case INCOMING_SINGLE_MINIMAP_URI_INDICATOR:
				String rowId = uri.getPathSegments().get(1);
				count = db.delete(
						MarkerTableMetaData.TABLE_NAME,
						BaseColumns._ID
						+ "="
						+ rowId
						+ (!TextUtils.isEmpty(where) ? " AND (" + where
								+ ')' : ""), whereArgs);
				break;
			default:
				throw new IllegalArgumentException("Unknown URI " + uri);
			}

			getContext().getContentResolver().notifyChange(uri, null);
			return count;
		}
	}

	@Override
	public int update(Uri uri, ContentValues values, String where,
			String[] whereArgs) {
		synchronized (obj) {
			SQLiteDatabase db = mOpenHelper.getWritableDatabase();
			int count;
			switch (sUriMatcher.match(uri)) {
			case INCOMING_MINIMAP_COLLECTION_URI_INDICATOR:
				count = db.update(MarkerTableMetaData.TABLE_NAME, values,
						where, whereArgs);
				break;

			case INCOMING_SINGLE_MINIMAP_URI_INDICATOR:
				String rowId = uri.getPathSegments().get(1);
				count = db.update(
						MarkerTableMetaData.TABLE_NAME,
						values,
						BaseColumns._ID
						+ "="
						+ rowId
						+ (!TextUtils.isEmpty(where) ? " AND (" + where
								+ ')' : ""), whereArgs);
				break;
			default:
				throw new IllegalArgumentException("Unknown URI " + uri);
			}

			getContext().getContentResolver().notifyChange(uri, null);
			return count;
		}
	}
}

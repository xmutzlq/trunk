package com.honda.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public class MarkerProviderMetaData {

	public static final String AUTHORITY = "jp.co.honda.otherapl";

	private MarkerProviderMetaData() {
	}

	public static final class MarkerTableMetaData implements BaseColumns {
		private MarkerTableMetaData() {
		}

		public static final String TABLE_NAME = "icon";

		public static final Uri CONTENT_URI = Uri.parse("content://"
				+ AUTHORITY + "/icon");

		// 多
		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.honda.marker";
		// 单
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.honda.marker";
		// 自增长
		public static final String DEFAULT_SORT_ORDER = "_id DESC";
		// minimapID
		public static final String MINIMAP_ID = "marker_id";
		// minimapName
		public static final String MINIMAP_NAME = "marker_name";
		// minimap类型
		public static final String MINIMAP_TYPE = "marker_type";
		// minimap数据
		public static final String MINIMAP_DATA = "marker_data";
		// 最后修改时间
		public static final String LASTMOD = "lastmod";
	}

}

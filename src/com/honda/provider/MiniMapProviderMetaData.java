package com.honda.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public class MiniMapProviderMetaData {
	public static final String AUTHORITY = "jp.honda.navi";

	private MiniMapProviderMetaData() {
	}

	public static final class MiniMapTableMetaData implements BaseColumns {
		private MiniMapTableMetaData() {
		}

		public static final String TABLE_NAME = "png";

		public static final Uri CONTENT_URI = Uri.parse("content://"
				+ AUTHORITY + "/png");

		// 多
		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.honda.minimap";
		// 单
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.honda.minimap";
		// 自增长
		public static final String DEFAULT_SORT_ORDER = "_id DESC";
		// minimapID
		public static final String MINIMAP_ID = "minimap_id";
		// minimapName
		public static final String MINIMAP_NAME = "minimap_name";
		// minimap类型
		public static final String MINIMAP_TYPE = "minimap_type";
		// minimap数据
		public static final String MINIMAP_DATA = "minimap_data";
		// 最后修改时间
		public static final String LASTMOD = "lastmod";
	}
}

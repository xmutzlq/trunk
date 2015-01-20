package com.honda.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * MiniMap信息
 * 
 * @author liqin.zeng
 * 
 */
public class MinimapInfo implements Serializable {

	private static final long serialVersionUID = -8560688100048400228L;

	public static final int MAP_MODE_NORTH_UP = 0;// 北首上
	public static final int MAP_MODE_HEADING_UP = 1;// 车头向上

	private String action;
	private String pkgName;
	private String uri; // 利用该URI进行数据库insert操作
	private int mapMode; // 地图方向
	private int mapLevel; // 比例尺
	public ArrayList<PointInfo> point; // 存放经纬度
	private int height; // 高度
	private int width; // 宽度
	public DispKindInfo dispKind; // 显示物
	public ArrayList<DispIconInfo> dispIcon; // 图标

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPkgName() {
		return pkgName;
	}

	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public int getMapMode() {
		return mapMode;
	}

	public void setMapMode(int mapMode) {
		this.mapMode = mapMode;
	}

	public int getMapLevel() {
		return mapLevel;
	}

	public void setMapLevel(int mapLevel) {
		this.mapLevel = mapLevel;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public static class PointInfo implements Serializable {
		private static final long serialVersionUID = -8560688100048400228L;
		private double lat;

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}

		public double getLon() {
			return lon;
		}

		public void setLon(double lon) {
			this.lon = lon;
		}

		private double lon;

		@Override
		public String toString() {
			return "PointInfo [lat=" + lat + ", lon=" + lon + "]";
		}
	}

	public static class DispKindInfo implements Serializable {
		private static final long serialVersionUID = -8560688100048400228L;
		private int PosIcon; // 自车位置图标
		private int Jam; // 拥堵线
		private int Route; // route
		private int Mark; // 用户标记
		private int Icon; // 地图图标
		private int Compass; // 罗盘按钮
		private int scale; // 比例尺
		private int mode; // 昼夜
		private int cursor; // 地图中心光标

		public int getPosIcon() {
			return PosIcon;
		}

		public void setPosIcon(int posIcon) {
			PosIcon = posIcon;
		}

		public int getJam() {
			return Jam;
		}

		public void setJam(int jam) {
			Jam = jam;
		}

		public int getRoute() {
			return Route;
		}

		public void setRoute(int route) {
			Route = route;
		}

		public int getMark() {
			return Mark;
		}

		public void setMark(int mark) {
			Mark = mark;
		}

		public int getIcon() {
			return Icon;
		}

		public void setIcon(int icon) {
			Icon = icon;
		}

		public int getCompass() {
			return Compass;
		}

		public void setCompass(int compass) {
			Compass = compass;
		}

		public int getScale() {
			return scale;
		}

		public void setScale(int scale) {
			this.scale = scale;
		}

		public int getMode() {
			return mode;
		}

		public void setMode(int mode) {
			this.mode = mode;
		}

		public int getCursor() {
			return cursor;
		}

		public void setCursor(int cursor) {
			this.cursor = cursor;
		}
	}

	public static class DispIconInfo implements Serializable {
		private static final long serialVersionUID = -8560688100048400228L;
		private double lat; // 纬度
		private double lon; // 经度
		private String IconPath; // 图标路径

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}

		public double getLon() {
			return lon;
		}

		public void setLon(double lon) {
			this.lon = lon;
		}

		public String getIconPath() {
			return IconPath;
		}

		public void setIconPath(String iconPath) {
			IconPath = iconPath;
		}
	}
}

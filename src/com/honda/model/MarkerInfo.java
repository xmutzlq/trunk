package com.honda.model;

import java.util.ArrayList;

public class MarkerInfo {

/**±Í«© π”√*/
	public static final int MARKER_MAX_SIZE = 100;

	private String action;
	private String pkgName;
	private int marker_act;
	private int marker_cnt;
	public ArrayList<MarkersInfo> markers;

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

	public int getMarker_act() {
		return marker_act;
	}

	public void setMarker_act(int marker_act) {
		this.marker_act = marker_act;
	}

	public int getMarker_cnt() {
		return marker_cnt;
	}

	public void setMarker_cnt(int marker_cnt) {
		this.marker_cnt = marker_cnt;
	}

	public ArrayList<MarkersInfo> getMarkers() {
		return markers;
	}

	public void setMarkers(ArrayList<MarkersInfo> markers) {
		this.markers = markers;
	}

	public static class MarkersInfo {

		private String label;
		private String tts;
		private String audioID;
		private int outmost;
		private int dcenter;
		private double lat;
		private double lon;
		private String iconUri;
		private String iconAddr;
		private String iconTel;
		private String detail;
		private int markerPosition;
		private String expire;

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getTts() {
			return tts;
		}

		public void setTts(String tts) {
			this.tts = tts;
		}

		public String getAudioID() {
			return audioID;
		}

		public void setAudioID(String audioID) {
			this.audioID = audioID;
		}

		public int getOutmost() {
			return outmost;
		}

		public void setOutmost(int outmost) {
			this.outmost = outmost;
		}

		public int getDcenter() {
			return dcenter;
		}

		public void setDcenter(int dcenter) {
			this.dcenter = dcenter;
		}

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

		public String getIconUri() {
			return iconUri;
		}

		public void setIconUri(String iconUri) {
			this.iconUri = iconUri;
		}

		public String getIconAddr() {
			return iconAddr;
		}

		public void setIconAddr(String iconAddr) {
			this.iconAddr = iconAddr;
		}

		public String getIconTel() {
			return iconTel;
		}

		public void setIconTel(String iconTel) {
			this.iconTel = iconTel;
		}

		public String getDetail() {
			return detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public int getMarkerPosition() {
			return markerPosition;
		}

		public void setMarkerPosition(int markerPosition) {
			this.markerPosition = markerPosition;
		}

		public String getExpire() {
			return expire;
		}

		public void setExpire(String expire) {
			this.expire = expire;
		}
	}
}

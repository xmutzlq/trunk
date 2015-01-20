package com.honda.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 路径设置信息
 * 
 * @author liqin.zeng
 * 
 */
public class RouteSettingInfo implements Serializable {

	private static final long serialVersionUID = -8560688100048400228L;

	private String action;
	private String pkgName;
	private String cal_param;// 搜索条件
	private String trf_source;// 指定信息源
	private String trf_time;// 旅行时间信息源
	public SettingsInof settings;// 其他条件
	private String start_name;// 出发地名称
	private String start_lat;// 出发地纬度
	private String start_lon;// 出发地经度
	private String dir;// 出发地方位
	private String start_att;// 出发地道路属性
	private String goal_name;// 目的地名称
	private String goal_lat;// 目的地纬度
	private String goal_lon;// 目的地经度
	private String goal_att;// 目的地道路属性
	public ArrayList<PassInfo> pass;// 经由地Point信息
	private String route_name;// 路径名称

	public static class SettingsInof implements Serializable {

		private static final long serialVersionUID = -8560688100048400228L;

		private String prm;

		public String getPrm() {
			return prm;
		}

		public void setPrm(String prm) {
			this.prm = prm;
		}
	}

	public static class PassInfo implements Serializable {

		private static final long serialVersionUID = -8560688100048400228L;

		private String pass_name;
		private String pass_lat;
		private String pass_lon;
		private String pass_att;

		public String getPass_name() {
			return pass_name;
		}

		public void setPass_name(String pass_name) {
			this.pass_name = pass_name;
		}

		public String getPass_lat() {
			return pass_lat;
		}

		public void setPass_lat(String pass_lat) {
			this.pass_lat = pass_lat;
		}

		public String getPass_lon() {
			return pass_lon;
		}

		public void setPass_lon(String pass_lon) {
			this.pass_lon = pass_lon;
		}

		public String getPass_att() {
			return pass_att;
		}

		public void setPass_att(String pass_att) {
			this.pass_att = pass_att;
		}
	}

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

	public String getCal_param() {
		return cal_param;
	}

	public void setCal_param(String cal_param) {
		this.cal_param = cal_param;
	}

	public String getTrf_source() {
		return trf_source;
	}

	public void setTrf_source(String trf_source) {
		this.trf_source = trf_source;
	}

	public String getTrf_time() {
		return trf_time;
	}

	public void setTrf_time(String trf_time) {
		this.trf_time = trf_time;
	}

	public String getStart_name() {
		return start_name;
	}

	public void setStart_name(String start_name) {
		this.start_name = start_name;
	}

	public String getStart_lat() {
		return start_lat;
	}

	public void setStart_lat(String start_lat) {
		this.start_lat = start_lat;
	}

	public String getStart_lon() {
		return start_lon;
	}

	public void setStart_lon(String start_lon) {
		this.start_lon = start_lon;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getStart_att() {
		return start_att;
	}

	public void setStart_att(String start_att) {
		this.start_att = start_att;
	}

	public String getGoal_name() {
		return goal_name;
	}

	public void setGoal_name(String goal_name) {
		this.goal_name = goal_name;
	}

	public String getGoal_lat() {
		return goal_lat;
	}

	public void setGoal_lat(String goal_lat) {
		this.goal_lat = goal_lat;
	}

	public String getGoal_lon() {
		return goal_lon;
	}

	public void setGoal_lon(String goal_lon) {
		this.goal_lon = goal_lon;
	}

	public String getGoal_att() {
		return goal_att;
	}

	public void setGoal_att(String goal_att) {
		this.goal_att = goal_att;
	}

	public String getRoute_name() {
		return route_name;
	}

	public void setRoute_name(String route_name) {
		this.route_name = route_name;
	}
}

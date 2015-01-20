package com.honda.displayaudio.system.telemainfo;

import android.os.Parcel;
import android.os.Parcelable;

public class DialupInfo implements Parcelable{
	
	private static final String TAG = "DialupInfo";

	private String ispId = "";

	private String title1 = "";

	private String title2 = "";

	private String phoneNum = "";

	private String user = "";

	private String password = "";

	private String cid = "";

	private String protocol = "";

	private String apn = "";

	private String dns = "";

	private String dns1 = "";

	private String dns2 = "";

	private String proxy = "";

	private String proxy1 = "";

	private String mode = "";

	private String modem = "";

	private String note = "";

	private String reserve = "";

	public DialupInfo(String ispId, String title1, String title2, String phoneNum, String user, String password, String cid, String protocol, String apn, String dns, String dns1, String dns2, String proxy, String proxy1, String mode, String modem, String note, String reserve) {
	}

	public DialupInfo() {
	}

	public String getIspId() {
		return ispId;
	}

	public void setIspId(String ispId) {
	}

	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
	}

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
	}

	public String getApn() {
		return apn;
	}

	public void setApn(String apn) {
	}

	public String getDns() {
		return dns;
	}

	public void setDns(String dns) {
	}

	public String getDns1() {
		return dns1;
	}

	public void setDns1(String dns1) {
	}

	public String getDns2() {
		return dns2;
	}

	public void setDns2(String dns2) {
	}

	public String getProxy() {
		return proxy;
	}

	public void setProxy(String proxy) {
	}

	public String getProxy1() {
		return proxy1;
	}

	public void setProxy1(String proxy1) {
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
	}

	public String getModem() {
		return modem;
	}

	public void setModem(String modem) {
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
	}
	

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeString(ispId);
		out.writeString(title1);
		out.writeString(title2);
		out.writeString(phoneNum);
		out.writeString(user);
		out.writeString(password);
		out.writeString(cid);
		out.writeString(protocol);
		out.writeString(apn);
		out.writeString(dns);
		out.writeString(dns1);
		out.writeString(dns2);
		out.writeString(proxy);
		out.writeString(proxy1);
		out.writeString(mode);
		out.writeString(modem);
		out.writeString(note);
		out.writeString(reserve);
	}

	public static final Parcelable.Creator<DialupInfo> CREATOR = new Parcelable.Creator<DialupInfo>() {
		@Override
		public DialupInfo createFromParcel(Parcel in) {
			DialupInfo info = new DialupInfo();
			info.ispId = in.readString();
			info.title1 = in.readString();
			info.title2 = in.readString();
			info.phoneNum = in.readString();
			info.user = in.readString();
			info.password = in.readString();
			info.cid = in.readString();
			info.protocol = in.readString();
			info.apn = in.readString();
			info.dns = in.readString();
			info.dns1 = in.readString();
			info.dns2 = in.readString();
			info.proxy = in.readString();
			info.proxy1 = in.readString();
			info.mode = in.readString();
			info.modem = in.readString();
			info.note = in.readString();
			info.reserve = in.readString();
			return info;
		}

		@Override
		public DialupInfo[] newArray(int size) {
			return new DialupInfo[size];
		}
	};
}

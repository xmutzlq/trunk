package com.honda.server;

import android.os.Parcel;
import android.os.Parcelable;

public class MapImageData implements Parcelable {

	public int MapImageType;
	public String Description;
	public int MajorVersion;
	public int MinorVersion;
	public boolean IsUnlock;
	
	public int getMapImageType() {
		return MapImageType;
	}

	public void setMapImageType(int mapImageType) {
		MapImageType = mapImageType;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getMajorVersion() {
		return MajorVersion;
	}

	public void setMajorVersion(int majorVersion) {
		MajorVersion = majorVersion;
	}

	public int getMinorVersion() {
		return MinorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		MinorVersion = minorVersion;
	}

	public boolean isIsUnlock() {
		return IsUnlock;
	}

	public void setIsUnlock(boolean isUnlock) {
		IsUnlock = isUnlock;
	}

	public MapImageData() {
	}

	public MapImageData(int MapImageType, String Description,
			int MajorVersion, int MinorVersion, boolean IsUnlock) {
		this.MapImageType = MapImageType;
		this.Description = Description;
		this.MajorVersion = MajorVersion;
		this.MinorVersion = MinorVersion;
		this.IsUnlock = IsUnlock;
	}

	public static final Parcelable.Creator<MapImageData> CREATOR = new Parcelable.Creator<MapImageData>() {
		@Override
		public MapImageData createFromParcel(Parcel in) {
			return new MapImageData(in);
		}

		@Override
		public MapImageData[] newArray(int size) {
			return new MapImageData[size];
		}
	};

	private MapImageData(Parcel in) {
		MapImageType = in.readInt();
		Description = in.readString();
		MajorVersion = in.readInt();
		MinorVersion = in.readInt();
		IsUnlock = (in.readInt() == 1);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(MapImageType);
		dest.writeString(Description);
		dest.writeInt(MajorVersion);
		dest.writeInt(MinorVersion);
		dest.writeInt(IsUnlock ? 1 : 0);
	}
}

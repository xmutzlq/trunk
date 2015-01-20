package com.honda.aidl;

/**
 * 模拟service binding 生命周期，在使用时只需按照该流程走完即可
 * 
 * @author liqin.zeng
 */
public interface ServiceBindable {

	public void onCreate();

	public void onDestory();
}

package com.honda.aidl;

import android.content.Context;

import java.util.ArrayList;

/**
 * ServiceBinded管理，单例
 * 
 * @author liqin.zeng
 */
public class ServiceBindedManager {

	private ArrayList<ServiceBindable> services;

	private static ServiceBindedManager serviceManager;

	public static synchronized void syncInit() {
		if (serviceManager == null) {
			serviceManager = new ServiceBindedManager();
		}
	}

	public static ServiceBindedManager getInstance() {
		if (serviceManager == null) {
			syncInit();
		}
		return serviceManager;
	}

	public ServiceBindedManager() {
		services = new ArrayList<ServiceBindable>();
	}

	/**
	 * 启动绑定所有服务
	 */
	private void startServiceBind() {
		for (ServiceBindable serviceBindable : services) {
			serviceBindable.onCreate();
		}
	}

	/**
	 * 解除绑定所有服务
	 */
	private void stopServiceBind() {
		for (ServiceBindable serviceBindable : services) {
			serviceBindable.onDestory();
		}
	}

	public void clearServiceManager() {
		if (services != null) {
			stopServiceBind();
			services.clear();
			services = null;
			serviceManager = null;
		}
	}

	/**
	 * 手动注册
	 * 
	 * @param context
	 */
	public void registAllServiceBinding(Context context) {
		registService(new NaviInfoProviderServerBinding(context));
		startServiceBind();
	}

	public void registService(ServiceBindable action) {
		if (services != null) {
			if (!services.contains(action)) {
				services.add(action);
			}
		}
	}

	public void unRegistService(ServiceBindable action) {
		if (services != null) {
			services.remove(action);
		}
	}

	public ArrayList<ServiceBindable> getServices() {
		return services;
	}
}

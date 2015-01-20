package com.honda.server;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.honda.model.MarkerInfo;
import com.honda.model.MinimapInfo;
import com.honda.model.MinimapInfo.DispIconInfo;
import com.honda.model.MinimapInfo.DispKindInfo;
import com.honda.model.MinimapInfo.PointInfo;
import com.honda.model.RouteSettingInfo;
import com.honda.provider.MarkerProviderMetaData;
import com.honda.provider.MiniMapProviderMetaData;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceDemoActivity extends Activity implements OnClickListener {

	private static final String TAG = ServiceDemoActivity.class.getSimpleName();
	private static final int BIND_VIEW_COUNT = 5;
	private LinearLayout mainLay;

	private Button startVehicelServer, closeVehicelServer;
	private Button startSettingView, setRouteData, getRouteData;
	private Button mainActionBtn, mainActionBtn2;
	private Button carDriveStateBtn, carParkStateBtn;
	private Button minimapGetAndShowBtn, getMimiMapBtn;
	private Button markListDbBtn;

	private ImageView minimapShowIV;

	private EditText edit1, edit2;
	private TextView textview1, textview2;

	private boolean isA1Start, isA2Start;

	
	private final BroadcastReceiver mBroadcastReceiver2 = new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context context, Intent intent) {
			MapImageData[] mapImageData = (MapImageData[]) intent.getParcelableArrayExtra("MapImageData.MAP_DATA_KEY");
			for (MapImageData mapImageData2 : mapImageData) {
				Log.e(TAG, mapImageData2.getMapImageType() +"," +mapImageData2.getDescription() +"," + mapImageData2.getMajorVersion() +","+mapImageData2.getMinorVersion());
			}
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("ServiceDemoActivity", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_lay);
		registerReceiver(mBroadcastReceiver2, new IntentFilter("com.honda.displayauido.navi.action.RETRUN_MAP_INFO"));
		sendBroadcast(new Intent("com.honda.displayauido.navi.action.REQUEST_MAP_INFO"));
//		ServiceBindedManager.getInstance().registAllServiceBinding(getApplicationContext());
		//		mainLay = (LinearLayout) findViewById(R.id.main_lay);
		//
		//		Animation a = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
		//				Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
		//				0.5f, Animation.RELATIVE_TO_SELF, 0.0f);
		//		Animation b = new AlphaAnimation(0.0f, 1.0f);
		//		final AnimationSet as = new AnimationSet(true);
		//		as.addAnimation(a);
		//		as.addAnimation(b);
		//		as.setDuration(500);
		//
		//		textview1 = (TextView) findViewById(R.id.tip_tv1);
		//		textview2 = (TextView) findViewById(R.id.tip_tv2);
		//
		//		edit1 = (EditText) findViewById(R.id.edit_tv);
		//		edit1.addTextChangedListener(new TextWatcher() {
		//
		//			@Override
		//			public void onTextChanged(CharSequence s, int start, int before,
		//					int count) {
		//				if (s != null) {
		//					if (s.length() > 0) {
		//						if (!isA1Start) {
		//							textview1.startAnimation(as);
		//							textview1.setVisibility(View.VISIBLE);
		//							isA1Start = true;
		//						}
		//					} else if (s.length() == 0) {
		//						if (isA1Start) {
		//							textview1.clearAnimation();
		//							textview1.setVisibility(View.INVISIBLE);
		//							isA1Start = false;
		//						}
		//					}
		//				}
		//			}
		//
		//			@Override
		//			public void beforeTextChanged(CharSequence s, int start, int count,
		//					int after) {
		//			}
		//
		//			@Override
		//			public void afterTextChanged(Editable s) {
		//			}
		//		});
		//		edit2 = (EditText) findViewById(R.id.edit_tv2);
		//		edit2.addTextChangedListener(new TextWatcher() {
		//
		//			@Override
		//			public void onTextChanged(CharSequence s, int start, int before,
		//					int count) {
		//				if (s != null) {
		//					if (s.length() > 0) {
		//						if (!isA2Start) {
		//							textview2.startAnimation(as);
		//							textview2.setVisibility(View.VISIBLE);
		//							isA2Start = true;
		//						}
		//					} else if (s.length() == 0) {
		//						if (isA2Start) {
		//							textview2.clearAnimation();
		//							textview2.setVisibility(View.GONE);
		//							isA2Start = false;
		//						}
		//					}
		//				}
		//			}
		//
		//			@Override
		//			public void beforeTextChanged(CharSequence s, int start, int count,
		//					int after) {
		//			}
		//
		//			@Override
		//			public void afterTextChanged(Editable s) {
		//			}
		//		});
		//
		//		minimapShowIV = (ImageView) findViewById(R.id.map_show_iv);
		//
		//		startVehicelServer = (Button) findViewById(R.id.start_vehicel_server);
		//		startVehicelServer.setOnClickListener(this);
		//		closeVehicelServer = (Button) findViewById(R.id.close_vehicel_server);
		//		closeVehicelServer.setOnClickListener(this);
		//		startSettingView = (Button) findViewById(R.id.start_setting_page);
		//		startSettingView.setOnClickListener(this);
		//		setRouteData = (Button) findViewById(R.id.set_route_date);
		//		setRouteData.setOnClickListener(this);
		//		getRouteData = (Button) findViewById(R.id.get_route_date);
		//		getRouteData.setOnClickListener(this);
		//		mainActionBtn = (Button) findViewById(R.id.action_main_btn);
		//		mainActionBtn.setOnClickListener(this);
		//		mainActionBtn2 = (Button)findViewById(R.id.action_main_btn_2);
		//		mainActionBtn2.setOnClickListener(this);
		//		carDriveStateBtn = (Button) findViewById(R.id.car_drive_state_btn);
		//		carDriveStateBtn.setOnClickListener(this);
		//		carParkStateBtn = (Button) findViewById(R.id.car_park_state_btn);
		//		carParkStateBtn.setOnClickListener(this);
		//		minimapGetAndShowBtn = (Button) findViewById(R.id.mini_map_btn);
		//		minimapGetAndShowBtn.setOnClickListener(this);
		//		getMimiMapBtn = (Button) findViewById(R.id.send_mini_map_btn);
		//		getMimiMapBtn.setOnClickListener(this);
		//		markListDbBtn = (Button) findViewById(R.id.mark_list_db_btn);
		//		markListDbBtn.setOnClickListener(this);
		//		ServiceBindedManager.getInstance().registAllServiceBinding(this);
		//
		//		registBro();

	}

	public static boolean isServiceRunning(Context context, String className) {

		boolean isRunning = false;

		ActivityManager activityManager = (ActivityManager) context
				.getSystemService(ACTIVITY_SERVICE);

		List<ActivityManager.RunningServiceInfo> serviceList = activityManager
				.getRunningServices(Integer.MAX_VALUE);

		if (!(serviceList.size() > 0)) {
			return false;
		}

		for (int i = 0; i < serviceList.size(); i++) {
			if (serviceList.get(i).service.getClassName().equals(className) == true) {
				isRunning = true;
				break;
			}
		}

		return isRunning;
	}

	@Override
	protected void onDestroy() {
		unregisterReceiver(mBroadcastReceiver2);
		super.onDestroy();
	}

	private void unregisterReceiver(String string) {
		// TODO Auto-generated method stub
		
	}

	private void registBro() {
		IntentFilter intentFilter = new IntentFilter();
		intentFilter.addAction("com.honda.displayaudio.navi.action.RES_ROUTE_INFO");
		intentFilter.addAction("com.honda.server.other");
		registerReceiver(mBroadcastReceiver, new IntentFilter(intentFilter));
	}

	private void unregistBro() {
		unregisterReceiver(mBroadcastReceiver);
	}

	private final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {
			if (intent == null) {
				return;
			}
			if (intent.getAction().equals("com.honda.server.other")) {
				Intent intentN = new Intent(
						"com.honda.displayaudio.navi.action.GET_MINIMAP_IMAGE");
				MinimapInfo minimapInfo = new MinimapInfo();
				DisplayMetrics dm = new DisplayMetrics();
				getWindowManager().getDefaultDisplay().getMetrics(dm);
				minimapInfo.setAction("GET_MINIMAP_IMAGE");
				minimapInfo.setPkgName("com.honda.displayaudio.navi");
				minimapInfo.setWidth(dm.widthPixels);
				minimapInfo.setHeight(dm.heightPixels);
				minimapInfo.setUri("content://jp.honda.navi/png/1/1.png");
				minimapInfo.setMapMode(0);
				minimapInfo.setMapLevel(6);
				ArrayList<PointInfo> points = new ArrayList<PointInfo>();
				PointInfo pointInfo = new PointInfo();
				pointInfo.setLat(23.128705d);
				pointInfo.setLon(113.268146d);
				points.add(pointInfo);
				minimapInfo.point = points;
				DispKindInfo dispKindInfo = new DispKindInfo();
				dispKindInfo.setPosIcon(0);
				minimapInfo.dispKind = dispKindInfo;
				ArrayList<DispIconInfo> dispIconInfos = new ArrayList<DispIconInfo>();
				DispIconInfo dispIconInfo = new DispIconInfo();
				dispIconInfo.setLat(23.128705d);
				dispIconInfo.setLon(113.268146d);
				dispIconInfo.setIconPath("");
				dispIconInfos.add(dispIconInfo);
				minimapInfo.dispIcon = dispIconInfos;
				Gson minimapGson = new Gson();
				String minimapGsonData = minimapGson.toJson(minimapInfo);
				intentN.putExtra("com.honda.displayaudio.navi.extra.PARAMS",
						minimapGsonData);
				sendBroadcast(intentN);
			} else {
				String data = intent
						.getStringExtra("com.honda.displayaudio.navi.extra.PARAMS");
				if (!TextUtils.isEmpty(data)) {
					Log.e(TAG, data);
				}
			}
		}
	};

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.start_vehicel_server:
			startService(new Intent(
					"com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService"));
			Toast.makeText(getApplicationContext(), "服务已启动", Toast.LENGTH_SHORT)
			.show();
			break;

		case R.id.close_vehicel_server:
			stopService(new Intent(
					"com.honda.displayaudio.system.vehicleinfo.IVehicleInfoService"));
			Toast.makeText(getApplicationContext(), "服务已停止", Toast.LENGTH_SHORT)
			.show();
			break;

		case R.id.start_setting_page:
			Intent intent = new Intent();
			intent.setAction("com.honda.displayaudio.navi.action.START_NAVI_SETTING");
			startActivity(intent);
			break;
		case R.id.set_route_date:
			Intent intent2 = new Intent(
					"com.honda.displayaudio.navi.action.SET_ROUTE");
			RouteSettingInfo routeSettingInfo = new RouteSettingInfo();
			routeSettingInfo.setAction("SET_ROUTE");
			routeSettingInfo.setPkgName("com.honda.displayaudio.navi");
			routeSettingInfo.setCal_param("27");
			routeSettingInfo.setTrf_source("0");
			routeSettingInfo.setTrf_time("0");
			RouteSettingInfo.SettingsInof s = new RouteSettingInfo.SettingsInof();
			s.setPrm("DATE=201404071230,0&R_MAP=0");
			routeSettingInfo.settings = s;
			routeSettingInfo.setStart_name("hwyon");
			routeSettingInfo.setStart_lat("50");
			routeSettingInfo.setStart_lon("100");
			routeSettingInfo.setDir("250");
			routeSettingInfo.setStart_att("hwyon");
			routeSettingInfo.setGoal_name("高德");
			routeSettingInfo.setGoal_lat("24485610");
			routeSettingInfo.setGoal_lon("118187535");
			routeSettingInfo.setGoal_att("hwyon");
			ArrayList<RouteSettingInfo.PassInfo> ps = new ArrayList<RouteSettingInfo.PassInfo>();
			RouteSettingInfo.PassInfo p = new RouteSettingInfo.PassInfo();
			p.setPass_name("123");
			p.setPass_lat("50");
			p.setPass_lon("100");
			p.setPass_att("hwyon");
			ps.add(p);
			routeSettingInfo.pass = ps;
			routeSettingInfo.setRoute_name("Route44");

			Gson gson = new Gson();
			String jsonData = gson.toJson(routeSettingInfo);
			Log.e(TAG, jsonData);
			intent2.putExtra("com.honda.displayaudio.navi.extra.PARAMS",
					jsonData);
			sendBroadcast(intent2);
			break;
		case R.id.get_route_date:
			Intent intent5 = new Intent(
					"com.honda.displayaudio.navi.action.GET_ROUTE_INFO");
			sendBroadcast(intent5);
			break;
		case R.id.action_main_btn:
			Intent gohomeIntent = new Intent("com.honda.displayaudio.navi.action.START_CURRENT_MAP");//
			startActivity(gohomeIntent);
			break;
		case R.id.action_main_btn_2:
			Intent intent3 = new Intent("com.honda.displayaudio.navi.action.START_MAP");//
			intent3.putExtra("com.honda.displayaudio.navi.intent.extra.LAT", 24490674d);
			intent3.putExtra("com.honda.displayaudio.navi.intent.extra.LON", 118176135d);
			intent3.putExtra("com.honda.displayaudio.navi.intent.extra.NAME", "佰翔软件园酒店");
			startActivity(intent3);
			break;
		case R.id.car_drive_state_btn:
			Intent intent4 = new Intent(
					"com.honda.displayaudio.navi.action.ACTION_HANDWRITING_INPUT_METHOD_STATE");
			intent4.putExtra("EXTRA_NAME_PARAM", 1);
			sendBroadcast(intent4);
			break;
		case R.id.car_park_state_btn:
			sendBroadcast(new Intent(
					"com.honda.displayaudio.navi.action.ACTION_HANDWRITING_INPUT_METHOD_STATE"));
			break;
		case R.id.mini_map_btn:
			// testDB();
			displayNote();
			break;
		case R.id.send_mini_map_btn:
			Intent intentN = new Intent(
					"com.honda.displayaudio.navi.action.GET_MINIMAP_IMAGE");
			MinimapInfo minimapInfo = new MinimapInfo();
			DisplayMetrics dm = new DisplayMetrics();
			getWindowManager().getDefaultDisplay().getMetrics(dm);
			minimapInfo.setAction("GET_MINIMAP_IMAGE");
			minimapInfo.setPkgName("com.honda.displayaudio.navi");
			minimapInfo.setWidth(dm.widthPixels);
			minimapInfo.setHeight(dm.heightPixels);
			minimapInfo.setUri("content://jp.honda.navi/png/1/1.png");
			minimapInfo.setMapMode(0);
			minimapInfo.setMapLevel(6);
			ArrayList<PointInfo> points = new ArrayList<PointInfo>();
			PointInfo pointInfo = new PointInfo();
			pointInfo.setLat(39.932078d);
			pointInfo.setLon(116.474497d);
			points.add(pointInfo);
			minimapInfo.point = points;
			DispKindInfo dispKindInfo = new DispKindInfo();
			dispKindInfo.setPosIcon(0);
			minimapInfo.dispKind = dispKindInfo;
			ArrayList<DispIconInfo> dispIconInfos = new ArrayList<DispIconInfo>();
			DispIconInfo dispIconInfo = new DispIconInfo();
			dispIconInfo.setLat(23.128705d);
			dispIconInfo.setLon(113.268146d);
			dispIconInfo.setIconPath("");
			dispIconInfos.add(dispIconInfo);
			minimapInfo.dispIcon = dispIconInfos;
			Gson minimapGson = new Gson();
			String minimapGsonData = minimapGson.toJson(minimapInfo);
			intentN.putExtra("com.honda.displayaudio.navi.extra.PARAMS",
					minimapGsonData);
			sendBroadcast(intentN);
			break;
		case R.id.mark_list_db_btn:
			testMarkerDB();
			MarkerInfo markerInfo = new MarkerInfo();
			markerInfo.setAction("SET_MARKER");
			markerInfo.setPkgName("com.honda.displayaudion.navi");
			markerInfo.setMarker_act(0);
			markerInfo.setMarker_cnt(3);
			ArrayList<MarkerInfo.MarkersInfo> markersInfoList = new ArrayList<MarkerInfo.MarkersInfo>();
			for (int i = 0; i < 3; i++) {
				MarkerInfo.MarkersInfo markersInfo = new MarkerInfo.MarkersInfo();
				markersInfo.setLabel("Mark" + i);
				markersInfo.setTts("Mark TTS");
				markersInfo.setAudioID("audio" + i);
				markersInfo.setOutmost(100);
				markersInfo.setDcenter(90);
				if (i == 0) {
					markersInfo.setLat(23.18616d);
					markersInfo.setLon(113.406424d);
					markersInfo
					.setIconUri("content://jp.co.honda.otherapl/icon/1");
				} else if (i == 1) {
					markersInfo.setLat(23.18816d);
					markersInfo.setLon(113.408424d);
					markersInfo
					.setIconUri("content://jp.co.honda.otherapl/icon/2");
				} else if (i == 2) {
					markersInfo.setLat(23.18316d);
					markersInfo.setLon(113.403424d);
					markersInfo
					.setIconUri("content://jp.co.honda.otherapl/icon/3");
				}
				markersInfo.setIconAddr("京东");
				markersInfo.setIconTel("000000001");
				markersInfo.setDetail("new marker");
				markersInfo.setMarkerPosition(0);
				markersInfo.setExpire(new Date().toString());
				markersInfoList.add(markersInfo);
			}
			markerInfo.setMarkers(markersInfoList);
			Gson markerGson = new Gson();
			String markerGsonData = markerGson.toJson(markerInfo);
			Log.e(TAG, markerGsonData);
			Intent markerIntent = new Intent();
			markerIntent
			.setAction("com.honda.displayaudio.navi.action.SET_MARKER");
			markerIntent.putExtra("com.honda.displayaudio.navi.extra.PARAMS",
					markerGsonData);
			sendBroadcast(markerIntent);
			break;
		}
	}

	// private void

	// 测试数据库
	private void testDB() {

		getContentResolver().delete(
				MiniMapProviderMetaData.MiniMapTableMetaData.CONTENT_URI, null,
				null);

		ContentValues values = new ContentValues();
		values.put(MiniMapProviderMetaData.MiniMapTableMetaData.MINIMAP_ID,
				"p1");
		values.put(MiniMapProviderMetaData.MiniMapTableMetaData.MINIMAP_TYPE,
				"img_png");
		values.put(MiniMapProviderMetaData.MiniMapTableMetaData.MINIMAP_DATA,
				imgByte(R.drawable.ic_launcher));
		getContentResolver().insert(
				MiniMapProviderMetaData.MiniMapTableMetaData.CONTENT_URI,
				values);
		values.clear();
	}

	private void testMarkerDB() {
		// getContentResolver().delete(
		// MarkerProviderMetaData.MarkerTableMetaData.CONTENT_URI, null,
		// null);
		for (int i = 0; i < 3; i++) {
			ContentValues values = new ContentValues();
			values.put(MarkerProviderMetaData.MarkerTableMetaData.MINIMAP_ID,
					"m" + i);
			values.put(MarkerProviderMetaData.MarkerTableMetaData.MINIMAP_TYPE,
					"icon");
			values.put(MarkerProviderMetaData.MarkerTableMetaData.MINIMAP_DATA,
					imgByte(R.drawable.ic_favorite_catering_large));
			getContentResolver().insert(
					MarkerProviderMetaData.MarkerTableMetaData.CONTENT_URI,
					values);
		}
	}

	// R.drawable.ic_3d_1
	public byte[] imgByte(int id) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		Bitmap bitmap = ((BitmapDrawable) getResources().getDrawable(id))
				.getBitmap();
		bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
		return baos.toByteArray();
	}

	// 测试数据库
	private void displayNote() {
		ArrayList<Bitmap> maps = new ArrayList<Bitmap>();
		Uri myUri = Uri.parse("content://"
				+ MiniMapProviderMetaData.AUTHORITY
				+ "/png");
		Cursor cur = getContentResolver().query(myUri, null, null, null, null);
		if (cur != null) {
			if (cur.moveToFirst()) {
				byte[] date = null;
				do {
					date = cur
							.getBlob(cur
									.getColumnIndex("minimap_data"));
					Bitmap bmpout = BitmapFactory.decodeByteArray(date, 0,
							date.length);
					if (bmpout != null) {
						maps.add(bmpout);
					}
				} while (cur.moveToNext());
			}
			cur.close();
		}

		if (maps.size() > 0) {
			BitmapDrawable bd = new BitmapDrawable(getResources(), maps.get(0));
			minimapShowIV.setBackgroundDrawable(bd);
		}
	}
}

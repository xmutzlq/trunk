package com.honda.util;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convert {
	public static JSONObject generate(List list) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("totalProperty", list.size());
		map.put("root", list);
		return new JSONObject(map);
	}

	public static JSONObject javabean2json(Object object) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		map.put("data", object);
		return new JSONObject(map);
	}
}
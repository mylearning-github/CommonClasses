package com.common.classes.responses;


import java.util.LinkedHashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SuccessResponse {

	
	private String message;
	
	public static Map<String, Object> successResponse(String message) {
		
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("Message", message);
		return map;
		
	}
	
}

package com.omar.springapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/test")
	public Map<String, String> test(){
		Map<String, String> response = new HashMap<>();
		
		response.put("STATUS", "SUCCESS");
		
		return response;
	}
}

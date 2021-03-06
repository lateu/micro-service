package com.lateu.ms.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceCompanyProperties {
	
	@Value("${server.port}")
	private String server_port;
	/*@Value("${threat}")
	private String threat;*/
	@GetMapping(value = "/myParam")
	public Map<String, Object> getParam(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("server_port", server_port);
		map.put("threat", Thread.currentThread().getName());
		
		return map;
	}

}

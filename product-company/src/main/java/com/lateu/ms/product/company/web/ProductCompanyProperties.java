package com.lateu.ms.product.company.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCompanyProperties {
	
	@Value("${server.port}")
	private String server_port;
	@Value("${spring.jpa.database}")
	private String DBMS;
	@GetMapping(value = "/myParam", name = "/myParam")
	public Map<String, Object> getParam(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("server_port", server_port);
		map.put("DBMS", DBMS);
		
		return map;
	}

}

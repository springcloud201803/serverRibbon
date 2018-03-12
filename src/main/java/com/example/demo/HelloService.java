package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;
	@HystrixCommand(fallbackMethod="resError")
	public String getService(String name) {
		return restTemplate.getForObject("http://SERVER-WEB/getStr?name="+name, String.class);
	}
	
	public String resError(String name){
		return "this is "+name+" error ";
	}
}

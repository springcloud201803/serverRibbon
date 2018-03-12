package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;
	@RequestMapping("getService")
	public @ResponseBody String getService(@RequestParam String name) {
	
		return helloService.getService(name);
	}
}

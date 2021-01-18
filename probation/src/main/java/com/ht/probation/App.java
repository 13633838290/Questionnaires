package com.ht.probation;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@RequestMapping("/testParamBase")
	public String testParamBase(String param) {
		return param;
	}
	
	@RequestMapping("/testMultiParam")
	public String testMultiParam(String param1, String param2) {
		return param1 + ":" + param2;
	}
	
	@RequestMapping("/testModelParam")
	public BeanParam testModelParam(HttpServletRequest req) {
		Enumeration<String> names = req.getParameterNames();
		System.out.println("---------------");
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			System.out.println(name + ":" + req.getParameter(name));
		}
		return null;
	}
}

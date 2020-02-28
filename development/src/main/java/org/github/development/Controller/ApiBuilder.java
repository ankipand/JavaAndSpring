package org.github.development.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ApiBuilder")
public class ApiBuilder {
	
	private static final Logger log = LoggerFactory.getLogger(ApiBuilder.class);

	@RequestMapping("Hello")
	public String Testing() {
		System.out.println("Inside Builder");
		return "Hi ApiBuilder How are you ?";
	}
	
	
	
}

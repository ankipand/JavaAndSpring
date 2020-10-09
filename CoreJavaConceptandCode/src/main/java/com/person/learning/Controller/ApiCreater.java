package com.person.learning.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ApiBuilder")
public class ApiCreater {

@RequestMapping("Hello")
public String Testing() {
	System.out.println("Inside Builder");
	return "Hi ApiBuilder How are you ?";
}
}

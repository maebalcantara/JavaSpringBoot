package com.javaStudies.springboot.myfirstwebapp.hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class SayHelloController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	/* RETURNS A STRING AS RESPONSE
	@GetMapping("say-hello")
	@ResponseBody //returns string literally.
	public String helloWorld() {
		return "Hello";
	} */
	
	@GetMapping("login")
	public String goToLogInPage() {
		//logger.info("Request param is {}", name);
		return "login";
	}
	
	@PostMapping("login")
	public String welcomePage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "welcome";
	}
}

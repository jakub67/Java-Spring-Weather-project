package cz.vsb.austra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/hello")           //pod cim se ma zobrazit
	String Hello() {
		return "Hello world";
	}
}

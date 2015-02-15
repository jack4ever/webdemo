package com.ycl.web.controller.bootstrapdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="bootstrap")
public class BootstrapController {

	@RequestMapping(value="api",method=RequestMethod.GET)
	public String api(){
		return "bootstrap/bootstrapAPI";
	}
	
	@RequestMapping(value="demo1",method=RequestMethod.GET)
	public String demo1(){
		return "bootstrap/demo1";
	}
}

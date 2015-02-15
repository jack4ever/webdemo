package com.ycl.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sitemesh")
public class SitemeshController {

	@RequestMapping("/mai")
	public String mai(){
		return "mai2";
	}
}

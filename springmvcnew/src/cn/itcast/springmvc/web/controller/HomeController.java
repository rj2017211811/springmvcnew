package cn.itcast.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home.action")
	public String goHome()
	{
		System.out.println("Hello,world");
		return "index";
	}
}

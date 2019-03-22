package com.sp.demo5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("demo5.demoController")
public class DemoController {
	@RequestMapping(value="/demo5/request", method=RequestMethod.GET)
	public String form() {
		
		return "demo5/write";
	}
	
	@RequestMapping(value="/demo5/request", method=RequestMethod.POST)
	public String submit(@ModelAttribute("vo") Demo dto) {
		//포워딩하는 JSP에 vo 라는 이름으로 dto 객체를 넘긴다.
		return "demo5/result";
	}
}

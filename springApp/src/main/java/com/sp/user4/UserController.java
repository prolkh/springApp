package com.sp.user4;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller("user4.userController")
public class UserController {
	@RequestMapping(value="/user4/write", method=RequestMethod.GET)
	public String form() {
		return "user4/write";
	}
	
	
	@RequestMapping(value="/user4/result", method=RequestMethod.POST)
	public Map<String, Object> submit(String name, int age) {
		// Map, Model, ModelMap을 리턴하는 경우 view는 url로 결정된다.
		// Map의 리턴은 AJAX에서 JSON으로 응답할때 많이 사용한다.
		String s="adult";
		if(age<19)
			s="a little baby";
		
		String m=name+" is "+ "\""+s+"\"";
		
		Map<String, Object> map=new HashMap<>();
		map.put("msg", m);
		return map;
	}
	
//	@RequestMapping(value="/user4/result", method=RequestMethod.POST)
//	public Model submit(String name, int age) {
//		String s="adult";
//		if(age<19)
//			s="a little baby";
//		String m=name+" is "+"\""+s+"\"";
//		
//		Model model=new ExtendedModelMap();
//		model.addAttribute("msg", m);
//		
//		return model;
//	}
	
	
}

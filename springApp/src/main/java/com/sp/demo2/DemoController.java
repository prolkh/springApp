package com.sp.demo2;

import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("demo2.demoController")
public class DemoController {
	
	@RequestMapping(value="demo2/request", method=RequestMethod.GET)
	public String form() {
		
		
		return "demo2/write";
	}
	
	@RequestMapping(value="demo2/request", method=RequestMethod.POST)
	public String submit(
			// 파라미터를 Map으로 넘겨 받기
			// Map 앞에 @RequestParam을 붙인다.
			// 동일한 이름의 파라미터가 있으면 하나만 받을 수 있으므로 주의한다.
			@RequestParam Map<String, String> paramMap, 
			Model model) {
		
		String s="name : " + paramMap.get("name")+"<br>";
		s+="age  : " +paramMap.get("age")+"<br>";
		s+="hobby:";
		
		Iterator<String> it= paramMap.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			if(key.startsWith("hobby"))
				s+=paramMap.get(key)+" ";
		}
		model.addAttribute("msg", s);
		
		return "demo2/result";
	}
}

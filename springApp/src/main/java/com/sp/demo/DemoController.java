package com.sp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("demo.domoController")
public class DemoController {
	
	// @RequestParam은 일반적으로 get방식으로 넘어온 변수들을 처리할 때 쓰는 annotation
	@RequestMapping(value="demo/request")
	public String submit(
			@RequestParam(value="irum", required=false) String name,
			@RequestParam(defaultValue="0") int age,	
			//int형은 null을 받을 수 없다.
			//Integer age,
			Model model) {
		
		String s="이름 : "+name+", 나이 : "+age;
		
		model.addAttribute("msg", s);
		
		return "demo/result";
	}
}

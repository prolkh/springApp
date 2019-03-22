package com.sp.demo6;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("demo6.demoController")
@RequestMapping(value="/demo6/request")
public class DemoController {
	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		return "demo6/write";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Demo dto, Model model) {
		
		model.addAttribute("dto", dto);
		return "demo6/result";
	}
	
	@ModelAttribute("memberTypes")
	public List<String> memberTypes() throws Exception {
		List<String> list=new ArrayList<>();
		
		list.add("일반회원");
		list.add("기업회원");
		list.add("VIP회원");
		list.add("VVIP회원");
		list.add("VVVIP회원");
		list.add("VVVVVVVVVVVVVVVVVVVVVVVVIP회원");
		
		return list;
	}
	/*
		* @ModelAttribute를 메소드 위에 기술하는 경우
			- @RequestMapping 보다 먼저 실행
			- @RequestMapping 이 적용되지 않는 별도의 메소드에서 모델에 추가할 객체를 생성
			- 파라미터(인수)는 request, response등 @RequestMapping과 동일
	 */	
	@ModelAttribute("haks")
	public List<String> hakList(HttpServletRequest req) throws Exception{
		List<String> list=new ArrayList<>();
		
		if(req.getMethod().equals("GET")) {
			list.add("대졸");
			list.add("고졸");
			list.add("기타");
		}
		return list;
	}
}

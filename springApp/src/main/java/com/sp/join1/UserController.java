package com.sp.join1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes("user")
@Controller("join1.UserController")
public class UserController {
	
	@ModelAttribute("user")
	public User command() {
		return new User();
	}
	
	@RequestMapping(value="/join1/main", method=RequestMethod.GET)
	public String form(@ModelAttribute("user") User user) {
		return "join1/step1";
	}

	@RequestMapping(value="/join1/step1", method=RequestMethod.POST)
	public String step1(@ModelAttribute("user") User user) {
		return "join1/step2";
	}

	@RequestMapping(value="/join1/step2", method=RequestMethod.POST)
	public String step2(
			@ModelAttribute("user") User user, 
			SessionStatus sessionStatus,
			Model model) {
		
		String s="email: "+user.getEmail()+"<br>";
		s+="name: "+user.getName()+"<br>";
		s+="i d : "+user.getId()+"<br>";
		s+="pwd : "+user.getPwd()+"<br>";
		s+="tel : "+user.getTel()+"<br>";
		
		sessionStatus.setComplete();	//세션에 저장된 모델 지우기
		model.addAttribute("msg", s);
		
		
		return "join1/complete";
	}
	
}

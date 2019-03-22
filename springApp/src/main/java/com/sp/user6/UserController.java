package com.sp.user6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value="/user6/request",method=RequestMethod.GET)
	public String form() {
		return "user6/write";
	}

//	@RequestMapping(value="/user6/request",method=RequestMethod.POST)
//	public String submit(
//			String name,
//			String []hobby,
//			Model model) {
//		String s="name : " + name + "<br>hobby : ";
//		if(hobby!=null) {
//			for(String h: hobby)
//				s+=h+" ";
//		}
//		
//		model.addAttribute("msg", s);
//		
//		return "user6/result";
//	}
	
	@RequestMapping(value="/user6/request", method=RequestMethod.POST)
	public String submit(User dto, Model model) {
		String s="name: "+dto.getName() + "<br>hobby : ";
		if(dto.getHobby() != null) {
			for(String h: dto.getHobby()) {
				s+=h+" ";
			}
		}
		model.addAttribute("msg", s);
		
		return "user6/result";
	}

}

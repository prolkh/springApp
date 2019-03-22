package com.sp.user2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("user2.userController")
public class UserController {
	
	//GET & POST, handling both
	@RequestMapping(value="/user2/write")
	public ModelAndView user(HttpServletRequest req) {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return new ModelAndView("user2/write");
		}
		
		try {
			String name=req.getParameter("name");
			int age=Integer.parseInt(req.getParameter("age"));
			
			String s=name+"is";
			if(age<19)
				s+="a little baby";
			else
				s+="an adult";
					
			ModelAndView mav=new ModelAndView();
			mav.setViewName("user2/result");
			mav.addObject("msg", s);
			
			return mav;
		} catch(Exception e) {
			//redirect: (default=forwarding)
			return new ModelAndView("redirect:/user2/error");	
		}
	}
	
	@RequestMapping(value="/user2/error")
	public String errorForm() {
		return "user2/error";
	}
	
}

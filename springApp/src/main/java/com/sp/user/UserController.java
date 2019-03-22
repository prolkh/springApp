package com.sp.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// @RequestMapping : 다수의 요청 처리
/*
	@RequestMapping(value="/user/write") // GET, POST 요청처리
	@RequestMapping("/user/write")
	@RequestMapping("main*")
	@RequestMapping("*.do")
	@RequestMapping("/＊＊/write")
	@RequestMapping({"/a/a", "/a/b"})
 */


@Controller("user.userController")
public class UserController {
	
	@RequestMapping(value="/user/write", method=RequestMethod.GET)
	public String form() {
		// return type == String : view name. 
		return "user/write";
	}
	
	@RequestMapping(value="/user/write", method=RequestMethod.POST)
	public ModelAndView submit(String name, int age) {
		// return type == ModelAndView : 
		//		executed result를 보여줄 view && view에 전달할 value
		ModelAndView mav=new ModelAndView("user/result");
		
		String s="adult";
		if(age<19)
			s="a little baby";
		
		String msg=name+" is "+ "\""+s+"\"";
		
		mav.addObject("msg", msg); // := request.setAttribute("key","value");
		
		return mav;
	}
	
	
}

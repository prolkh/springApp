package com.sp.demo4;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("demo4.demoController")
public class DemoController {
	@RequestMapping(value="/header/request")
	public String form(Model model) {
		return "demo4/user";
	}
	
	@RequestMapping(value="/header/result")
	public String result(
			@RequestParam String name,
			@RequestHeader("Accept-Language") String lang,
			@RequestHeader("User-Agent") String agent,
			HttpServletRequest req,
			Model model) throws UnsupportedEncodingException {
		
		name=URLDecoder.decode(name, "UTF-8");
		String s="name : "+name+"<br>";
		
		s+="Accept-Language : "+lang+"<br>";
		s+="User-agent : "+agent+"<br>";
		
		//이전 주소 : Referer는 @RequestHeader로 넘겨 받지 못한다.
		String r=req.getHeader("Referer");
		if(r!=null)
			s+="이전 주소 : "+ r+"<br>";
		
		s+="client ip : "+req.getHeader("host")+"<br>";	// ip 주소
//		s+="client ip2 : "+req.getHeader("X-Forwarded-For")+"<br>";
		
		model.addAttribute("msg", s);
		return "demo4/result";
	}
	
	@RequestMapping(value="/cookie/set")
	public String cookieSet(HttpServletResponse resp) {
		Cookie c=new Cookie("subject", "java");	// hangul must be encoded when using cookie
		resp.addCookie(c);
	
		return "demo4/user";
	}
	
	@RequestMapping(value="/cookie/get")
	public String cookieGet(
			@CookieValue(value="subject", required=false) String subject,
			Model model
			) {
		
		String s="Cookie value : "+ subject;
		
		model.addAttribute("msg", s);
		return "demo4/result";
	}
}

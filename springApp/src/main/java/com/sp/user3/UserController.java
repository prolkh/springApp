package com.sp.user3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("user3.userController")
public class UserController {
	
	@RequestMapping(value="/user3/hello")
	public void result(HttpServletResponse resp) throws IOException{
		// return type == void : direct resp control || file download purpose
		Calendar cal=Calendar.getInstance();
		String s=String.format("%tF %tT", cal, cal);
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
		out.print("Today is "+s);
		out.print("</body></html>");
	}
}

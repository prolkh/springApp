package com.sp.user5;

import org.springframework.stereotype.Service;

@Service("user5.userService")
public class UserServiceImpl implements UserService{
	@Override
	public String calculator(User dto) {
		String s=null;
		int a=dto.getNum1();
		int b=dto.getNum2();
		
		switch(dto.getOper()) {
		case "+": s=String.format("%d + %d = %d", a, b, a+b); break;
		case "-": s=String.format("%d - %d = %d", a, b, a-b); break;
		case "*": s=String.format("%d * %d = %d", a, b, a*b); break;
		case "/": s=String.format("%d / %d = %d", a, b, a/b); break;
		}
		
		return s;
	}

}

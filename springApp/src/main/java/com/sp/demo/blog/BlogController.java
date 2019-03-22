package com.sp.demo.blog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("demo.blog.blogController")
public class BlogController {
	private List<Blog> list=new ArrayList<>();
	
	{
		list.add(new Blog("100001", "java", "java study"));
		list.add(new Blog("100002", "servlet", "Web programming"));
		list.add(new Blog("100003", "HTML", "HTML study"));
		list.add(new Blog("100004", "pork", "pork delicious house"));
		list.add(new Blog("100005", "fruit", "delicious fruit"));
	}
	
	@RequestMapping("/blog")
	public String main(Model model) {
		model.addAttribute("list", list);
		
		return "blog/main";
	}
	
	/*
		- @PathVariable
			URI 템플릿을 이용하여 REST 방식의 URL 매칭처리를 위한 어노테이션
			블로그, 카페 등 유저별로 페이지를 구축해야 하는 경우 편리
			@RequestMapping 에서는 {템플릿 변수}를 사용하고
			@PathVariable 에서는 {템플릿 변수}와 동일한 이름의 변수를 추가
	
	 */
	
	@RequestMapping("/blog/{blogId}/main")
	public String execute(
			@PathVariable String blogId,
			Model model) {
		
		Blog dto=null;
		for(Blog vo: list) {
			if(blogId.equals(vo.getUserId())) {
				dto=vo;
				break;
			}
		}
		
		model.addAttribute("dto", dto);
		
		return "blog/view";
	}
	
}

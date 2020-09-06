package com.clone.ticket.users.controller;

import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.clone.ticket.users.dto.UsersDto;
import com.clone.ticket.users.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	private UsersService service;
	
	@RequestMapping("/users/login-form")
	public String loginForm(HttpServletRequest request) {
		
		// url 파라미터가 넘어오는지 읽어와 보기 
		String url=request.getParameter("url");
		
		if(url==null){//목적지 정보가 없다면
			String cPath=request.getContextPath();
			url=cPath+"/home.do"; 
		}
		
		request.setAttribute("url", url);
		
		return "users/login-form";
	}

	@RequestMapping("/users/login")
	public ModelAndView login(UsersDto dto, ModelAndView mView, HttpSession session, HttpServletRequest request) {
		//로그인 후 가야하는 목적지 정보
		String url=request.getParameter("url");
		
		//목적지 정보도 미리 인코딩 해 놓는다.
		String encodedUrl=URLEncoder.encode(url);
		
		//view페이지에 전달하기 위해 ModelAndView 객체에 담아준다. 
		mView.addObject("url", url);
		mView.addObject("encodedUrl", encodedUrl);
		
		System.out.println(url);
		System.out.println(encodedUrl);

		//service 객체를 이용해서 로그인 관련 처리를 한다.
		service.loginProcess(dto, mView, session);
		mView.setViewName("users/login");
		
		return mView;
	}
	
}//UsersController

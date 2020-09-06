package com.clone.ticket.users.service;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.clone.ticket.users.dto.UsersDto;

public interface UsersService {
	public void loginUsers(UsersDto dto, ModelAndView mView, HttpSession session);
	public void loginProcess(UsersDto dto, ModelAndView mView, HttpSession session);
}

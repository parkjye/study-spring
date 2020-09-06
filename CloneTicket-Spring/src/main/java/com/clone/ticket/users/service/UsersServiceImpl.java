package com.clone.ticket.users.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.clone.ticket.users.dao.UsersDao;
import com.clone.ticket.users.dto.UsersDto;

@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersDao usersDao;

	@Override
	public void loginUsers(UsersDto dto, ModelAndView mView, HttpSession session) {
		//dao 객체를 이용해서 id, pwd 가 유효한 정보인지 여부를 얻어낸다. 
		boolean isValid=usersDao.isValid(dto);

		if(isValid) {//만일 유효한 정보면 로그인처리
			session.setAttribute("users_id", dto.getUsers_id());

			//view 페이지에서 사용할 정보 
			mView.addObject("isSuccess", true);

		}else {
			mView.addObject("isSuccess", false);
		}
		
	}

	@Override
	public void loginProcess(UsersDto dto, ModelAndView mView, HttpSession session) {
		
		boolean isValid=usersDao.isValid(dto);

		if(isValid) {//만일 유효한 정보이면 
			//로그인 처리를 한다. 
			session.setAttribute("id", dto.getUsers_id());

			//view 페이지에서 사용할 정보 
			mView.addObject("isSuccess", true);

		}else {
			mView.addObject("isSuccess", false);
		}
		
	}

}//UsersServiceImpl

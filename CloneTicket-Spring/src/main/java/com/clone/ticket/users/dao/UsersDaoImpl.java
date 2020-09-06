package com.clone.ticket.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clone.ticket.users.dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao {
	@Autowired
	private SqlSession session;

	@Override
	public boolean isValid(UsersDto dto) {
		
		String users_id=session.selectOne("users.isValid", dto);
		
		if(users_id==null) {
			return false;
		}else {
			return true;
		}
	}
}

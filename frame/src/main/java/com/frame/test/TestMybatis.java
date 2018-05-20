 package com.frame.test;

import com.frame.bean.User;
import com.frame.mapper.UserMapper;
import com.frame.sqlsession.MySqlsession;

public class TestMybatis {
	
	public static void main(String[] args) {
		MySqlsession sqlsession = new MySqlsession();
		UserMapper mapper = sqlsession.getMapper(UserMapper.class);
		User user = mapper.getUserById("1");
		System.out.println(user);
		
	}
}

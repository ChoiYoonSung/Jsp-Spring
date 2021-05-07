package com.servlet.service;

import java.sql.SQLException;

import com.servlet.exception.InvalidPasswordException;
import com.servlet.exception.NotFoundIDException;
import com.servlet.vo.MemberVO;

public interface IMemberService {
	public int loginCheckId(String memId);
	
//	public MemberVO login(MemberVO member);
	
	public MemberVO login(String memId, String memPw) throws NotFoundIDException, InvalidPasswordException,SQLException;
}

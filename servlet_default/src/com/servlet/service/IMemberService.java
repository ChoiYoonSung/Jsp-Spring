package com.servlet.service;

import java.sql.SQLException;
import java.util.List;

import com.servlet.exception.InvalidPasswordException;
import com.servlet.exception.NotFoundIDException;
import com.servlet.vo.MemberVO;

public interface IMemberService {
	public int loginCheckId(String memId);
	
	public MemberVO login(String memId, String memPw) throws NotFoundIDException, InvalidPasswordException,SQLException;

	public int insertMember(MemberVO member) throws SQLException;
	
	public int updateMember(MemberVO member) throws SQLException;
	
	public int deleteMember(String memId) throws SQLException;
	
	public List<MemberVO> selectAllMember() throws SQLException;
	
	public MemberVO selectMember(String memId) throws SQLException;
}

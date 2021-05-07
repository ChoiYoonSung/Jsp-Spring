package com.servlet.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.servlet.vo.MemberVO;

public interface IMemberDao {
	public int loginCheckId(SqlMapClient smc, String memId) throws SQLException;
	
//	public MemberVO login(SqlMapClient smc, MemberVO memberVO) throws SQLException;
	
	public MemberVO selectMemberById(SqlMapClient smc, String memId)throws SQLException;
}

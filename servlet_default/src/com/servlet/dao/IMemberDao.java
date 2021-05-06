package com.servlet.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.servlet.vo.MemberVO;

public interface IMemberDao {
	public MemberVO login(SqlMapClient smc, MemberVO memberVO) throws SQLException;
	
	public int loginCheckId(SqlMapClient smc, String memId) throws SQLException;
}

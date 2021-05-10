package com.servlet.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.servlet.vo.MemberVO;

public interface IMemberDao {
	public int loginCheckId(SqlMapClient smc, String memId) throws SQLException;
	
//	public MemberVO login(SqlMapClient smc, MemberVO memberVO) throws SQLException;
	
	public MemberVO selectMemberById(SqlMapClient smc, String memId)throws SQLException;

	public int insertMember(SqlMapClient smc, MemberVO member)throws SQLException;
	
	public int updateMember(SqlMapClient smc, MemberVO member)throws SQLException;

	public int deleteMember(SqlMapClient smc, String memId)throws SQLException;
	
	public List<MemberVO> selectAllMember(SqlMapClient smc)throws SQLException;

}

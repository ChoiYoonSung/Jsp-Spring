package com.servlet.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.servlet.vo.MemberVO;

public interface IMemberDao {
	public int loginCheckId(SqlSession session, String memId) throws SQLException;
	
//	public MemberVO login(SqlSession session, MemberVO memberVO) throws SQLException;
	
	public MemberVO selectMemberById(SqlSession session, String memId)throws SQLException;

	public int insertMember(SqlSession session, MemberVO member)throws SQLException;
	
	public int updateMember(SqlSession session, MemberVO member)throws SQLException;

	public int deleteMember(SqlSession session, String memId)throws SQLException;
	
	public List<MemberVO> selectAllMember(SqlSession session)throws SQLException;

}

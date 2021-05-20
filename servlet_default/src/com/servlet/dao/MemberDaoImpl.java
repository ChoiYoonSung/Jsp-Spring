package com.servlet.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.servlet.vo.MemberVO;

public class MemberDaoImpl implements IMemberDao{
	private static IMemberDao memberDao;
	
	public static IMemberDao getInstance() {
		if(memberDao == null) {
			memberDao = new MemberDaoImpl();
		}
		return memberDao;
	}
	
	@Override
	public int loginCheckId(SqlSession session, String memId) throws SQLException {
		int cnt = (int) session.selectOne("member.loginCheckId", memId);
		return cnt;
	}
	
//	@Override
//	public MemberVO login(SqlSession session, MemberVO memberVO) throws SQLException {
//		MemberVO mv = (MemberVO) smc.queryForObject("member.login", memberVO);
//		return mv;
//	}
	
	@Override
	public MemberVO selectMemberById(SqlSession session, String memId) throws SQLException {
		MemberVO member = (MemberVO) session.selectOne("member.selectMemberByID", memId);
		return member;
	}

	@Override
	public int insertMember(SqlSession session, MemberVO member) throws SQLException {
		int cnt = session.insert("member.insertMember", member);
		return cnt;
	}

	@Override
	public int updateMember(SqlSession session, MemberVO member) throws SQLException {
		int cnt = (int) session.update("member.updateMember", member);
		return cnt;
	}

	@Override
	public int deleteMember(SqlSession session, String memId) throws SQLException {
		int cnt = (int) session.delete("member.deleteMember", memId);
		return cnt;
	}

	@Override
	public List<MemberVO> selectAllMember(SqlSession session) throws SQLException {
		List<MemberVO> memList = session.selectList("member.selectAllMember");
		return memList;
	}
	
}

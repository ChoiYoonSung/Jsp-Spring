package com.servlet.dao;

import java.sql.SQLException;

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
	public int loginCheckId(SqlMapClient smc, String memId) throws SQLException {
		int cnt = (int) smc.queryForObject("member.loginCheckId", memId);
		return cnt;
	}
	
//	@Override
//	public MemberVO login(SqlMapClient smc, MemberVO memberVO) throws SQLException {
//		MemberVO mv = (MemberVO) smc.queryForObject("member.login", memberVO);
//		return mv;
//	}

	@Override
	public MemberVO selectMemberById(SqlMapClient smc, String memId) throws SQLException {
		MemberVO member = (MemberVO) smc.queryForObject("member.selectMemberByID", memId);
		return member;
	}

	
}

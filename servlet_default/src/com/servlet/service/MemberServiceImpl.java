package com.servlet.service;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.servlet.dao.IMemberDao;
import com.servlet.dao.MemberDaoImpl;
import com.servlet.exception.InvalidPasswordException;
import com.servlet.exception.NotFoundIDException;
import com.servlet.util.SqlMapClientUtil;
import com.servlet.vo.MemberVO;

public class MemberServiceImpl implements IMemberService{
	private IMemberDao memberDao;
	private SqlMapClient smc;
	private static IMemberService memService;
	
	private MemberServiceImpl() {
		memberDao = MemberDaoImpl.getInstance();
		smc = SqlMapClientUtil.getInstance();
	}
	
	public static IMemberService getInstance() {
		if(memService == null) {
			memService = new MemberServiceImpl();
		}
		return memService;
	}
	
	@Override
	public int loginCheckId(String memId) {
		int cnt = 0;
		try {
			cnt = memberDao.loginCheckId(smc, memId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
//	@Override
//	public MemberVO login(MemberVO member) {
//		try {
//			member = memberDao.login(smc, member);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return member;
//	}

	@Override
	public MemberVO login(String memId, String memPw)
			throws NotFoundIDException, InvalidPasswordException, SQLException {
		MemberVO member = null;
		
		try {
			member = memberDao.selectMemberById(smc, memId);
		}catch(SQLException e) {
			e.printStackTrace();
			throw e;
		}
		if(member != null) {
			if(memPw.equals(member.getMemPw())) {
				return member;
			}else {
				throw new InvalidPasswordException();
			}
		}else {
			throw new NotFoundIDException();
		}
	}

}

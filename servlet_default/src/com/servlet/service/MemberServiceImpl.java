package com.servlet.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.servlet.dao.IMemberDao;
import com.servlet.dao.MemberDaoImpl;
import com.servlet.exception.InvalidPasswordException;
import com.servlet.exception.NotFoundIDException;
import com.servlet.mybatis.OracleMyBatisSessionFactory;
import com.servlet.util.SqlMapClientUtil;
import com.servlet.vo.MemberVO;

public class MemberServiceImpl implements IMemberService{
	private IMemberDao memberDao = new MemberDaoImpl();
	private SqlSessionFactory sqlSessionFactory = new OracleMyBatisSessionFactory();

	public void setMemberDAO(IMemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public int loginCheckId(String memId) throws SQLException{
		SqlSession session = sqlSessionFactory.openSession();
		int cnt = memberDao.loginCheckId(session, memId);
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
		SqlSession session = sqlSessionFactory.openSession();
		MemberVO member = memberDao.selectMemberById(session, memId);
		session.close();
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

	@Override
	public int insertMember(MemberVO member) throws SQLException{
		SqlSession session = sqlSessionFactory.openSession();
		int cnt  = memberDao.insertMember(session, member);
		session.close();
		return cnt;
	}
	
	@Override
	public int updateMember(MemberVO member) throws SQLException{
		SqlSession session = sqlSessionFactory.openSession();
		int cnt = memberDao.updateMember(session, member);
		session.close();
		return cnt;
	}
	
	@Override
	public int deleteMember(String memId) throws SQLException{
		SqlSession session = sqlSessionFactory.openSession();
		int cnt = memberDao.deleteMember(session, memId);
		session.close();
		return cnt;
	}
	
	@Override
	public List<MemberVO> selectAllMember() throws SQLException{
		SqlSession session = sqlSessionFactory.openSession();
		List<MemberVO> memList = (List<MemberVO>)memberDao.selectAllMember(session);
		session.close();
		return memList;
	}
	
	@Override
	public MemberVO selectMember(String memId) throws SQLException{
		SqlSession session = sqlSessionFactory.openSession();
		MemberVO member = (MemberVO)memberDao.selectMemberById(session, memId);
		session.close();
		return member;
	}

}

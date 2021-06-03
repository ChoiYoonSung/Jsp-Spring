package kr.or.ddit.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.command.Criteria;
import kr.or.ddit.command.PageMaker;
import kr.or.ddit.command.SearchCriteria;
import kr.or.ddit.dao.MemberDAO;
import kr.or.ddit.dto.MemberVO;
import kr.or.ddit.exception.InvalidPasswordException;
import kr.or.ddit.exception.NotFoundException;

public class MemberServiceImpl implements MemberService {
	private SqlSessionFactory sqlSessionFactory;
	private MemberDAO memberDAO;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public void login(String id, String pwd) throws SQLException, NotFoundException, InvalidPasswordException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			MemberVO member = memberDAO.selectMemberById(session, id);
			if (member == null)
				throw new NotFoundException();
			if (!pwd.equals(member.getPwd()))
				throw new InvalidPasswordException();
		} finally {
			session.close();
		}
	}

	@Override
	public MemberVO getMember(String id) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			MemberVO member = memberDAO.selectMemberById(session, id);
			return member;
		} finally {
			session.close();
		}
	}

	@Override
	public List<MemberVO> getMemberList() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			List<MemberVO> memList = memberDAO.selectMemberList(session);
			return memList;
		} finally {
			session.close();
		}
	}

	@Override
	public List<MemberVO> getMemberList(Criteria cri) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			List<MemberVO> memList = memberDAO.selectMemberList(session,cri);
			return memList;
		} finally {
			session.close();
		}
	}

	@Override
	public Map<String, Object> getMemberList(SearchCriteria cri) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		try {
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(cri);
			pageMaker.setTotalCount(memberDAO.selectMemberListCount(session, cri));
			
			List<MemberVO> memList = memberDAO.selectMemberList(session,cri);
			
			dataMap.put("memList",memList);
			dataMap.put("pageMaker", pageMaker);
			return dataMap;
		} finally {
			session.close();
		}
	}

}
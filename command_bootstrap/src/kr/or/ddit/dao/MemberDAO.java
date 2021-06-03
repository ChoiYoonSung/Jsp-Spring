package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.command.Criteria;
import kr.or.ddit.command.SearchCriteria;
import kr.or.ddit.dto.MemberVO;

public interface MemberDAO {
	MemberVO selectMemberById(SqlSession session, String id) throws SQLException;
	
	List<MemberVO> selectMemberList(SqlSession session) throws SQLException;						// 전체 조회
	List<MemberVO> selectMemberList(SqlSession session, Criteria cri) throws SQLException;			// 페이징
	List<MemberVO> selectMemberList(SqlSession session, SearchCriteria cri) throws SQLException;	// 검색
	
	int selectMemberListCount(SqlSession session, SearchCriteria cri) throws SQLException;
	
	public void insertMember(SqlSession session, MemberVO member) throws SQLException;		// 회원등록
}

package kr.or.ddit.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.dto.MemberVO;

public interface MemberDAO {
	MemberVO selectMemberById(SqlSession session, String id) throws SQLException;
}

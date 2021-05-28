package kr.or.ddit.service;

import java.sql.SQLException;

import kr.or.ddit.dto.MemberVO;
import kr.or.ddit.exception.InvalidPasswordException;
import kr.or.ddit.exception.NotFoundException;

public interface MemberService {
	void login(String id, String pwd) throws SQLException, NotFoundException, InvalidPasswordException;

	MemberVO getMember(String id) throws SQLException;

}

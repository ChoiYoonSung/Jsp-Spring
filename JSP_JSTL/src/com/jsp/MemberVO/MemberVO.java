package com.jsp.MemberVO;

public class MemberVO {
	private String id;
	private String pwd;
	private String ph;
	private String mail;
	
	public MemberVO(String id, String pwd, String ph, String mail) {
		this.id = id;
		this.pwd = pwd;
		this.ph = ph;
		this.mail = mail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}

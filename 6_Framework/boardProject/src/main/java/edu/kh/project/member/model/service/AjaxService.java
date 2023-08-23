package edu.kh.project.member.model.service;

import java.util.List;

import edu.kh.project.member.model.dto.Member;

public interface AjaxService {

	/** 이메일로 닉네임 조회
	 * @param email
	 * @return
	 */
	String selectNickname(String email);

	/** 닉네임이 일치하는 회원의 전화번호 조회
	 * @param inputNickname
	 * @return tel
	 */
	String selectMemberTel(String nickname);

	/** 이메일 중복 검사
	 * @param email
	 * @return count
	 */
	int dupCheck(String email);

	/** 닉네임 중복 검사
	 * @param name
	 * @return count
	 */
	int dupCheckNickname(String nickname);

	/** 이메일로 회원 정보 조회
	 * @param email
	 * @return member
	 */
	Member selectMember(String email);

	/** 이메일이 일부라도 일치하는 모든 회원 조회
	 * @param input
	 * @return member
	 */
	List<Member> selectMemberList(String input);

}

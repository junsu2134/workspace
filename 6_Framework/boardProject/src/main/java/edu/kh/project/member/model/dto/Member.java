package edu.kh.project.member.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Member {
   private int memberNo;
   private String memberEmail;
   private String memberPw;
   private String memberNickname;
   private String memberTel;
   private String memberAddress;
   private String profileImage;
   private String enrollDate;
   private String memberDeleteFlag;
   private int authority;
}


// VO : 벨류 오브젝트 -> 값 자체
// DTO : 데이터 트랜스퍼 오브젝트 -> 데이터를 담아서 주고받기 위한 객체
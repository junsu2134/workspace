package com.ncs.test.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ncs.test.member.model.vo.Member;

@Repository
public class MemberDAO {

    @Autowired
    private SqlSession sqlSession;

    public Member loginMember(Member member) {
        return sqlSession.selectOne("memberMapper.loginMember", member);
    }
}

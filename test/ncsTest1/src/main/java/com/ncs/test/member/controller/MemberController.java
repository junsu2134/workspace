package com.ncs.test.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncs.test.member.model.service.MemberService;
import com.ncs.test.member.model.vo.Member;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/login")
    public String memberLogin(Member member, Model model) {
        Member loginMember = memberService.loginMember(member);
        
        if (loginMember != null) {
            model.addAttribute("loginMember", loginMember);
        } else {
            model.addAttribute("message", "로그인 실패");
        }
        return "redirect:/";
    }
}

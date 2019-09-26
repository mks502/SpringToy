package com.mks.toy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mks.toy.dto.MemberDto;
import com.mks.toy.entity.Member;
import com.mks.toy.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/api/member/signin")
	public ResponseEntity<Member> signIn(@RequestBody MemberDto memberDto){
		Member member = memberService.signIn(memberDto);
		if(member == null)
			return ResponseEntity.badRequest().body(null);
		return ResponseEntity.ok().body(member);
	}
}
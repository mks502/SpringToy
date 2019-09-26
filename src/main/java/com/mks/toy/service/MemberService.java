package com.mks.toy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mks.toy.dto.MemberDto;
import com.mks.toy.entity.Member;
import com.mks.toy.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	MemberRepository memberRepository;
	
	public Member signIn(MemberDto memberDto) {
		Member member = Member.builder()
				.username(memberDto.getUsername()).password(memberDto.getPassword()).name(memberDto.getName())
				.build();
		return memberRepository.save(member);
	}
}
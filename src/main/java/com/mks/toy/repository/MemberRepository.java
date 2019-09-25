package com.mks.toy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mks.toy.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
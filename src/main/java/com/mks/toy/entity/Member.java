package com.mks.toy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mid;
	private String username;
	private String password;
	private String name;
}

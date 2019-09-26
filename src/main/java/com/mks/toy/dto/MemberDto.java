package com.mks.toy.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberDto {
	private Long mid;
	private String username;
	private String password;
	private String name;
}

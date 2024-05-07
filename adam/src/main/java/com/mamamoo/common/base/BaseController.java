package com.mamamoo.common.base;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BaseController {
	// 암호화 처리
	public String encodeBcrypt(String planeText, int strength) {
		return new BCryptPasswordEncoder(strength).encode(planeText);
	}

	// 기존자료 암호화된 자료 비교
	public boolean matchesBcrypt(String planeText, String hashValue, int strength) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(strength);
		return passwordEncoder.matches(planeText, hashValue);
	}
}

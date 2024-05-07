package com.mamamoo.infra.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamamoo.common.constants.Constants;

@Controller
public class LoginController {
	@Autowired
	LoginService service;
	
	// 관리자 로그인
	@RequestMapping(value = "/loginCostco")
	public String loginCostco() throws Exception {
		return Constants.PATH_LOGIN + "loginCostco";
	}	
}

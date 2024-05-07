package com.mamamoo.infra.members;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mamamoo.common.base.BaseController;
import com.mamamoo.common.constants.Constants;

import jakarta.servlet.http.HttpSession;

@Controller
public class MembersController extends BaseController {
	@Autowired
	MembersService service;
	
	// 로그인 아이디, 비밀번호 확인용
	@ResponseBody
	@RequestMapping(value = "/memberSdmLoginConfirm")
	public Map<String, Object> memberSdmLoginConfirm(MembersDto dto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		String loginPassword = dto.getMbrPassWord();
		
		dto = service.selectOneLogin(dto);
		if(dto != null) {
			// 비밀번호 비교
			if(matchesBcrypt(loginPassword, dto.getMbrPassWord(), 10)) {
				returnMap.put("rt", "success");
				System.out.println("matchesBcrypt");
				httpSession.setMaxInactiveInterval(60 * Constants.SESSION_MINUTE_SDM); // 60second * 30 = 30minute
				httpSession.setAttribute("sessMbrSeq",   dto.getMbrSeq());
				httpSession.setAttribute("sessMbrEmail", dto.getMbrEmail());
				httpSession.setAttribute("sessMbrName",  dto.getMbrName());
			} else {
				returnMap.put("rt", "password");
			}
		} else {
			returnMap.put("rt", "id");
		}

		return returnMap;
	}
	
	// 로그인아웃 세션종료
	@ResponseBody
	@RequestMapping(value = "/memberSdmLogOut")
	public Map<String, Object> memberSdmLogOut(HttpSession httpSession) throws Exception {
		
		Map<String, Object> returnMap = new HashMap<String, Object>();

		// 세션종료
		httpSession.invalidate();
		
		returnMap.put("rt", "success");
		return returnMap;
	}
}

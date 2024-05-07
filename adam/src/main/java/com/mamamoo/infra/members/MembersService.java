package com.mamamoo.infra.members;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class MembersService {
	@Autowired
	MembersDao dao;
	
	// 자료조회
	public List<MembersDto> selectList(MembersVo vo) {
		return dao.selectList(vo);
	};
	
	// 자료건수
	public int selectOneCount(MembersVo vo) {
		return dao.selectOneCount(vo);
	};
	
	// 1건조회
	public MembersDto selectOne(MembersVo vo) {
		return dao.selectOne(vo);
	}
	
	// 로그인 아이디, 비밀번호 확인용
	public MembersDto selectOneLogin(MembersDto dto) {
		return dao.selectOneLogin(dto);
	}
	
	// 입력
	public int insert(MembersDto dto) {
		return dao.insert(dto);
	};
	
	// 수정
	public int update(MembersDto dto) {
		return dao.update(dto);
	};
	
	// 삭제
	public int delete(MembersDto dto) {
		return dao.delete(dto);
	};
	
	// 회원정보 메모리 상주
	@PostConstruct
	public void selectListCachedMembersArrayList() throws Exception {
		MembersDto.cachedMembersArrayList.clear();
		MembersDto.cachedMembersArrayList.addAll(dao.selectListCachedMembersArrayList());
	}
	
	// 회원코드에 해당하는 회원명
	public String selectOneMembersName(String mbrSeq) throws Exception {
		String rt = "";
		
		for(MembersDto dtoRow : MembersDto.cachedMembersArrayList) {
			if(dtoRow.getMbrSeq().equals(mbrSeq)) {
				rt = dtoRow.getMbrName();
				break;
			}
		}
		
		return rt;
	}
	
	// 회원코드에 해당하는 거래처명
	public String selectOneMembersClientName(String mbrSeq) throws Exception {
		String rt = "";
		
		for(MembersDto dtoRow : MembersDto.cachedMembersArrayList) {
			if(dtoRow.getMbrSeq().equals(mbrSeq)) {
				rt = dtoRow.getMbrClientName();
				break;
			}
		}
		
		return rt;
	}	
}

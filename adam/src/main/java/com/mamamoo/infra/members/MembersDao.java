package com.mamamoo.infra.members;

import java.util.List;

public interface MembersDao {
	// 자료조회
	public List<MembersDto> selectList(MembersVo vo);
	// 자료건수
	public int selectOneCount(MembersVo vo);
	// 1건조회
	public MembersDto selectOne(MembersVo vo);
	// 입력
	public int insert(MembersDto dto);
	// 수정
	public int update(MembersDto dto);
	// 삭제
	public int delete(MembersDto dto);
	// 회원정보 메모리 상주
	public List<MembersDto> selectListCachedMembersArrayList();

	public MembersDto selectOneLogin(MembersDto dto); 
}

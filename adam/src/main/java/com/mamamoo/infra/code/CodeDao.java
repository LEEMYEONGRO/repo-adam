package com.mamamoo.infra.code;

import java.util.List;

public interface CodeDao {
	public List<CodeDto> selectList(CodeVo vo);
	public CodeDto selectOne(CodeDto dto);
	
//	mybatis에서 insert, update, delete 된 건수를 리턴한다
//	그래서 리턴 타입을 int로 해야한다	
	public int insert(CodeDto dto);
	public int update(CodeDto dto);
	public int delete(CodeDto dto);
	
	public int updateDelNy(CodeDto dto);
	
	public List<CodeDto> selectListCachedCodeArrayList();
	
	public int getCount(CodeVo vo); 
	
	// 다중선택자료 삭제
	public int deleteList(CodeVo vo);

}

package com.mamamoo.infra.codegroup;

import java.util.List;

public interface CodeGroupDao {
	public List<CodeGroupDto> selectList(CodeGroupVo vo);	
//	public List<CodeGroupDto> selectList();
	
	public CodeGroupDto selectOne(CodeGroupDto dto);
	public List<CodeGroupDto> selectName(CodeGroupDto dto);
	public List<CodeGroupDto> selectListCodeGroup();
	public List<CodeGroupDto> selectListCachedCodeGroupArrayList();
	
//	mybatis에서 insert, update, delete 된 건수를 리턴한다
//	그래서 리턴 타입을 int로 해야한다
	public int insert(CodeGroupDto dto);
	public int update(CodeGroupDto dto);
	public int delete(CodeGroupDto dto);
	
	public int updateDelNy(CodeGroupDto dto);
	
	public int getCount(CodeGroupVo vo); 
	
	// 다중선택 삭제
	public int deleteList(CodeGroupVo vo);
}

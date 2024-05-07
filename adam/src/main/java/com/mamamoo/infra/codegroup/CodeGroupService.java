package com.mamamoo.infra.codegroup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
//	CodeGroupDao codeGroupDao;
	
	@Autowired
	CodeGroupDao dao;
//	CodeGroupDao dao = new CodeGroupDao();
	
	public List<CodeGroupDto> selectList(CodeGroupVo vo){
		
//		List<CodeGroupDto> list = dao.selectList();
//		return list;
		
		return dao.selectList(vo);
	}
	
	public CodeGroupDto selectOne(CodeGroupDto dto){
		
//		CodeGroupDto codeGroupDto = dao.selectOne(dto);
//		return codeGroupDto;
		
		return dao.selectOne(dto);
	}
	
	public int insert(CodeGroupDto dto){
		return dao.insert(dto);
	}	
	
	public int update(CodeGroupDto dto){
		return dao.update(dto);
	}	
	
	public int delete(CodeGroupDto dto){
		return dao.delete(dto);
	}
	
	public int updateDelNy(CodeGroupDto dto){
		return dao.updateDelNy(dto);
	}
	
	// 코드그룹명
	public List<CodeGroupDto> selectListCodeGroup() {
		return dao.selectListCodeGroup();
	};
	
	public int getCount(CodeGroupVo vo) {
		return dao.getCount(vo);
	}	
	
	// @PostConstruct : 서버가 구동되면 자동적으로 실행되는 어노테이션
    //@PostConstruct
	public void selectListCachedCodeGroupArrayList() throws Exception {
//		List<CodeDto> codeListFromDb = dao.selectListCachedCodeArrayList();
//		codeListFromDb = (ArrayList<Code>) dao.selectListCachedCodeArrayList();
    	CodeGroupDto.cachedCodeGroupArrayList.clear(); 
    	CodeGroupDto.cachedCodeGroupArrayList.addAll(dao.selectListCachedCodeGroupArrayList());
		System.out.println("cachedCodeGroupArrayList: " + CodeGroupDto.cachedCodeGroupArrayList.size() + " chached !");
	}
    
	public static String selectOneCachedCodeGroup(int code) throws Exception {
		String rt = "";
		for(CodeGroupDto codeRow : CodeGroupDto.cachedCodeGroupArrayList) {
			if (codeRow.getCdgSeq().equals(Integer.toString(code))) {
				rt = codeRow.getCdgName();
			} else {
				// by pass
			}
		}
		return rt;
	}
	
	public static List<CodeGroupDto> selectListCachedCodeGroup() throws Exception {
		List<CodeGroupDto> rt = new ArrayList<CodeGroupDto>();
		for(CodeGroupDto codeRow : CodeGroupDto.cachedCodeGroupArrayList) {
			rt.add(codeRow);
		}
		return rt;
	}    
	
	// 다중선택 삭제
	public int deleteList(CodeGroupVo vo) {
		return dao.deleteList(vo);
	}
}
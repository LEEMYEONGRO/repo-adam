package com.mamamoo.infra.code;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class CodeService {

	@Autowired
	CodeDao dao;
	
	public List<CodeDto> selectList(CodeVo vo) {
		return dao.selectList(vo);
	}
	
	public CodeDto selectOne(CodeDto dto) {
		return dao.selectOne(dto);
	}
	
	public int insert(CodeDto dto){
		return dao.insert(dto);
	}	
	
	public int update(CodeDto dto){
		return dao.update(dto);
	}	
	
	public int delete(CodeDto dto){
		return dao.delete(dto);
	}
	
	public int updateDelNy(CodeDto dto){
		return dao.updateDelNy(dto);
	}
	
	public int getCount(CodeVo vo) {
		return dao.getCount(vo);
	}	
	
	// @PostConstruct : 서버가 구동되면 자동적으로 실행되는 어노테이션
    @PostConstruct
	public void selectListCachedCodeArrayList() throws Exception {
		CodeDto.cachedCodeArrayList.clear(); 
		CodeDto.cachedCodeArrayList.addAll(dao.selectListCachedCodeArrayList());
		System.out.println("cachedCodeArrayList: " + CodeDto.cachedCodeArrayList.size() + " chached !");
	}
    
	public static String selectOneCachedCode(int code) throws Exception {
		String rt = "";
		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
			if (codeRow.getCdcSeq().equals(Integer.toString(code))) {
				rt = codeRow.getCdcName();
			} else {
				// by pass
			}
		}
		return rt;
	}    
	
	public static List<CodeDto> selectListCachedCode(String cdgSeq) throws Exception {
		List<CodeDto> rt = new ArrayList<CodeDto>();
		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
			if (codeRow.getCdgSeq().equals(cdgSeq)) {
				rt.add(codeRow);
			} else {
				// by pass
			}
		}
		return rt;
	}	
	
	// 다중선택자료 삭제
	public int deleteList(CodeVo vo) {
		return dao.deleteList(vo);
	};
}

package com.mamamoo.common.base;

public class BaseVo {
	// 조회
	private Integer shDelNy = 0; 	// 삭제여부	/* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private Integer shOptionDate=0;	// 날짜조건 	/* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private String  shDateStart;	// 시작일자
	private String  shDateEnd;		// 종료일자
	private Integer shOption;		// 검색어조건	/* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private String  shValue;		// 검색어
	
	private String[] shCheckedArray = null; // 체크항목 삭제자료 담을 변수

	// paging
	private int     pgPage      = 1;  // 시작페이지
	
	private int     pgRowCount  = 5;  // 한 페이지 당 보여줄 게시물 개수
	private int     pgPageCount = 5;  // 한 블럭에 몇 개의 페이지 개수

	private int     pgTotalCount;     // 총 게시물 개수
	
	private int     pgStartPage = 1;  // 한 블럭의 시작 페이지: 기본 값 1 // ex) 1 2 3 4 5 일 때 1을 의미.
	private int     pgEndPage;        // 한 블럭의 끝 페이지

	private int     pgTotalPageCount;    // 총 페이지 개수

	private boolean pgIsPrev = false; // 다음 페이지로 이동하는 버튼 유무
	private boolean pgIsNext = false; // 이전 페이지로 이동하는 버튼 유무
	
	private int		pgOffset;         // 얼만큼 끊어서 가져올 것인가.
	
	private String 	uri;


	// 조회
	//=========================================================================	
	public Integer getShDelNy() {
		return shDelNy;
	}

	public void setShDelNy(Integer shDelNy) {
		this.shDelNy = shDelNy;
	}

	public Integer getShOptionDate() {
		return shOptionDate;
	}

	public void setShOptionDate(Integer shOptionDate) {
		this.shOptionDate = shOptionDate;
	}

	public String getShDateStart() {
		return shDateStart;
	}

	public void setShDateStart(String shDateStart) {
		this.shDateStart = shDateStart;
	}

	public String getShDateEnd() {
		return shDateEnd;
	}

	public void setShDateEnd(String shDateEnd) {
		this.shDateEnd = shDateEnd;
	}

	public Integer getShOption() {
		return shOption;
	}

	public void setShOption(Integer shOption) {
		this.shOption = shOption;
	}

	public String getShValue() {
		return shValue;
	}

	public void setShValue(String shValue) {
		this.shValue = shValue;
	}
	
	public String[] getShCheckedArray() {
		return shCheckedArray;
	}

	public void setShCheckedArray(String[] shCheckedArray) {
		this.shCheckedArray = shCheckedArray;
	}

	// paging
	//=========================================================================
	public void setPagingVo(int totalCount) {
		setPgTotalCount(totalCount);
		
		// 총 페이지 개수 구하기
		setPgTotalPageCount(totalCount); 
		
		// 한 블럭의 첫 페이지 구하기
		setPgStartPage();
	
		// 한 블럭의 끝 페이지 구하기
		setPgEndPage(); 
	
		// 이전 블록 버튼 유무 판별하기
		pgIsPrev(); 
	
		// 다음 블록 버튼 유무 판별하기
		pgIsNext(); 
	
		// offset 구하기
		setPgOffset(); 
    }

    // 총 페이지 개수 구하기
    private void setPgTotalPageCount(int pgTotalCount) {
    	this.pgTotalCount     = pgTotalCount;
        this.pgTotalPageCount = (int) Math.ceil(pgTotalCount * 1.0 / pgRowCount);
    }

    // 한 블럭의 첫 페이지 구하기
    private void setPgStartPage() {
        pgStartPage = pgStartPage + (((pgPage - pgStartPage) / pgPageCount) * pgPageCount);
    }

    // 한 블럭의 끝 페이지 구하기
    private void setPgEndPage() {
        pgEndPage = ((pgStartPage - 1) + pgPageCount) < pgTotalPageCount ? (pgStartPage - 1) + pgPageCount : pgTotalPageCount;
    }

    // 이전 블럭으로 이동할 버튼 생성 유무
    private void pgIsPrev() {
        pgIsPrev = 1 < ((pgPage * 1.0) / pgPageCount);
    }

    // 다음 블럭으로 이동할 버튼 생성 유무
    private void pgIsNext() {
        pgIsNext = pgEndPage < pgTotalPageCount;
    }

    // offset 구하기 // 쿼리 select 시 끊어서 가져오기
    private void setPgOffset() {
    	pgOffset = (pgPage - 1) * pgRowCount;
    }

	public int getPgRowCount() {
		return pgRowCount;
	}

	public void setPgRowCount(int pgRowCount) {
		this.pgRowCount = pgRowCount;
	}
	
	public void setPgPageCount(int pgPageCount) {
		this.pgPageCount = pgPageCount;
	}

	public int getPgPageCount() {
		return pgPageCount;
	}

	public int getPgTotalCount() {
		return pgTotalCount;
	}
	
	public void setPgTotalCount(int pgTotalCount) {
		this.pgTotalCount = pgTotalCount;
	}	

	public int getPgStartPage() {
		return pgStartPage;
	}

	public int getPgEndPage() {
		return pgEndPage;
	}

	public int getPgTotalPageCount() {
		return pgTotalPageCount;
	}

	public boolean isPgIsPrev() {
		return pgIsPrev;
	}

	public boolean isPgIsNext() {
		return pgIsNext;
	}

	public int getPgOffset() {
		return pgOffset;
	} 
	
    public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}	
	
	public int getPgPage() {
		return pgPage;
	}
	
	public void setPgPage(int pgPage) {
		this.pgPage = pgPage;
	}	
	
}

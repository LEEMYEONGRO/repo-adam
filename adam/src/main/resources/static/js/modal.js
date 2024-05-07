// 모달폼 내용 수정
fnModalCaptionChange = function(paramIndex, paramTitle, paramContent) {
	if(paramIndex == 0) {
		// 삭제외 경우
		$("#btnCancel").html("확인");
		$("#title").html(paramTitle);
		$("#contents").html(paramContent);		
		$("#lineDelete").css("display", "none");
	} else {
		// 삭제하는 경우
		$("#btnCancel").html("취소");
		$("#title").html("삭제");
		$("#contents").html("삭제를 진행 하시겠습니까?");
		$("#lineDelete").css("display", "");
	}
}
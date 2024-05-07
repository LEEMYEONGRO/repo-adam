// 페이징
fnGoList = function(pgPage) {
    document.querySelector("input[name=pgPage]").value = pgPage;
    //form.action = goUrlSdmList;
    //form.submit();
    
    let queryString = $("#form").serialize();
    
    $.ajax({
		async: true
		, cache: false
		, type: "post"
		, url: goUrlSdmPaging+"?"+queryString
		, success: function(fragment) {
			$("#listData").replaceWith(fragment);
		}
		, error: function(jqXHR, textStatus, errorThrown) {
			//fnModalCaptionChange(0,"오류", "ajaxUpdate " + jqXHR.textStatus + " : " + jqXHR.errorThrown);
			alert("ajaxUpdate " + jqXHR.textStatus + " : " + jqXHR.errorThrown);
		}
	});
}
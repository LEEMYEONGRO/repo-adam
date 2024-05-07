 fnLogout = function() {
	  $.ajax({
		  async: true
		  , cache: false
		  , type: "post"
		  , url: "/memberSdmLogOut"
		  , success: function(response){
			  if(response.rt == "success") {
				  location.href = "/loginCostco";
			  } else {
				  alert("로그아웃 실패");
			  }
		  }
		  , error : function(jqXHR, textStatus, errorThrown){
		 	  alert("ajaxUpdate " + jqXHR.textStatus + " : " + jqXHR.errorThrown);
		  }
	  });			 
 } 
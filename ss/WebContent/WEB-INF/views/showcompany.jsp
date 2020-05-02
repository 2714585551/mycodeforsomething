<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:include page="linkjscss.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="../css/style.css" rel='stylesheet' type='text/css'/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>展示个人信息</title>
<meta name="keywords" content="Accessible Profile Widget Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
</head>
<body>
<h1>公司简介</h1>
		<div class="main-agileits">
		  <ul class="detail-text" id="ul" name = "ul">
				
		  </ul> 
		<input type="hidden" id="detail" name="datail" value="${company.id}">
		</div>
	
</body>
<script type="text/javascript">
window.onload = function(){
	debugger;
	 $.ajax({
	    	url:"../showCompany",
	    	type:"post",
	        dataType: "json",
	        success:function(data){
	 	        	$("ul").append("<li>"+data.companydetail+"</li>");
 		       
	        },
	        error:function(){
	        	//alert("页面跳转失败");
	        }
	    });
};
</script>
</html>
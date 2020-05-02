<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
<script src="../js/jquery-1.10.2.js"></script>
<title>公司注册</title>
<style type="text/css">
html,body {
	height: 100%;
}
.box {
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#6699FF', endColorstr='#6699FF'); /*  IE */
    background-image:linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
	background-image:-o-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
	background-image:-moz-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
	
	margin: 0px auto;
	position: relative;
	width: 100%;
	height: 100%;
}
.login-box {
	width: 100%;
	max-width:500px;
	height: 400px;
	position: absolute;
	top: 35%;

	margin-top: -200px;
	/*设置负值，为要定位子盒子的一半高度*/
	
}
@media screen and (min-width:500px){
	.login-box {
		left: 50%;
		/*设置负值，为要定位子盒子的一半宽度*/
		margin-left: -250px;
	}
}	

.form {
	width: 100%;
	max-width:500px;
	height: 275px;
	margin: 25px auto 0px auto;
	padding-top: 25px;
}	
.login-content {
	height: 300px;
	width: 100%;
	max-width:500px;
	background-color: rgba(255, 250, 2550, .6);
	float: left;
}		
	
	
.input-group {
	margin: 0px 0px 30px 0px !important;
}
.form-control,
.input-group {
	height: 40px;
}

.form-group {
	margin-bottom: 0px !important;
}
.login-title {
	padding: 20px 10px;
	background-color: rgba(0, 0, 0, .6);
}
.login-title h1 {
	margin-top: 10px !important;
}
.login-title small {
	color: #fff;
}

.link p {
	line-height: 20px;
	margin-top: 30px;
}
.btn-sm {
	padding: 8px 24px !important;
	font-size: 16px !important;
}
</style>

</head>

<body>
<script type="text/javascript">
function register(){
   var obj = new Object();
   obj.companyName = document.getElementById("companyName").value;
   obj.companyAddress = document.getElementById("companyAddress").value;
   obj.companyTelephone = document.getElementById("companyTelephone").value;
   obj.companyZip = document.getElementById("companyZip").value;
   obj.companyEmile = document.getElementById("companyEmile").value;
   obj.companyDetail = document.getElementById("companyDetail").value;
   if(obj.companyName == null || obj.companyName == ""){
   	alert("公司名称不能为空");
   	return ;
   }
   if(obj.companyAddress == null || obj.companyAddress == ""){
   	alert("公司地址不能为空");
   	return ;
   }
   if(obj.companyTelephone == null || obj.companyTelephone == ""){
	   	alert("公司电话不能为空");
	   	return ;
	   }
   if(obj.companyZip == null || obj.companyZip == ""){
	   	alert("公司邮编不能为空");
	   	return ;
	   }
   if(obj.companyEmile == null || obj.companyEmile == ""){
	   	alert("公司邮箱不能为空");
	   	return ;
	   }


   
	   if(!/^[0-9]*$/.test(obj.companyTelephone)){
		   	alert("公司电话应为数字");
		   	return ;
		   }
	   if(!/\d{6}/.test(obj.companyZip)){
		   	alert("邮编格式错误");
		   	return ;
		   }
	   if(!/\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/.test(obj.companyEmile)){
		   	alert("公司邮箱输入错误");
		   	return ;
		   }
	   var mydata = JSON.stringify(obj);
	   $.ajax({
	    	url:"../ergister/regcompany",
	    	type:"post",
	        data: {mydata:mydata},
	        dataType: "json",
	        success:function(data){
        		  alert(data.msg);
        		  window.location.href = "../ergister/registerAdmin";
	        },
	        error:function(){
	        	alert("公司注册失败");
	        }
	    });
}

</script>
<div class="box">
		<div class="login-box">
			<div class="login-title text-center">
				<h1><small>公司注册</small></h1>
			</div>
			<div class="login-content ">
			<div class="form">
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">公司名称</span></span>
							<input type="text" id="companyName" name="companyName" class="form-control" placeholder="公司名称">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">公司地址</span></span>
							<input type="text" id="companyAddress" name="companyAddress" class="form-control" placeholder="公司地址">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">公司电话</span></span>
							<input type="text" id="companyTelephone" name="companyTelephone" class="form-control" placeholder="公司电话" >
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">公司邮编</span></span>
							<input type="text" id="companyZip" name="companyZip" class="form-control" placeholder="公司邮编" >
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">公司邮箱</span></span>
							<input type="text" id="companyEmile" name="companyEmile" class="form-control" placeholder="公司邮箱" >
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">公司简介</span></span>
							<input type="text" id=companyDetail name="companyDetail" class="form-control"  >
						</div>
					</div>
				</div>
				<div class="form-group form-actions">
					<div class="col-xs-4 col-xs-offset-4 ">
						<button onclick="register()" class="btn btn-sm btn-info"><span class="glyphicon"></span>提交</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
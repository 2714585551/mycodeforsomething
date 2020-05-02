<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
<script src="../js/jquery-1.10.2.js"></script>
<title>员工注册</title>
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
.file {
    position: relative;
    display: inline-block;
    background: #D0EEFF;
    border: 1px solid #99D3F5;
    border-radius: 4px;
    padding: 4px 12px;
    overflow: hidden;
    color: #1E88C7;
    text-decoration: none;
    text-indent: 0;
    line-height: 20px;
}
.file input {
    position: absolute;
    font-size: 100px;
    right: 0;
    top: 0;
    opacity: 0;
}
.file:hover {
    background: #AADFFD;
    border-color: #78C3F3;
    color: #004974;
    text-decoration: none;
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
<div class="box">
		<div class="login-box">
			<div class="login-title text-center">
				<h1><small>管理员注册</small></h1>
			</div>
			<div class="login-content ">
			<div class="form">
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">管理员姓名</span></span>
							<input type="text" id="staffName" name="staffName" class="form-control" placeholder="管理员姓名">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">管理员性别</span></span>
							<input type="text" id="staffGender" name="staffGender" class="form-control" placeholder="管理员性别">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">管理员电话</span></span>
							<input type="text" id="staffPhone" name="staffPhone" class="form-control" placeholder="管理员电话" >
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">管理员图片</span></span>
							<a class="file" style="top:10px;height:30px;width:100px;left:320px;"> 选择照片
							<input type="file" id="staffPicture" name="staffPicture"  />
						    </a>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">管理员身份证</span></span>
							<input type="text" id="staffCardID" name="staffCardID" class="form-control" placeholder="管理员身份证" >
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">出生日期</span></span>
							<input type="text" id="staffBirthday" name="staffBirthday" class="form-control" placeholder="管理员出生日期" >
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">管理员地址</span></span>
							<input type="text" id="staffAddress" name="staffAddress" class="form-control" placeholder="管理员地址" >
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">管理员邮箱</span></span>
							<input type="text" id="staffEmail" name="staffEmail" class="form-control" placeholder="管理员邮箱" >
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">备注</span></span>
							<input type="text" id=staffRemark name="staffRemark" class="form-control" placeholder="备注不得多于20字" >
						</div>
					</div>
				</div>
			    <div class="form-group form-actions">
					<div class="col-xs-4 col-xs-offset-4 ">
						<button onclick="register()" class="btn btn-sm btn-info"><span class="glyphicon"></span>提交</button>
					</div>
				</div>
				
				<input type="hidden" id="staffCompanyId" name="staffCompanyId" value="${company.id}">
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
function register(){
   var obj = new Object();
   obj.staffName = document.getElementById("staffName").value;
   obj.staffGender = document.getElementById("staffGender").value;
   obj.staffPhone = document.getElementById("staffPhone").value;
   obj.staffPicture = document.getElementById("staffPicture").value;
   obj.staffCardID = document.getElementById("staffCardID").value;
   obj.staffAddress = document.getElementById("staffAddress").value;
   obj.staffBirthday = document.getElementById("staffBirthday").value;
   obj.staffCompanyId = document.getElementById("staffCompanyId").value;
   obj.staffEmail = document.getElementById("staffEmail").value;
   debugger;
   obj.staffRemark = document.getElementById("staffRemark").value;
   obj.isAdmin = 1+"";
   if(obj.staffName == null || obj.staffName == ""){
   	alert("管理员姓名不能为空");
   	return ;
   }
   if(obj.staffGender == null || obj.staffGender == ""){
   	alert("性别不能为空");
   	return ;
   }
   if(obj.staffPhone == null || obj.staffPhone == ""){
	   	alert("电话不能为空");
	   	return ;
	   }
   if(obj.staffPicture == null || obj.staffPicture == ""){
	   	alert("照片不能为空");
	   	return ;
	   }
   if(obj.staffCardID == null || obj.staffCardID == ""){
	   	alert("身份证不能为空");
	   	return ;
	   }
   if(obj.staffAddress == null || obj.staffAddress == ""){
	   	alert("地址不能为空");
	   	return ;
	   }
  if(obj.staffBirthday == null || obj.staffBirthday == ""){
	   	alert("出生日期不能为空");
	   	return ;
	   }

      if(!/^[0-9]*$/.test(obj.staffPhone)){
		   	alert("公司电话应为数字");
		   	return ;
		   }
      if(!/\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/.test(obj.staffEmail)){
		   	alert("邮箱输入错误");
		   	return ;
		   }
	   if(!/\d{17}[\d|x]|\d{15}/.test(obj.staffCardID)){
		   	alert("身份证号输入错误");
		   	return ;
		   }
	   var mydata = JSON.stringify(obj);
	   $.ajax({
	    	url:"../ergister/regAdmin",
	    	type:"post",
	        data: {mydata:mydata},
	        dataType: "json",
	        async: false,
	        success:function(data){
       		  alert(data.msg);
       		  window.location.href = "../login/index";
	        },
	        error:function(){
	        	alert("111注册失败");
	        }
	    });
}

</script>
</body>
</html>
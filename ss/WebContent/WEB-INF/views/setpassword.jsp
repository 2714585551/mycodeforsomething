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
	 font-size:18px;
        background: url(../img/bg40.jpg)no-repeat 0px 0px;
         background-size: cover;
	     background-position:center;
	    background-attachment:fixed;
        padding:0;
        margin:0;
        border:0;
        height:100%;
        overflow:hidden;
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
	margin: -10px auto 0px auto;
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
.form-group {
	margin-bottom: 0px !important;
}
.login-title {
	padding: 35px 10px;
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

.col-xs-12 {
    height: 55px;
}
</style>

</head>

<body>
<div class="box">
		<div class="login-box">
			<div class="login-title text-center">
				<h1><small>修改密码</small></h1>
			</div>
			<div class="login-content ">
			<div class="form">
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">原密码</span></span>
							<input type="text" id="oldpassword" name="oldpassword" class="form-control" type="password">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">新密码</span></span>
							<input type="text" id="newpassword" name="newpassword" class="form-control" type="password">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon">重新输入新密码</span></span>
							<input type="text" id="newpassword1" name="newpassword1" class="form-control" type="password" >
						</div>
					</div>
				</div>
			    <div class="form-group form-actions">
					<div class="col-xs-4 col-xs-offset-4 ">
						<button onclick="register()" class="btn btn-sm btn-info"><span class="glyphicon"></span>确定修改</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
function register(){
	
	var oldpassword=document.getElementById("oldpassword").value;
	var passwordnew=document.getElementById("newpassword").value;
	var passwordnew1=document.getElementById("newpassword1").value;
   if(passwordnew !=passwordnew1){
   	alert("两次输入新密码不一致");
   	return ;
   }
	   $.ajax({
	    	url:"../testoldpsd",
	    	type:"post",
	        data: {mydata:oldpassword},
	        dataType: "json",
	        async: false,
	        success:function(data){
       		   if(data.success == true)
       			   {
       			$.ajax({
       		    	url:"../setnewpass",
       		    	type:"post",
       		        data: {mydata:passwordnew},
       		        dataType: "json",
       		        async: false,
       		        success:function(data){
       	       		   if(data.success == true)
       	       			   {
       	       			      alert("密码修改成功");
       	       			   }
       	       		   else{
       	       		  alert("密码修改失败");
       	       		   }
       		        },
       		        error:function(){
       		        	alert("网络连接失败");
       		        }
       		    });
       			      
       			   }else{
       				   alert("原密码输入错误");
       			   }
	        },
	        error:function(){
	        	alert("网络连接失败");
	        }
	    });
}

</script>
</body>
</html>
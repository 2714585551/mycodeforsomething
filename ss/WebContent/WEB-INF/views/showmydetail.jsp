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
<h1>我的个人信息</h1>
		<div class="main-agileits" >
		<div class="right-wthree">
				<img src="img/woman-1254453_640.jpg" alt="image" />
				<h2>姓名： ${staff.staffName}</h2>
				<p>备注：${staff.staffRemark}</p>
			</div>
			<div class="left-w3ls">
                 <ul class="address">
                 	<li>
							<ul class="address-text">
								<li><b>性别 </b></li>
								<li>${staff.staffGender}</li>
						</ul>
					</li>
                 	<li>
							<ul class="address-text">
								<li><b>身份证号 </b></li>
								<li>${staff.staffCardID}</li>
						</ul>
					</li>
					<li>
							<ul class="address-text">
								<li><b>电话 </b></li>
								<li>${staff.staffPhone}</li>
						</ul>
					</li>
					<li>
						<ul class="address-text">
							<li><b>地址 </b></li>
							<li>${staff.staffAddress}</li>
						</ul>
					</li>
					<li>
						<ul class="address-text">
							<li><b>邮箱 </b></li>
							<li><a href="mailto:example@mail.com">${staff.staffEmail}</a></li>
						</ul>
					</li>
					<li>
						<ul class="address-text">
							<li><b>生日 </b></li>
							<li><a href="#">${staff.staffBirthday}</a></li>
						</ul>
					</li>
				</ul>
				
				<div class="button">   
					<a href="../showmyinf" class="play-icon popup-with-zoom-anim">展示基本信息</a>
				</div>
						

			</div>
			
			<div class="clear"></div>
		</div>
</body>
</html>
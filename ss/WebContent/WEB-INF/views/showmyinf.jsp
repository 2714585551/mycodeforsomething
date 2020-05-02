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
				<img src="${staff.staffPicture}" alt="image" />
				<h2> ${staff.staffName}</h2>
				<p>${staff.staffRemark}</p>
			</div>
			<div class="left-w3ls">
<ul class="address">
										<li>
											<ul class="address-text">
												<li><b>PHONE </b></li>
												<li>${staff.staffPhone}</li>
						</ul>
					</li>
					<li>
						<ul class="address-text">
							<li><b>ADDRESS </b></li>
							<li>${staff.staffAddress}</li>
						</ul>
					</li>
					<li>
						<ul class="address-text">
							<li><b>E-MAIL </b></li>
							<li><a href="mailto:example@mail.com">${staff.staffEmail}</a></li>
						</ul>
					</li>
					<li>
						<ul class="address-text">
							<li><b>BIRTHDAY </b></li>
							<li><a href="#">${staff.staffBirthday}</a></li>
						</ul>
					</li>
				</ul>
				
				<div class="button">   
					<a href="../showmydetail" class="play-icon popup-with-zoom-anim">个人详细信息</a>
				</div>
						

			</div>
			
			<div class="clear"></div>
		</div>
</body>
</html>
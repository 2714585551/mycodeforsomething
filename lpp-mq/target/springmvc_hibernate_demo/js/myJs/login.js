$("#btn_login").click(function() {
	var loginObj = new Object();
	loginObj.accountNo = $("#inputAccount").val();
	loginObj.pwd = $("#inputPassword").val();
	
	if (null == loginObj.accountNo || loginObj.accountNo == '') {
		$("#error").text('用户名不能为空');
		return;
	}

	if (null == loginObj.pwd || loginObj.pwd == '') {
		$("#error").text('密码不能为空');
		return;
	}
	
	var loginJson = JSON.stringify(loginObj); // 将JSON对象转化为JSON字符
	$.post('/login', {
		"loginObj" : loginJson
	}, function(e) {
		console.log(e);
		//e = JSON.parse(e); // 由JSON字符串转换为JSON对象
		if (!e.success) {
			$("#error").text(e.msg);
		} else {
			// location.href="main/successLogin.do";
			$("#loginForm").submit();
		}
	});
});
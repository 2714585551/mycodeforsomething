<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
     <script src="../js/boot.js" type="text/javascript"></script> 
     <script src="../js/jquery-1.10.2.js"></script>
     <link href="../css/demo.css" rel="stylesheet" type="text/css" />
    <link href="../js/miniui/themes/default/large-mode.css" rel="stylesheet"
        type="text/css" />
    <link href="../js/miniui/themes/bootstrap/skin.css" rel="stylesheet" type="text/css" />
<title></title>
 <style type="text/css">
   html, body
    {
        background: url(../img/bg40.jpg)no-repeat 0px 0px;
         background-size: cover;
	     background-position:center;
	    background-attachment:fixed;
    }
textarea {
-moz-box-shadow:1px 1px 0 #E7E7E7;
-moz-box-sizing:border-box;
border-color:#3486e0 #948538 #1034e0 #772e2e;
border-style:solid;
border-width:3px;
font-family:arial,sans-serif;
font-size:15px;
margin:28px auto;
outline-color:-moz-use-text-color;
outline-style:none;
outline-width:medium;
padding:4px;
}
  </style>
</head>

<body>
 
      请输入要发布的公告：
    <br>
    <textarea id="noticetext" name="noticetext" style="width:999px;height:300px;"></textarea>
    <br><br>
    <a  class="mini-button mini-button-success"  style="height:30px;width:150px;left:300px;" onclick="noticeshow">提交</a>
    <a  class="mini-button mini-button-success" style="height:30px;width:150px;left:380px;"onclick="clear">重置</a>
</body>
<script type="text/javascript">

function noticeshow(){
	debugger;
	   var mydata = document.getElementById("noticetext").value;
	$.ajax({
    	url:"../noticeadd",
    	type:"post",
        data: {mydata:mydata},
        dataType: "json",
        async: false,
        success:function(data){
   		  alert(data.mag+"请重新登陆后，在信封里查看");
   		document.getElementById("noticetext").value = null;
   		//  window.location.href = "../login/index";
        },
        error:function(){
        	alert("发布失败");
        }
    });
}

function clear(){
	document.getElementById("noticetext").value = null;
}
</script>
</html>
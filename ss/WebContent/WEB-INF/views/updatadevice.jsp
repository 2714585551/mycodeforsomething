<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta charset="UTF-8" />
<title>Insert title here</title>
<style type="text/css">
       
     html, body
    {
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
    
    </style>
</head>
<body>

<form action="../updatadev" onsubmit="onok()">
        <p> 
        <label> 要修改的考勤机编号: </label>
        <input type="text" name="id" id="id" required="required"/>
         </p>
          <p> 
        <label> 修改考勤机名称为: </label>
        <input type="text" name="devicename" id="devicename" required="required" />
         </p> 
         <p> 
        <label>修改考勤机地址为:</label>
       <input type="text" name="deviceaddress" id="deviceaddress" required="required" />
         </p>
          <p> 
        <label> 修改考勤机状态为: </label>
        <input type="text" name="devicestatue" id="devicestatue" required="required" />
         </p>
         <p>
       <input type="submit"  value="提交" onclick="onok"/>
	   <input type="reset" value="重置"/>
	   </p>
</form>
<script>
debugger;
function onok(){
	debugger;
	mini.open({
        url: "../alertbox",
        title: "提示", width: 100, height: 100,
        onload: function () {
            var iframe = this.getIFrameEl();
            var data = { action: "new"};
        },
        ondestroy: function (action) {

        	// grid.reload();
        }
     
    });

}
</script>
</body>
</html>
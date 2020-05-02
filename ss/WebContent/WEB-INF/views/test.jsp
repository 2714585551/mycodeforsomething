<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title></title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
     <script src="../js/boot.js" type="text/javascript"></script> 
     <link href="../css/demo.css" rel="stylesheet" type="text/css" />
    <link href="../js/miniui/themes/default/large-mode.css" rel="stylesheet"
        type="text/css" />
    <link href="../js/miniui/themes/bootstrap/skin.css" rel="stylesheet" type="text/css" />
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
       <br><br>
        <h3>模拟考勤</h3>
         <a class="mini-button mini-button-info" style="height:200px;width:200px;" onclick ="test()">签到,王伏一号机签到</a>    
         <a class="mini-button mini-button-info" style="height:200px;width:200px" onclick ="test1()">签退，王伏一号机签退</a>                
</body>
<script type="text/javascript">
  function  test()
  {
	  debugger;
	  $.ajax({
	    	url:"../testcheck",
	    	type:"post",
	        data: {},
	        dataType: "json",
	        success:function(data){
	        	debugger;
               mini.alert(data.msg);
	        },
	        error:function(data){
	        	debugger;
	        	mini.alert(data.msg);
	        }
	    });
  }
  
  function  test1()
  {
	  debugger;
	  $.ajax({
	    	url:"../testcheck",
	    	type:"post",
	        data: {mydata:'1'},
	        dataType: "json",
	        success:function(data){
	        	debugger;
               mini.alert(data.msg);
	        },
	        error:function(data){
	        	debugger;
	        	mini.alert(data.msg);
	        }
	    });
  }


</script>
</html>

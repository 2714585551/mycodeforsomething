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
        <h3>-----❀设备管理❀</h3>
        <br>
       
         <a class="mini-button mini-button-info" style="height:35px;width:150px;" onclick ="showdevice()">查看考勤机</a>
         <a class="mini-button mini-button-success" style="height:35px;width:150px; onclick ="adddevice()">增加考勤机</a>
       <br>
       <br>
       <br>
         <a class="mini-button mini-button-primary" style="height:35px;width:150px; onclick ="deldevice()">删除考勤机</a>
         <a class="mini-button mini-button-warning" style="height:35px;width:150px; onclick="updevice()">修改考勤机</a>
         <br><br><br><br>
         <HR style="border:1 dashed #987cb9" width="100%" color=#987cb9 size=3>
          <br><br>
          
<script type="text/javascript">
mini.parse();
var grid = mini.get("datagrid1");

 function showdevice(){
	 mini.open({
	        url: "../showdevicemsg",
	        title: "查看考勤机", width: 750, height: 500,
	        onload: function () {
	            var iframe = this.getIFrameEl();
	            var data = { action: "new"};
	            iframe.contentWindow.SetData(data);
	        },
	        ondestroy: function (action) {
	        	// grid.reload();
	        
	        }
	     
	    });
	 
 }
 function deldevice(){
	
	 mini.open({
	        url: "../deldevice",
	        title: "刪除考勤机", width: 200, height: 150,
	        onload: function () {
	            var iframe = this.getIFrameEl();
	            var data = { action: "new"};
	            iframe.contentWindow.SetData(data);
	        },
	        ondestroy: function (action) {
 
	        //	 grid.reload();
	        }
	     
	    });
	 
 }
function adddevice(){
	 mini.open({
	        url: "../adddevice",
	        title: "增加考勤机", width: 400, height: 300,
	        onload: function () {
	            var iframe = this.getIFrameEl();
	            var data = { action: "new"};
	        },
	        ondestroy: function (action) {

	        	// grid.reload();
	        }
	     
	    });
	
}
function updevice(){
	 mini.open({
	        url: "../updatadevice",
	        title: "修改考勤机", width: 400, height: 300,
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

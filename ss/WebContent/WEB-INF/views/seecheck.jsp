<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="linkjscss.jsp"></jsp:include>
<html>
<head>

    <title></title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
     <script src="../js/boot.js" type="text/javascript"></script> 
   
      <link href="../css/demo.css" rel="stylesheet" type="text/css" />
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
<div style="padding-bottom:5px;">
        
        <span>&nbsp;&nbsp;&nbsp;&nbsp;员工姓名：</span><input type="text" id="key"  />
        <input type="button" value="查找" onclick="search()"/>
        
        
    </div>
<div id="datagrid1" class="mini-datagrid" style="width:1000px;height:350px;left:10px" 
    url="showcheckinf"  idField="id" allowResize="true"
    sizeList="[20,30,50,100]" pageSize="20"
>
    <div property="columns">
        <div type="indexcolumn" ></div>
        <div field="staffid" width="120" headerAlign="center" allowSort="true">员工账号</div> 
        <div field="staffname" width="120" headerAlign="center" allowSort="true">员工姓名</div>    
        <div field="staffarrtime" width="120" headerAlign="center" allowSort="true">到达时间</div> 
        <div field="staffleavetime" width="120" headerAlign="center" allowSort="true">离开时间</div>  
        <div field="devicenumber" width="120" headerAlign="center" allowSort="true">考勤机号</div>                               
        <div field="statue" width="120" headerAlign="center" allowSort="true">考勤状态</div>                                         
    </div>
</div>   
    
<script type="text/javascript">
    mini.parse();


    var grid = mini.get("datagrid1");


    grid.load();



    function search() {
        var key = document.getElementById("key").value;
        grid.load({ key: key });
    }
    $("#key").bind("keydown", function (e) {
        if (e.keyCode == 13) {
            search();
        }
    });
    </script>  
 </body>
</html>

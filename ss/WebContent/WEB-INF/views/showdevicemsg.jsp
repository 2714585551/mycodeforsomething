<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="../js/boot.js" type="text/javascript"></script>
<link href="../css/demo.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
    <div style="padding-bottom:5px;">
        
        <span>考勤机编号：</span><input type="text" id="key"  />
        <input type="button" value="查找" onclick="search()"/>
        
        
    </div>
   <div id="datagrid1" class="mini-datagrid" style="width:650px;height:400px;" 
    url="showdevice"  idField="id" allowResize="false"
    sizeList="[20,30,50,100]" pageSize="20"
   >
    <div property="columns">
        <div type="indexcolumn" ></div>
        <div field="id" width="50" headerAlign="center" allowSort="true">考勤机编号</div>    
        <div field="devicename" width="80" headerAlign="center" allowSort="true">考勤机名称</div>                            
        <div field="devicestatue" width="80" headerAlign="center" allowSort="true">考勤机使用情况</div>    
        <div field="deviceaddress" width="100" headerAlign="center" allowSort="true">考勤机所在位置</div>         
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
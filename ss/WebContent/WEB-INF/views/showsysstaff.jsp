<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>

    <title>公司设置面板</title>
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
     <br>
   <h3>----❀全体员工设置❀</h3>      

    <div style="width:1010px;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;left:10px">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="edit()">编辑</a>
                        <a class="mini-button" iconCls="icon-remove" onclick="remove()">删除</a>       
                    </td>
                    <td style="white-space:nowrap;">
                        <input id="key" class="mini-textbox" emptyText="请输入姓名" style="width:150px;" onenter="onKeyEnter"/>   
                        <a class="mini-button" onclick="search()">查询</a>
                    </td>
                </tr>
            </table>           
        </div>
    </div>
    <div id="datagrid1" class="mini-datagrid" style="width:1010px;height:280px;left:10px" allowResize="true"
        url="../stafflist"  idField="id" multiSelect="true" 
    >
        <div property="columns">
            <div type="checkcolumn" ></div>        
            <div field="id" width="50" headerAlign="center" allowSort="true">员工帐号</div>    
            <div field="staffName" width="50" headerAlign="center" allowSort="true">姓名</div>  
            <div field="staffPicture" width="90" headerAlign="center" allowSort="true" renderer="showpic" >图片</div>   
            <div header="基本信息" headerAlign="center">
                <div property="columns">
                    <div field="staffGender" width="30" >性别</div>
                     <div field="staffBirthday" width="60" >生日</div>
                    <div field="staffPhone" width="100" allowSort="true">电话号码</div>
                    <div field="staffCardID" width="115" >身份证号</div>
                    <div field="staffEmail" width="120">邮箱</div>
                    <div field="staffDep" width="60">部门</div>
                </div>
            </div>
             <div field="staffRemark" width="120" headerAlign="center" allowSort="true">备注</div>                     
        </div>
    </div>
    

    <script type="text/javascript">
        mini.parse();

        var grid = mini.get("datagrid1");
        grid.load();

        
        function add() {
            
mini.open({
    url: bootPATH + "../demo/CommonLibs/EmployeeWindow.html",
    title: "新增员工", width: 600, height: 400,
    onload: function () {
        var iframe = this.getIFrameEl();
        var data = { action: "new"};
        iframe.contentWindow.SetData(data);
    },
    ondestroy: function (action) {

        grid.reload();
    }
});
        }
        function edit() {
         
            var row = grid.getSelected();
            if (row) {
                mini.open({
                    url: "../editnomstaff",
                    title: "编辑员工", width: 750, height: 600,
                    onload: function () {
                        var iframe = this.getIFrameEl();
                        var data = { action: "edit", id: row.id };
                        iframe.contentWindow.SetData(data);
                        
                    },
                    ondestroy: function (action) {
                        grid.reload();
                        
                    }
                });
                
            } else {
                alert("请选中一条记录");
            }
            
        }
        function remove() {
            
            var rows = grid.getSelecteds();
            if (rows.length > 0) {
            	 grid.removeRows(rows, true);
            } else {
                alert("请选中一条记录");
            }
        }
        function search() {
            var key = mini.get("key").getValue();
            grid.load({ key: key });
        }
        function onKeyEnter(e) {
            search();
        }
        /////////////////////////////////////////////////
        function onBirthdayRenderer(e) {
            var value = e.value;
            if (value) return mini.formatDate(value, 'yyyy-MM-dd');
            return "";
        }
        function onMarriedRenderer(e) {
            if (e.value == 1) return "是";
            else return "否";
        }
        var Genders = [{ id: 1, text: '男' }, { id: 2, text: '女'}];        
        function onGenderRenderer(e) {
            for (var i = 0, l = Genders.length; i < l; i++) {
                var g = Genders[i];
                if (g.id == e.value) return g.text;
            }
            return "";
        }
    </script>
    
     <div class="description">
        <h3>&nbsp;&nbsp;&nbsp;&nbsp;注：</h3>
        <ul>
            <li>显示的是普通员工</li>
            <li>不包含超级管理员</li>
        </ul>
    </div>
</body>
<script type="text/javascript">
function showpic(e){
	debugger;
	      var str = e.value;
	      var num=str.indexOf('\img');
	      var value = str.substring(num); 
      var s =  '<img src="'+value+'" style="width:100px;height:100px;">';
      return   s;
	 }
</script>
</html>

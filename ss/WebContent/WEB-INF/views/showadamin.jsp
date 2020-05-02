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
     <br>
   <h3>----❀管理员设置❀</h3>      
  
    <div style="width:1000px;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;left:20px">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">  
                     <a class="mini-button mini-button-primary" iconCls="icon-add" onclick="add()">增加</a>
                     <a class="mini-button mini-button-info" iconCls="icon-add" onclick="edit()">编辑</a>
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
    <div id="datagrid1" class="mini-datagrid" style="width:1000px;height:280px;left:20px" allowResize="true"
        url="../Adamin"  idField="id" multiSelect="true" 
    >
        <div property="columns">
            <div type="checkcolumn" ></div>        
            <div field="id" width="80" headerAlign="center" allowSort="true">员工帐号</div>    
            <div field="staffName" width="50" headerAlign="left" allowSort="true">姓名</div>  
            <div field="staffPicture" width="120" headerAlign="center" allowSort="true" renderer="showpic" >图片</div>   
            <div header="基本信息" headerAlign="center">
                <div property="columns">
                    <div field="staffGender" width="50" >性别</div>
                     <div field="staffBirthday" width="80" >生日</div>
                    <div field="staffPhone" width="100" allowSort="true">电话号码</div>
                    <div field="staffCardID" width="100" >身份证号</div>
                    <div field="staffEmail" width="120">邮箱</div>
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
    	        url: "../addAdmin",
    	        title: "添加管理员", width: 750, height: 600,
    	        onload: function () {
                    var iframe = this.getIFrameEl();
                    var data = {action: "new" };
                //    iframe.contentWindow.SetData(data);
                    
                },
    	        ondestroy: function (action) {
    	        	// grid.reload();
    	        
    	        }
    	     
    	    }); 

        }
        function edit() {
          var row = grid.getSelected();
            if (row) {
                mini.open({
                    url: "../updataadmin",
                    title: "编辑管理员", width: 750, height: 600,
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
        
        function showpic(e){
        	debugger;
       	      var str = e.value;
       	      var num=str.indexOf('\img');
       	      var value = str.substring(num); 
              var s =  '<img src="'+value+'" style="width:100px;height:100px;">';
              return   s;
        	 }
    </script>
</body>
</html>

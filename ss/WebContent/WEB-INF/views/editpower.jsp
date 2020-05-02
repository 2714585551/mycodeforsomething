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
        font-size:15px;
        padding:0;
        margin:0;
        border:0;
        height:100%;
        overflow:hidden;
    }
    
    </style>
</head>
<body>
    <div class="mini-toolbar" style="text-align:center;line-height:25px;" 
        borderStyle="border-left:0;border-top:0;border-right:0;">
          <label >名称：</label>
          <input id="key" class="mini-textbox" style="width:150px;" onenter="onKeyEnter"/>
          <a class="mini-button" style="width:60px;" onclick="search()">查询</a>
    </div>
    <div class="mini-fit">
        
        <ul id="tree1" class="mini-tree" style="width:100%;height:100%;font-size:25px" 
            showTreeIcon="true" textField="text" idField="id" parentField="pid" resultAsTree="false"  
            showCheckBox="true" checkRecursive="true"
            expandOnLoad="true" allowSelect="false" enableHotTrack="false" 
            >
        </ul>
    
    </div>                
    <div class="mini-toolbar" style="text-align:center;padding-top:8px;padding-bottom:8px;" 
        borderStyle="border-left:0;border-bottom:0;border-right:0;">
        <a class="mini-button" style="width:60px;" onclick="onOk()">确定</a>
        <span style="display:inline-block;width:25px;"></span>
        <a class="mini-button" style="width:60px;" onclick="onCancel()">取消</a>
    </div>
    <input type="hidden" id="staffmsg" name = "staffmsg"/>
</body>
</html>
<script type="text/javascript">
    mini.parse();

    var tree = mini.get("tree1");


    tree.load("../js/listTree.txt");

    function GetCheckedNodes() {
        var nodes = tree.getCheckedNodes();
        return nodes;
    }
    function GetData() {
        var nodes = tree.getCheckedNodes();
        var ids = [], texts = [];
        for (var i = 0, l = nodes.length; i < l; i++) {
            var node = nodes[i];
            ids.push(node.id);
            texts.push(node.text);
        }
        var data = {};
        data.id = ids.join(",");
        data.text = texts.join(",");
        return data;
    }
    function search() {
        var key = mini.get("key").getValue();
        //grid.load({ key: key });
    }
    function onKeyEnter(e) {
        search();
    }
    //////////////////////////////////
    function CloseWindow(action) {
        if (window.CloseOwnerWindow) return window.CloseOwnerWindow(action);
        else window.close();
    }
    function onOk() {
        var node = tree.getSelectedNode();
        if (node && tree.isLeaf(node) == false) {
            alert("不能选中父节点");
            return;
        }else{
        	 var obj = new Object();
        	 obj.id =  document.getElementById("staffmsg").value;
        	 obj.data = GetData();
        	  var mydata = JSON.stringify(obj);
       	   $.ajax({
       	    	url:"../powerset",
       	    	type:"post",
       	        data: {mydata:mydata},
       	        dataType: "json",
       	        async: false,
       	        success:function(data){
              		  alert(data.msg);
       	        },
       	        error:function(){
       	        	alert("菜单设置权限失败");
       	        }
       	    });
        }
        
        CloseWindow("ok");
    }
    function onCancel() {
        CloseWindow("cancel");
    }

    function SetData(data) {
    	debugger;
        if (data.action == "edit") {
            //跨页面传递的数据对象，克隆后才可以安全使用
             id = data.id;
             document.getElementById("staffmsg").value = id;
        }
        else{
        	data = null;
        }
    }

</script>
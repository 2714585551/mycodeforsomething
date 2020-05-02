<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="linkjscss.jsp"></jsp:include>
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
     
    <form id="form1" method="post">
      
        <fieldset style="border:solid 3px #005ab5;padding:30px;">
          
            <legend  style="font-size:30px;font-weight:bold">❀基本信息修改❀</legend>
        <table>
            
            <tr>
                <td style="width:70px;font-weight:bold">公司名称</td>
                <td style="width:150px;padding:5px;">    
                    <input name="companyName" id="companyName"/>
                </td>
                
                 <td style="width:70px;font-weight:bold">公司地址</td>
                <td style="width:150px;padding:5px;">    
                    <input name="companyAddress" id="companyAddress"/>
                </td>
               
              </tr>
              <tr>
                <td style="width:70px;font-weight:bold">公司电话</td>
                <td style="width:150px;padding:5px;">    
                    <input name="companyTelephone" id="companyTelephone"/>
                </td>
                 <td style="width:70px;font-weight:bold">公司邮编</td>
                <td style="width:150px;padding:5px;">    
                    <input name="companyZip" id="companyZip"/>
                </td>
               </tr>
                  <tr>
                     <td style="width:70px;font-weight:bold">公司邮箱</td>
                <td style="width:150px;padding:5px;">    
                    <input name="companyEmile" id="companyEmile"/>
                </td>
                 </tr>
                  <tr>
                     
                <td style="width:70px;font-weight:bold">公司简介</td>
                 <td style="width:150px;padding:5px;colspan:3 ">
                 <textarea class="comments" rows=3 name="companyDetail" id="companyDetail" cols=50 onpropertychange= "this.style.posHeight=this.scrollHeight "></textarea> 
             </td>  

            </tr>                 
        </table>  
         <div style="text-align:center;padding:2px;">               
            <a class="mini-button" onclick="onOk" style="width:80px;margin-right:10px;font-weight:bold">确定</a>       
            <a class="mini-button" onclick="onCancel" style="width:80px;font-weight:bold">取消</a>       
        </div>     
        </fieldset>
              
    </form>
    
     <fieldset style="border:solid 3px #005ab5;padding:2px;">
           <legend  style="font-size:30px;font-weight:bold">❀部门信息修改❀</legend>
             <div style="width:900px;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;left:20px">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="addRow()" plain="true" tooltip="增加...">增加</a>
                        <a class="mini-button" iconCls="icon-remove" onclick="removeRow()" plain="true">删除</a>
                        <span class="separator"></span>
                        <a class="mini-button" iconCls="icon-save" onclick="savedepData()" plain="true">保存</a>            
                    </td>
                    <td style="white-space:nowrap;">
                        <input id="key" class="mini-textbox" emptyText="请输入部门名称" style="width:150px;" onenter="onKeyEnter"/>   
                        <a class="mini-button" onclick="search()">查询</a>
                    </td>
                </tr>
            </table>           
        </div>
    </div>
    <div id="datagrid1" class="mini-datagrid" style="width:900px;height:150px;left:20px" 
        url="../showdep" idField="id" 
        allowResize="true" pageSize="5" 
        allowCellEdit="true" allowCellSelect="true" multiSelect="false" 
        editNextOnEnterKey="true"  editNextRowCell="true"
        
    >
        <div property="columns">
            <div type="indexcolumn"></div>
            <div type="checkcolumn"></div>
            <div name="id"  field="id"   headerAlign="center"  allowCellEdit="false" allowSort="true" width="150" >部门编号
                <input property="editor" class="mini-textbox" style="width:100%;" minWidth="200" />
            </div>
            <div field="depName" width="100" allowSort="false" >部门名称
                <input property="editor" class="mini-textarea"  style="width:100%;"/>
            </div>            
            <div name="createTime" field="createTime" width="100" allowSort="true" dateFormat="yyyy-MM-dd">创建时间
                <input property="editor" class="mini-datepicker" style="width:100%;"/>
            </div>    
            <div field="detail" width="120" headerAlign="center" allowSort="true">备注
                <input property="editor" class="mini-textarea" style="width:200px;" minWidth="200" minHeight="50"/>
            </div>
        </div>
    </div>
      </fieldset>
    
    </from>
    
    <script type="text/javascript">
        mini.parse();
        var grid = mini.get("datagrid1");
        grid.load();
        $.ajax({
	    	url:"../shownewCompany",
	    	type:"post",
	        dataType: "json",
	        success:function(data){
		        debugger;
	         document.getElementById("companyName").value=data.Company.companyName;
	         document.getElementById("companyAddress").value=data.Company.companyAddress;
	         document.getElementById("companyTelephone").value=data.Company.companyTelephone;
	         document.getElementById("companyZip").value=data.Company.companyZip;
	         document.getElementById("companyEmile").value=data.Company.companyEmile;
	         document.getElementById("companyDetail").value=data.Company.companyDetail;
	         
	        },
	        error:function(){
	        	//alert("页面跳转失败");
	        }
	    });
        var form = new mini.Form("form1");

        function SaveData() {
        	
        	 var obj = new Object();
        	   obj.companyName = document.getElementById("companyName").value;
        	   obj.companyAddress = document.getElementById("companyAddress").value;
        	   obj.companyTelephone = document.getElementById("companyTelephone").value;
        	   obj.companyZip = document.getElementById("companyZip").value;
        	   obj.companyEmile = document.getElementById("companyEmile").value;
        	   obj.companyDetail = document.getElementById("companyDetail").value;
        	   if(obj.companyName == null || obj.companyName == ""){
        	   	alert("公司名称不能为空");
        	   	return ;
        	   }
        	   if(obj.companyAddress == null || obj.companyAddress == ""){
        	   	alert("公司地址不能为空");
        	   	return ;
        	   }
        	   if(obj.companyTelephone == null || obj.companyTelephone == ""){
        		   	alert("公司电话不能为空");
        		   	return ;
        		   }
        	   if(obj.companyZip == null || obj.companyZip == ""){
        		   	alert("公司邮编不能为空");
        		   	return ;
        		   }
        	   if(obj.companyEmile == null || obj.companyEmile == ""){
        		   	alert("公司邮箱不能为空");
        		   	return ;
        		   }


        	   
        		   if(!/^[0-9]*$/.test(obj.companyTelephone)){
        			   	alert("公司电话应为数字");
        			   	return ;
        			   }
        		   if(!/\d{6}/.test(obj.companyZip)){
        			   	alert("邮编格式错误");
        			   	return ;
        			   }
        		   if(!/\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/.test(obj.companyEmile)){
        			   	alert("公司邮箱输入错误");
        			   	return ;
        			   }
        		   var mydata = JSON.stringify(obj);
        		   debugger;
        		   $.ajax({
        		    	url:"../ergister/regcom",
        		        type:"post",
        		        dataType: "json",
        		        data: {mydata:mydata},
        		        success:function(data){
        	        		  alert("保存成功");
        	        		  
        		        },
        		        error:function(){
        		        	alert("保存失败");
        		        }
        		    });
        	}
        function onCancel(e) {
        	debugger;
        	alert("取消当前操作，恢复原有信息");
        	window.location.reload();
        }

        function onOk(e) {
            SaveData();
        }
 
        function search() {
            var key = mini.get("key").getValue();

            grid.load({ key: key });
        }

        function onKeyEnter(e) {
            search();
        }

        function addRow() {          
            var newRow = { name: "New Row" };
            grid.addRow(newRow, 0);

            grid.beginEditCell(newRow, "id");
        }
        function removeRow() {
            var rows = grid.getSelecteds();
            if (rows.length > 0) {
                grid.removeRows(rows, true);
            }
        }
       function savedepData(){
    	   debugger;
    	   var row = grid.getSelecteds();
    	   if(row.length == 1)
    		   {
    		      var data = new Date(row[0].createTime); 
    		      var value = mini.formatDate(data, 'yyyy-MM-dd HH:mm:ss');
    		       var obj = new Object();
    		       obj.depName = row[0].depName;
    		       obj.createTime = value;
    		       obj.detail = row[0].detail;
    		       var mydata = JSON.stringify(obj);
    		       $.ajax({
       		    	url:"../adddepart",
       		        type:"post",
       		        dataType: "json",
       		        data: {mydata:mydata},
       		        success:function(data){
       	        		  alert(data.msg);
       	        		  
       		        },
       		        error:function(){
       		        	alert("保存失败");
       		        }
       		    });
    		       
    		   }
         else{
    		   alert("请选择一条记录进行保存");
    	   }
       }
    </script>
</body>
</html>

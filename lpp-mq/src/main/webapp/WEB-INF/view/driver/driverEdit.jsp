<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
  	<script type="text/javascript">
  	
  	$(function() {        
        $('#provinceCode').combobox({   
            url:'region/queryProvince',   
            editable:false, //不可编辑状态  
            cache: false,  
            panelHeight: '150',//自动高度适合  
            valueField:'provinceCode',
            textField:'provinceName',
            onSelect:function(area){
            	$('#cityCode').combobox('clear');
            	$('#areaCode').combobox('clear');
                $('#cityCode').combobox(
                		{   
                            url:'region/queryCity?provinceCode=' + area.provinceCode,   
                            editable:false, //不可编辑状态  
                            cache: false,  
                            panelHeight: '150',//自动高度适合  
                            valueField:'cityCode',
                            textField:'cityeName',
                            onSelect:function(area){
                            	$('#areaCode').combobox('clear');
                                $('#areaCode').combobox('reload','AreaServlet?areaid='+area.areaID)
                                }
                           }
                	)
                }
           });  
          
  	}); 
  	
		jQuery(function($){
		
		function addDriver(){
			var r = $('#driverForm').form('validate');
			if(!r) {
				return false;
			}
			$.post("driver/add",$("#driverForm").serializeArray(),function(data){
				if(data.success){
					$.messager.alert('提示',data.msg,'info');
					$('#MyPopWindow').window('close');
					$('#driverTable').datagrid('reload');  
				}else{
					
				}
			});
		}
		});
		
	</script>
  </head>
  
  <body>
  	<!-- 验证还是jquery-validation好用，这里省事没用 -->
	<form id="driverForm" method="post" style="margin: 10;text-align: center;">
		<input type="hidden" name="id" id="uuid">
		司机名字：<input name="driverName" style="width: 200" validType="length[3,30]" class="easyui-validatebox" required="true"> <br>
		司机年龄：<input class="easyui-numberspinner" name="driverAge" min="1" max="120" increment="1" style="width:200px;"></input><br>
		司机性别：<select class="easyui-combobox" id="driverSex" name="driverSex" style="width:200px;">
						<option value="1">男</option>
						<option value="2">女</option>
				</select>
				<br>
		司机电话：<input name="mobilePhone" style="width: 200" validType="length[8,11]" class="easyui-validatebox" required="true"><br>
		身份证：   <input name="personCard" style="width: 200" validType="length[15,18]" class="easyui-validatebox" required="true"><br>
		证件类型：<select class="easyui-combobox" id="driverType" name="driverType" style=”width:200px;”>
						<option value="1">A1</option>
						<option value="2">A2</option>
						<option value="3">B1</option>
						<option value="4">B2</option>
						<option value="5">C1</option>
						<option value="6">C2</option>
				</select>
				<br>
		证件号码：<input name="driverNo" style="width: 200" class="easyui-validatebox" required="true"><br>
		家庭住址：<input id="provinceCode" class="easyui-combobox" />
			    <input id="cityCode" class="easyui-combobox"/>
			   	<input id="areaCode"  class="easyui-combobox "/>
		     	<input name="personAddress" style="width: 200" class="easyui-validatebox" required="true"><br>
		备注：<input name="remark" style="width: 200"><br>
		<br>
		<a href="#" id="btn-back" onclick="closeWindow();" class="easyui-linkbutton" iconCls="icon-back">返回</a>
		<a href="#" id="btn-add" onclick="addDriver();" class="easyui-linkbutton" iconCls="icon-save">保存</a>
	</form>
  </body>
</html>

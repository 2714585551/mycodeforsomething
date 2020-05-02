<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
  	<script type="text/javascript">
		function addUser(){
			var r = $('#userForm').form('validate');
			if(!r) {
				return false;
			}
			$.post("user/add",$("#userForm").serializeArray(),function(data){
				$('#MyPopWindow').window('close');
				$('#userTable').datagrid('reload');  
				$.messager.alert('提示',data.msg,'info');
			});
		}
		
	</script>
  </head>
  
  <body>
  	<!-- 验证还是jquery-validation好用，这里省事没用 -->
	<form id="userForm" method="post" style="margin: 10;text-align: center;">
		<input type="hidden" name="id" id="id">
		名字：<input name="name" style="width: 200" validType="length[3,30]" class="easyui-validatebox" required="true"> <br>
		性别：<select id="sex" class="easyui-combobox" name="sex"  editable="false" 
					style="width: 200px;"  required="true">
						<option value="1">男</option>
						<option value="2">女</option>
				</select>
				<br>
		年龄：<input class="easyui-numberspinner" id="age" name="age" min="1" max="100" increment="1" style="width:200px;" required="true"></input><br>
		电话：<input name="telephone" id=telephone"" style="width: 200"  class="easyui-validatebox" required="true" validType="length[8,11]"  ><br>
		邮箱：<input id="email" name="email" style="width: 200"  required="true" validType="email"><br>
		<br>
		<a href="#" id="btn-back" onclick="closeWindow();" class="easyui-linkbutton" iconCls="icon-back">返回</a>
		<a href="#" id="btn-add" onclick="addUser();" class="easyui-linkbutton" iconCls="icon-save">保存</a>
	</form>
  </body>
</html>

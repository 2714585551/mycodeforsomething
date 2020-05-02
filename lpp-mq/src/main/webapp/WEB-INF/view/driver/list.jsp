<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <script type="text/javascript">
    jQuery(function($){
		$('#driverTable').datagrid({
			title:'司机列表', //标题
			method:'post',
			iconCls:'icon-edit', //图标
			singleSelect:false, //多选
			height:600, //高度
			fitColumns: true, //自动调整各列，用了这个属性，下面各列的宽度值就只是一个比例。
			striped: true, //奇偶行颜色不同
			collapsible:true,//可折叠
			url:"driver/querylist", //数据来源
			sortName: 'id', //排序的列
			sortOrder: 'desc', //倒序
			remoteSort: true, //服务器端排序
			idField:'id', //主键字段
			//queryParams:{}, //查询条件
			queryParams: buildQueryParams(),
			pagination:true, //显示分页
			rownumbers:true, //显示行号
			pageSize: 10, //读取分页条数，即向后台读取数据时传过去的值
	        pageList: [10, 20, 50], //可以调整每页显示的数据，即调整pageSize每次向后台请求数据时的数据
			columns:[[
				{field:'ck',checkbox:true,width:2}, //显示复选框
				{field:'driverName',title:'司机姓名', width:20,sortable:true, hight:40, 
					formatter:function(value,row,index){return row.driverName;} //需要formatter一下才能显示正确的数据
				},
				{field:'driverAge',title:'司机年龄', width:20,sortable:true, hight:40, 
					formatter:function(value,row,index){return row.driverAge;} //需要formatter一下才能显示正确的数据
				},
				{field:'driverSex',title:'司机性别', width:20,sortable:true, hight:40, 
					formatter:function(value,row,index){
								if(row.driverSex == '1'){
									return '男';
								}
								return '女';
							  } //需要formatter一下才能显示正确的数据
				},
				{field:'mobilePhone',title:'司机联系电话', width:20,sortable:true, hight:40, 
					formatter:function(value,row,index){return row.mobilePhone;} //需要formatter一下才能显示正确的数据
				},
				{field:'personCard',title:'身份证号码', width:20,sortable:true, hight:40, 
					formatter:function(value,row,index){return row.personCard;} //需要formatter一下才能显示正确的数据
				},
				{field:'driverType',title:'驾照类型', width:20,sortable:true, hight:40, 
					formatter:function(value,row,index){return row.driverType;} //需要formatter一下才能显示正确的数据
				},
				{field:'driverNo',title:'驾驶证编号', width:20,sortable:true, hight:40, 
					formatter:function(value,row,index){return row.driverNo;} //需要formatter一下才能显示正确的数据
				},
				{field:'operateTime',title:'创建时间', width:20,sortable:true, hight:40, 
					formatter:function(value,row,index){return row.operateTime;} //需要formatter一下才能显示正确的数据
				},
				{field:'operateUser',title:'创建人', width:20,sortable:true, hight:40, 
					formatter:function(value,row,index){return row.operateUser;} //需要formatter一下才能显示正确的数据
				}
			]],
			toolbar:[{
				text:'新增',
				iconCls:'icon-add',
				handler:function(){
					addrow();
				}
			},'-',{
				text:'更新',
				iconCls:'icon-edit',
				handler:function(){
					updaterow();
				}
			},'-',{
				text:'删除',
				iconCls:'icon-remove',
				handler:function(){
					deleterow();
				}
			},'-'],
			onLoadSuccess:function(){
				$('#driverTable').datagrid('clearSelections'); //一定要加上这一句，要不然datagrid会记住之前的选择状态，删除时会出问题
			}
		});
    	
		function buildQueryParams(){
			debugger ;
			var param = new Object();
			param.page = 1;
			param.rows = 10 ;
		}
	});
    //新增
    function addrow(){
    	showWindow({
  			title:'增加司机信息',
  			href:'driver/edit',
  			width:300,
  			height:400,
  			onLoad: function(){
  				$('#userForm').form('clear');
  			}
  			
  		});
	}
  //更新
    function updaterow(){
		var rows = $('#driverTable').datagrid('getSelections');
		//这里有一个jquery easyui datagrid的一个小bug，必须把主键单独列出来，要不然不能多选
		if(rows.length==0){
			$.messager.alert('提示',"请选择你要更新的司机",'info');
			return;
		}
		if(rows.length > 1){
			$.messager.alert('提示',"只能选择一位用户进行更新",'info');
			return;
		}
		showWindow({
  			title:'更新用户信息',
  			href:'user/popWindow',
  			width:600,
  			height:400,
  			onLoad: function(){
  			//自动将数据填充到表单中，无需再查询数据库，这里需要注意：
  			//如果用的是struts2，它的表单元素的名称都是user.id这样的，那load的时候不能加.user要.form('load', rows[0]);
  			//而spring mvc中表单元素的名称不带对象前缀，直拉就是id，所以这里load的时候是：.form('load', rows[0].user)
  				$("#userForm").form('load', rows[0].user);
  			}
  		});
	}
  	
  //删除
  	function deleterow(){
  		$.messager.confirm('提示','确定要删除吗?',function(result){
	        if (result){
	        	var rows = $('#driverTable').datagrid('getSelections');
	        	var ps = "";
	        	$.each(rows,function(i,n){
	        		if(i==0) 
	        			ps += "?uid="+n.uid;
	        		else
	        			ps += "&uid="+n.uid;
	        	});
	        	$.post('user/delete'+ps,function(data){
		        	$('#driverTable').datagrid('reload'); 
	        		$.messager.alert('提示',data.mes,'info');
	        	});
	        }
	    });
  	}
    //表格查询
	function searchDriver(){
    	debugger ;
		var params = $('#driverTable').datagrid('options').queryParams; //先取得 datagrid 的查询参数
		var fields =$('#queryForm').serializeArray(); //自动序列化表单元素为JSON对象
		$.each( fields, function(i, field){
			params[field.name] = field.value; //设置查询参数
		}); 
		$('#driverTable').datagrid('reload'); //设置好查询参数 reload 一下就可以了
	}
	//清空查询条件
	function clearForm(){
		$('#queryForm').form('clear');
		searchDriver();
	}
    
	</script>	
  </head>
  
  <body>
    <form id="queryForm" style="margin:10;text-align: center;">
		<table width="100%">
			<tr>
				<td>名字：<input name="driverName" style="width: 200"></td>
				<td>证件类型：<select id="driverType" class="easyui-combobox" name="driverType" style="width: 200px;">
							<option value="1">A1</option>
							<option value="2">A2</option>
							<option value="3">B1</option>
							<option value="4">B2</option>
							<option value="5">C1</option>
							<option value="6">C2</option>
						</select>
				</td>
				<td align="center"><a href="#" onclick="searchDriver();" class="easyui-linkbutton" iconCls="icon-search">查询</a></td>
				<td align="center"><a href="#" onclick="clearForm();" class="easyui-linkbutton" iconCls="icon-search">清空</a></td>
			</tr>
		</table>
	</form>
	<div style="padding:10" id="tabdiv">
		<table id="driverTable"></table>
	</div>
  </body>
</html>

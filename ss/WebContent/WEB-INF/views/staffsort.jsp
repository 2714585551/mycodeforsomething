<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:include page="linkjscss.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
<script src="../js/jquery-1.10.2.js"></script>
<title>员工注册</title>
<style type="text/css">
html,body 
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

<h3>------------------------------------❀员工排版表--------------------------以一个月为准❀-----------------------------</h3>
    <div style="width:1010px;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;left:10px">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-save" onclick="save()">保存</a>
                        <a class="mini-button" iconCls="icon-no" onclick="remove()">重置</a>       
                    </td>
                    <td style="white-space:nowrap;">
                        <input id="key" class="mini-textbox" emptyText="请输入姓名" style="width:150px;" onenter="onKeyEnter"/>   
                        <a class="mini-button" onclick="search()">查询</a>
                    </td>
                </tr>
            </table>           
        </div>
    </div>



<div id="grid1" class="mini-datagrid" style="width:100%;height:500px;"        
    idField="UID" pageSize="50"  url="../stafflist"
    allowCellEdit="true" allowCellSelect="true" multiSelect="true"    
    showPager="false" virtualScroll="true" showFilterRow="true" sortMode="client" 
    _frozenStartColumn="0" _frozenEndColumn="2" 
    virtualColumns="true"
>
    <div property="columns">
    
        <div field="id" width="50" headerAlign="center" allowSort="true">账号</div>
        <div field="staffName" width="50" headerAlign="center" >姓名</div>
        <div type="checkboxcolumn" field="A" trueValue="1" falseValue="0" width="30" headerAlign="center">1</div>    
        <div type="checkboxcolumn" field="B" trueValue="1" falseValue="0" width="30" headerAlign="center">2</div>    
        <div type="checkboxcolumn" field="C" trueValue="1" falseValue="0" width="30" headerAlign="center">3</div>    
        <div type="checkboxcolumn" field="D" trueValue="1" falseValue="0" width="30" headerAlign="center">4</div>    
        <div type="checkboxcolumn" field="E" trueValue="1" falseValue="0" width="30" headerAlign="center">5</div>    
        <div type="checkboxcolumn" field="F" trueValue="1" falseValue="0" width="30" headerAlign="center">6</div>    
        <div type="checkboxcolumn" field="G" trueValue="1" falseValue="0" width="30" headerAlign="center">7</div>    
        <div type="checkboxcolumn" field="H" trueValue="1" falseValue="0" width="30" headerAlign="center">8</div>    
        <div type="checkboxcolumn" field="I" trueValue="1" falseValue="0" width="30" headerAlign="center">9</div>    
        <div type="checkboxcolumn" field="G" trueValue="1" falseValue="0" width="30" headerAlign="center">10</div>    
        <div type="checkboxcolumn" field="K" trueValue="1" falseValue="0" width="30" headerAlign="center">11</div>    
        <div type="checkboxcolumn" field="L" trueValue="1" falseValue="0" width="30" headerAlign="center">12</div>    
        <div type="checkboxcolumn" field="M" trueValue="1" falseValue="0" width="30" headerAlign="center">13</div>    
        <div type="checkboxcolumn" field="N" trueValue="1" falseValue="0" width="30" headerAlign="center">14</div>    
        <div type="checkboxcolumn" field="O" trueValue="1" falseValue="0" width="30" headerAlign="center">15</div>    
        <div type="checkboxcolumn" field="P" trueValue="1" falseValue="0" width="30" headerAlign="center">16</div>    
        <div type="checkboxcolumn" field="Q" trueValue="1" falseValue="0" width="30" headerAlign="center">17</div>    
        <div type="checkboxcolumn" field="R" trueValue="1" falseValue="0" width="30" headerAlign="center">18</div>    
        <div type="checkboxcolumn" field="S" trueValue="1" falseValue="0" width="30" headerAlign="center">19</div>    
        <div type="checkboxcolumn" field="T" trueValue="1" falseValue="0" width="30" headerAlign="center">20</div>    
        <div type="checkboxcolumn" field="U" trueValue="1" falseValue="0" width="30" headerAlign="center">21</div>    
        <div type="checkboxcolumn" field="V" trueValue="1" falseValue="0" width="30" headerAlign="center">22</div>        
        <div type="checkboxcolumn" field="W" trueValue="1" falseValue="0" width="30" headerAlign="center">23</div>    
        <div type="checkboxcolumn" field="X" trueValue="1" falseValue="0" width="30" headerAlign="center">24</div>    
        <div type="checkboxcolumn" field="Y" trueValue="1" falseValue="0" width="30" headerAlign="center">30</div>    
        <div type="checkboxcolumn" field="Z" trueValue="1" falseValue="0" width="30" headerAlign="center">26</div>    
        <div type="checkboxcolumn" field="AA" trueValue="1" falseValue="0" width="30" headerAlign="center">27</div>    
        <div type="checkboxcolumn" field="AB" trueValue="1" falseValue="0" width="30" headerAlign="center">28</div>    
        <div type="checkboxcolumn" field="AC" trueValue="1" falseValue="0" width="30" headerAlign="center">29</div>    
        <div type="checkboxcolumn" field="AD" trueValue="1" falseValue="0" width="30" headerAlign="center">30</div>    
        <div type="checkboxcolumn" field="AE" trueValue="1" falseValue="0" width="30" headerAlign="center">31</div>  
  
  
    </div>
</div>
</body>
<script type="text/javascript">

mini.parse();

var grid = mini.get("grid1");
grid.load();
function search() {
    var key = mini.get("key").getValue();
    grid.load({ key: key });
}
function onKeyEnter(e) {
    search();
}
function save(){
	debugger;
	var data = grid.getData();
	var num = data.length;
    var x = 0;
	for(x in data)
	{
		var objs = data[x];
	    var json = mini.encode(objs);
		   $.ajax({
		    	url:"../savesort",
		    	type:"post",
		        data: {mydata:json},
		        dataType: "json",
		        success:function(data){
	        		  alert(data.msg);
		        },
		        error:function(){
		        	alert("保存失败");
		        }
		    });
		   
	}
	
}
</script>
</html>
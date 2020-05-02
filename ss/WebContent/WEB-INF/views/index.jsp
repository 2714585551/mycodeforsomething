<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="linkjscss.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<head>
<body style="background-color: #E2E2E2;">
    <div class="container">
        <div class="row text-center " style="padding-top:100px;">
            <div class="col-md-12">
                <img src="../img/logo-invoice.png" />
            </div>
        </div>
         <div class="row ">
               
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1">
                           
                            <div class="panel-body">
                                
                                    <hr />
                                    <h5>登录</h5>
                                       <br />
                                     <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" id="account" class="form-control" placeholder="你的账号" />
                                        </div>
                                                                              <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                            <input type="password" id="password" class="form-control"  placeholder="你的密码" />
                                        </div>
                                    <div class="form-group">
                                            <label class="checkbox-inline">
                                                <input type="checkbox" />记住密码
                                            </label>
                                            <span class="pull-right">
                                                   <a href="../login/register" >注册&nbsp;</a> 
                                                   <a href="#">&nbsp;忘记密码了</a>
                                            </span>
                                        </div>
                                     
                                     <a href="#" class="btn btn-primary" onclick="login()">Login Now</a>
                                    <hr />
                                    
                                    
                            </div> 
                            
                              
                        </div>               
        </div>
    </div>
<script type="text/javascript">

function login(){
    var obj = new Object();
    obj.account = document.getElementById("account").value;
    obj.password = document.getElementById("password").value;
    if(obj.account == null || obj.account == ""){
    	alert("账号不能为空");
    	return ;
    }
    if(obj.password == null || obj.password == ""){
    	alert("密码不能为空");
    	return ;
    }
    var mydata = JSON.stringify(obj);
    debugger;
    $.ajax({
    	url:"../login/logincheck",
    	type:"post",
        data: {mydata:mydata},
        dataType: "json",
        success:function(data){
        	if(data.error == "账户或密码有误")
        		{
        		  alert("账户或密码有误");
        		}
        	if(data.success == "登陆成功")
        		{
        	    	window.location.href = "../login/mainpage";
        		}
        },
        error:function(){
        	alert("登陆失败");
        }
    });
}


</script>
</body>
</html>
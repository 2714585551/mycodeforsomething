<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:include page="linkjscss.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>后台管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">考勤系统</a>
            </div>

            <div class="header-right">
                <a href="#" class="btn btn-info" title="New Message"><b>${msgnum}</b><i class="fa fa-envelope-o fa-2x"></i></a>
                <a href="#" class="btn btn-primary" title='${msg}'><b>查看公告</b><i class="fa fa-bars fa-2x"></i></a>
                <a href="/login/index" class="btn btn-danger" title="Logout"><b>退出</b><i class="fa fa-exclamation-circle fa-2x"></i></a>

            </div>
        </nav>
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <div class="user-img-div">
                            <img src="../img/user.png" class="img-thumbnail" />
                            <div class="inner-text">
                                ${staff.staffName} 你好
                            <br />
                                <small>欢迎您来到考勤系统</small>
                            </div>
                        </div>

                    </li>
                    <li>
                      <a href="#" id="accountproperty" name="accountproperty" style="display:none"><i class="fa fa-desktop "></i> <span class="fa arrow"></span>账号属性</a>
                         <ul class="nav nav-second-level">
                         <li>
                           <a href="../showmyinf" target="iframe1" style="display:none" id="myinf"  name="myinf" onclick="even()"><i class="fa fa-toggle-on"></i>个人信息</a>
                        </li>
                        <li>
                                <a href="../setpassword" target="iframe8" style="display:none" id="setpassword" onclick="even7()"><i class="fa fa-flask"></i>修改密码</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                         <a href="#" id="cominf" style="display:none"><i class="fa fa-bicycle"></i> <span class="fa arrow"></span>公司信息</a>
                         <ul class="nav nav-second-level">
                            <li>
                                <a href="../showCompanypage" style="display:none" id="showCompanypage" target="iframe2" onclick="even1()"><i class="fa fa-coffee"></i>公司简介</a>
                            </li>
                         </ul>
                     </li>  
                     
                     <li>
                         <a href="#" id="sysset" style="display:none"><i class="fa fa-yelp"></i> <span class="fa arrow"></span>系统设置</a>
                         <ul class="nav nav-second-level">
                            <li>
                                <a href="../showCompanyset" style="display:none" id="showCompanyset" target="iframe3" onclick="even2()"><i class="fa fa-eyedropper"></i>公司设置</a>
                            </li>
                            <li>
                                <a href="../showadamin" target="iframe4" style="display:none" id="showadamin" onclick="even3()"><i class="  fa fa-flash"></i>管理员设置</a>
                            
                            </li>
                            <li>
                                <a href="../notice" target="iframe12" id="notice" style="display:none" onclick="even11()"><i class="fa fa-sitemap"></i>发布公告</a>
                            </li>
                               <li>
                                <a href="../power" target="iframe13" style="display:none" id="syspower" onclick="even12()"><i class="fa fa-square-o"></i>权限设置</a>
                            </li>
                               <li>
                                <a href="../staffsort" target="iframe14" style="display:none" id="staffsort" onclick="even13()"><i class="fa fa-key"></i>员工排班</a>
                            </li>
                         </ul>
                     </li>  
                     <li>
                        <a href="#" id="staffset" style="display:none"><i class="fa fa-anchor"></i> <span class="fa arrow"></span>员工设置</a>
                             <ul class="nav nav-second-level">
                            <li>
                                <a href="../showsysstaff" id="showsysstaff" style="display:none" target="iframe5" onclick="even4()"><i class="fa fa-sitemap"></i>全部员工</a>
                            </li>
                             <li>
                                <a href="../addstaff" id="addstaff" target="iframe6" style="display:none" onclick="even5()"><i class="fa fa-square-o"></i>添加员工</a>
                            </li>
                             <li>
                                <a href="../seecheck" id="seecheck" target="iframe7" style="display:none" onclick="even6()"><i class="fa fa-flask"></i>查看考勤</a>
                            </li>
                             
                         </ul>
                         </li>
                         <li>
                        <a href="#" id="report" style="display:none"><i class="fa fa-key"></i> <span class="fa arrow"></span>报表中心</a>
                             <ul class="nav nav-second-level">
                            <li>
                                <a href="../showReport" id="showReport" style="display:none" target="iframe9" onclick="even8()"><i class="fa fa-send"></i>查看报表</a>
                            </li>
                         </ul>
                         </li>
                         <li>
                         <a href="#" id="device" style="display:none"><i class="fa fa-eyedropper"></i> <span class="fa arrow"></span>设备设置</a>
                             <ul class="nav nav-second-level">
                            <li>
                                <a href="../deviceset" id="deviceset" style="display:none" target="iframe10" onclick="even9()"><i class="fa fa-edit"></i>考勤机设置</a>
                            </li>
                            <li>
                                <a href="../test" id="test" target="iframe11" style="display:none" onclick="even10()"><i class="fa fa-code"></i>模拟考勤</a>
                            </li>
                         </ul>
                     </li>      
               </ul>
               <input type ="hidden" id="powerdata" name = "powerdata" value='${powerdata}'>
             </div>
          </nav>
          <iframe class="right" name ="iframe1" id="iframe1" src="../showmyinf"></iframe> 
          <iframe class="right" name ="iframe2" id="iframe2" src="../showCompanypage" style="display:none"></iframe> 
          <iframe class="right" name ="iframe3" id="iframe3" src="../showCompanyset" style="display:none"></iframe> 
          <iframe class="right" name ="iframe4" id="iframe4" src="../showadamin" style="display:none"></iframe> 
          <iframe class="right" name ="iframe5" id="iframe5" src="../showsysstaff" style="display:none"></iframe>
          <iframe class="right" name ="iframe6" id="iframe6" src="../addstaff" style="display:none"></iframe> 
          <iframe class="right" name ="iframe7" id="iframe7" src="../seecheck" style="display:none"></iframe>  
          <iframe class="right" name ="iframe8" id="iframe8" src="../setpassword" style="display:none"></iframe>  
          <iframe class="right" name ="iframe9" id="iframe9" src="../showReport" style="display:none"></iframe>  
          <iframe class="right" name ="iframe10" id="iframe10" src="../deviceset" style="display:none"></iframe>  
          <iframe class="right" name ="iframe11" id="iframe11" src="../test" style="display:none"></iframe>  
          <iframe class="right" name ="iframe12" id="iframe12" src="../notice" style="display:none"></iframe>  
          <iframe class="right" name ="iframe13" id="iframe13" src="../power" style="display:none"></iframe>  
           <iframe class="right" name ="iframe14" id="iframe14" src="../staffsort" style="display:none"></iframe>  
       </div>
<script type="text/javascript">
function even(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="block";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";


}

function even1(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");

		iframe1.style.display="none";
		iframe2.style.display="block";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";
}

function even2(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="block";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";
}

function even3(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="block";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";


		}
function even4(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="block";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";
		}	
function even5(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="block";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";
		}	
function even6(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="block";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";
		}	
		
function even7(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="block";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";
		}
function even8(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="block";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";
		}
function even9(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="block";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";
		}
function even10(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="block";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="none";
		}
		
function even11(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="block";
        iframe13.style.display="none";
        iframe14.style.display="none";
		}
function even12(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="block";
        iframe14.style.display="none";
		}
function even13(){
	var iframe1 = document.getElementById("iframe1");
	var iframe2 = document.getElementById("iframe2");
	var iframe3 = document.getElementById("iframe3");
	var iframe4 = document.getElementById("iframe4");
	var iframe5 = document.getElementById("iframe5");
	var iframe6 = document.getElementById("iframe6");
	var iframe7 = document.getElementById("iframe7");
	var iframe8 = document.getElementById("iframe8");
	var iframe9 = document.getElementById("iframe9");
	var iframe10 = document.getElementById("iframe10");
	var iframe11 = document.getElementById("iframe11");
	var iframe12 = document.getElementById("iframe12");
	var iframe13 = document.getElementById("iframe13");
	var iframe14 = document.getElementById("iframe14");
		iframe1.style.display="none";
		iframe2.style.display="none";
		iframe3.style.display="none";
		iframe4.style.display="none";
		iframe5.style.display="none";
        iframe6.style.display="none";
        iframe7.style.display="none";
        iframe8.style.display="none";
        iframe9.style.display="none";
        iframe10.style.display="none";
        iframe11.style.display="none";
        iframe12.style.display="none";
        iframe13.style.display="none";
        iframe14.style.display="block";
		}
$(document).ready(function(){  
	debugger;
	   var dataarr = new Array();  
       var datamsg =  document.getElementById("powerdata").value;
       if(datamsg !=null && datamsg !="admin"){
    	   var power = JSON.parse(datamsg);
           var powerid = power.id;
           dataarr = powerid.split(",");
       for (x in dataarr)
       {
    	   
           if(dataarr[x] == 1)
        	   {
        	      document.getElementById("accountproperty").style.display="block";
        	   }
           if(dataarr[x] == 11)
    	   {
    	      document.getElementById("myinf").style.display="block";
    	   }
           if(dataarr[x] == 12)
    	   {
    	      document.getElementById("setpassword").style.display="block";
    	   }
           if(dataarr[x] == 2)
    	   {
    	      document.getElementById("cominf").style.display="block";
    	   }
          if(dataarr[x] == 21)
	     {
	         document.getElementById("showCompanypage").style.display="block";
	     }
          if(dataarr[x] == 3)
   	   {
   	      document.getElementById("sysset").style.display="block";
   	   }
      if(dataarr[x] == 31)
	   {
	      document.getElementById("showCompanyset").style.display="block";
	   }
      if(dataarr[x] == 32)
	   {
	      document.getElementById("showadamin").style.display="block";
           
       }
      if(dataarr[x] == 33)
	   {
	      document.getElementById("notice").style.display="block";
	   }
     if(dataarr[x] == 34)
	   {
	      document.getElementById("syspower").style.display="block";
          
      }
     if(dataarr[x] == 35)
	   {
	      document.getElementById("staffsort").style.display="block";
        
    }
     if(dataarr[x] == 4)
 	   {
 	      document.getElementById("staffset").style.display="block";
 	   }
    if(dataarr[x] == 41)
	   {
	      document.getElementById("showsysstaff").style.display="block";
	   }
    if(dataarr[x] == 42)
	   {
	      document.getElementById("addstaff").style.display="block";
         
     }
    if(dataarr[x] == 43)
	   {
	      document.getElementById("seecheck").style.display="block";
	   }
    
    if(dataarr[x] == 5)
	   {
	      document.getElementById("report").style.display="block";
	   }
   if(dataarr[x]== 51)
	   {
	      document.getElementById("showReport").style.display="block";
	   }
   
   if(dataarr[x] == 6)
	   {
	      document.getElementById("device").style.display="block";
	   }
  if(dataarr[x] == 61)
   {
      document.getElementById("deviceset").style.display="block";
   }
  if(dataarr[x] == 62)
  {
     document.getElementById("test").style.display="block";
  }
       }
       }
       if(datamsg =="admin"){
          document.getElementById("accountproperty").style.display="block";
          document.getElementById("myinf").style.display="block";
          document.getElementById("setpassword").style.display="block";
    	  document.getElementById("cominf").style.display="block";
  	      document.getElementById("showCompanypage").style.display="block";
     	  document.getElementById("sysset").style.display="block";
  	      document.getElementById("showCompanyset").style.display="block";
  	      document.getElementById("showadamin").style.display="block";
  	      document.getElementById("notice").style.display="block";
  	      document.getElementById("syspower").style.display="block";
   	      document.getElementById("staffset").style.display="block";
  	      document.getElementById("showsysstaff").style.display="block";
  	      document.getElementById("addstaff").style.display="block";
  	      document.getElementById("seecheck").style.display="block";
  	      document.getElementById("report").style.display="block";
  	      document.getElementById("showReport").style.display="block";
  	      document.getElementById("device").style.display="block";
          document.getElementById("deviceset").style.display="block";
          document.getElementById("test").style.display="block";
          document.getElementById("staffsort").style.display="block";
       }
}); 
		
</script>
</body>
</html>
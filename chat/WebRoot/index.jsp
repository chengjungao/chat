<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录程军高的管理系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="layer/skin/layer.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery-1.8.3.min.js"></script>
<script src="js/cloud.js" type="text/javascript"></script>
	<script src="layer/layer.js" type="text/javascript"></script>
<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  
});  

 function adduser(){
   layer.open({
         type: 2,
         shift: 0,
         title:'新增用户',
         scrollbar: false,
         moveType: 1,
         btn: ['提交', '取消'],
         yes: function(index, layero){ //或者使用btn1
              var iframe=window.frames["layui-layer-iframe"+index]; //document.getElementById("");
              var userid=iframe.document.getElementById("userid").value;
              var username=iframe.document.getElementById("username").value;
              var password=iframe.document.getElementById("password").value;
             /*  var content=iframe.document.getElementById("category").value;
              var title=iframe.document.getElementById("deptid").value;
              var content=iframe.document.getElementById("roleid").value;
               var content=iframe.document.getElementById("remark").value; */
       $.ajax({
        url: "user/adduser.do",
        type: "post",
        data:{    
             userid:userid,
             username:username,
             password:password
         
            },    
           success: function(data) {
             if($.parseJSON(data).msg=="false"){
                 alert("系统异常！");
                return;
            }
            if($.parseJSON(data).result!=0){
             layer.close(index); 
             layer.msg('注册成功，请使用本账号登录！', {offset:['300px', '400px']});
            }
           }
         }); 
         },cancel: function(index){ //或者使用btn2
           layer.close(index); 
         }, 
         offset:['200px', '400px'],
         area: ['500px', '300px'],
        // shadeClose: true, //点击遮罩关闭
         content:'jsp/adduser.jsp'  
    });
} 
</script> 

</head>

<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎登录系统管理界面平台</span>    
  <ul>
   <!--  <li><a href="#">回首页</a></li>
    <li><a href="#">帮助</a></li> -->
    <li><a href="javascript:adduser()">注册</a></li>
    </ul>   
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    <form id="form1" action="user/login.do" method="post">
    <ul>
    <li><input name="username" type="text" class="loginuser" /></li>
    <li><input name="password" type="password" class="loginpwd" /></li>
    <li><input name="" type="submit" class="loginbtn" value="登录" />
    <label><input name="" type="checkbox" value="" checked="checked" />记住密码</label>
    <label><a href="#">忘记密码？</a></label></li>
    </ul>
    
    </form>
    </div>
    
    </div>
    
    
    
    <div class="loginbm">  </div>
	
    
</body>

</html>

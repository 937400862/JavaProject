<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax请求</title>
<script type="text/javascript">
	function getAjax(){
		var ajax;
		if(window.XMLHttpRequest){
			ajax=new XMLHttpRequest();
		}
	    ajax.onreadystatechange=function(){
			if(ajax.readyState==4){
				if(ajax.status==200){
					var result=ajax.responseText;
					alert(result);
					var showdiv=document.getElementById("showdiv");
					showdiv.innerHTML=result;
				}
			}
		}
		ajax.open("get","message");
		ajax.send(null);
	}
</script>
<style type="text/css">
		#showdiv{
			border: solid 2px;
			width:  200px;
			height: 100px
		}
</style>
</head>
<body>
<h3>欢迎来到相思湖学院</h3>
<input type="submit" name="button" value="测试" onclick="getAjax()"/>
<div id="showdiv"></div>
</body>
</html>
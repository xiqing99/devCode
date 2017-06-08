<%@ page contentType="text/html; charset=GBK" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>用户登陆</title>
	</head>
	<body>
		<center>
		<h3>请输入用户名和密码来登陆</h3>		
		<s:actionerror/>
		<s:form action="Login">
			<s:textfield name="userName" label="用户名"/>
			<s:textfield name="password" label="密码"/>
			<s:submit value="登陆"/>
		</s:form>
		</center>
	</body>
</html>
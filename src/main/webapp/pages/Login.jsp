<%@ page contentType="text/html; charset=GBK" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>�û���½</title>
	</head>
	<body>
		<center>
		<h3>�������û�������������½</h3>		
		<s:actionerror/>
		<s:form action="Login">
			<s:textfield name="userName" label="�û���"/>
			<s:textfield name="password" label="����"/>
			<s:submit value="��½"/>
		</s:form>
		</center>
	</body>
</html>
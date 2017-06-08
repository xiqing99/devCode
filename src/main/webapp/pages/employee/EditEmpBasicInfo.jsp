<%@ page contentType="text/html; charset=GBK" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <title>员工基本信息编辑</title>
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
	<tr>
	    <td>
		<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
		  <tr bgcolor="#e1e1e1" >
		    <td colspan="2"><div class="mytitle">您的基本信息</div></td> 
		  </tr>
		  <tr class="pt9" height="32">
			<td colspan="2">
			    <s:form action="updateEmployeeBasicInfo.action">
			        <s:textfield name="basicInfoVo.id" label="工号" readonly="true"/>     
			        <s:textfield name="basicInfoVo.name" label="姓名"/>
			        <s:textfield name="basicInfoVo.extNum" label="分机号"/>
			        <s:textfield name="basicInfoVo.mobileNum" label="手机"/>
			        <s:textfield name="basicInfoVo.email" label="电子邮件"/>
			        <s:textfield name="basicInfoVo.qq" label="QQ"/>
			        <s:select label="部门" 
			        headerKey="-1" headerValue="请选择部门"
			        list="deptNameList" name="basicInfoVo.deptName" value="defaultDeptName"></s:select> 
			        <s:submit value="提交"/>
			    </s:form>
			</td>
			</tr>
		</table>
	    </td>
	</tr>
</table>
</body>
</html>
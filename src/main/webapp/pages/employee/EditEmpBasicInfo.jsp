<%@ page contentType="text/html; charset=GBK" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <title>Ա��������Ϣ�༭</title>
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
	<tr>
	    <td>
		<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
		  <tr bgcolor="#e1e1e1" >
		    <td colspan="2"><div class="mytitle">���Ļ�����Ϣ</div></td> 
		  </tr>
		  <tr class="pt9" height="32">
			<td colspan="2">
			    <s:form action="updateEmployeeBasicInfo.action">
			        <s:textfield name="basicInfoVo.id" label="����" readonly="true"/>     
			        <s:textfield name="basicInfoVo.name" label="����"/>
			        <s:textfield name="basicInfoVo.extNum" label="�ֻ���"/>
			        <s:textfield name="basicInfoVo.mobileNum" label="�ֻ�"/>
			        <s:textfield name="basicInfoVo.email" label="�����ʼ�"/>
			        <s:textfield name="basicInfoVo.qq" label="QQ"/>
			        <s:select label="����" 
			        headerKey="-1" headerValue="��ѡ����"
			        list="deptNameList" name="basicInfoVo.deptName" value="defaultDeptName"></s:select> 
			        <s:submit value="�ύ"/>
			    </s:form>
			</td>
			</tr>
		</table>
	    </td>
	</tr>
</table>
</body>
</html>
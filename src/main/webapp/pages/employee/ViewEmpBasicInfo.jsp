<%@ page contentType="text/html; charset=GBK" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <title>员工基本信息查看</title>
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr bgcolor="#e1e1e1" >
    <td colspan="2"><div class="mytitle">您的基本信息</div></td> 
  </tr>
  <tr class="pt9" height="24">
    <td>工号</td>
    <td><s:property value="basicInfoVo.id"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>姓名</td>
    <td><s:property value="basicInfoVo.name"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>分机号</td>
    <td><s:property value="basicInfoVo.extNum"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>手机</td>
    <td><s:property value="basicInfoVo.mobileNum"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>电子邮件</td>
    <td bgcolor="#FFFFFF"><s:property value="basicInfoVo.email"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>QQ</td>
    <td><s:property value="basicInfoVo.qq"/></td>
  </tr>
  <tr class="pt9" height="24">
    <td>部门</td>
    <td><s:property value="basicInfoVo.deptName"/></td>
  </tr>
</table>
</td>
</tr>
</table>
</body>
</html>
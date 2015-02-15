<%@page import="java.util.UUID"%>
<%@page import="com.ycl.entity.User"%>
<%@page import="com.ycl.cache.UserCache"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户-view</title>
<style type="text/css">
td {
	padding-left: 20px;
}
</style>
<script type="text/javascript">

</script>
</head>
<body id="body">
	<table>
		<thead>
			<tr>
				<td>取值方式   </td>
				<td>id</td>
				<td>登陆名</td>
				<td>登陆密码</td>
			</tr>
			<tr>	
				<td>jstl标签</td>
				<td>${user.id }</td>
				<td>${user.loginname }</td>
				<td>${user.password }</td>
			</tr>
			<tr>	
				<td>jsp-request对象</td>
				<td><%=((User)request.getAttribute("user")).getId() %></td>
				<td><%=((User)request.getAttribute("user")).getLoginname() %></td>
				<td><%=((User)request.getAttribute("user")).getPassword() %></td>
			</tr>
		</thead>
		<tbody id="tbody">
		
		</tbody>
	</table>
</body>
</html>
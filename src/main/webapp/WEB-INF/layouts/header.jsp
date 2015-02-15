<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 
</%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div id="header">
	<div class="navbar navbar-inverse">
		<div class="navbar-inner">
			<ul class="nav">
				<a href="${ctx }" class="brand">Ycl's Demo</a>
				<li class="divider-vertical"></li>
				<li class="dropdown active">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">用户 <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="${ctx }/user/list">用户列表</a></li>
					</ul>
				</li>
				<li class="divider-vertical"></li>
				<li><a>boot</a></li>
				<li class="divider-vertical"></li>
			</ul>
			<form class="navbar-search pull-right">
				<input type="text" class="search-query" placeholder="搜索...">
				<i class=" icon-search" onclick="#"></i>
			</form>
		</div>
	</div>
	<div id="title">
		<!-- 
	    <h3><a href="${ctx}">首页</a>
	     
	    <shiro:user>
			<div class="btn-group pull-right">
				<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
					<i class="icon-user"></i> <shiro:principal property="name"/>
					<span class="caret"></span>
				</a>
			
				<ul class="dropdown-menu">
					<shiro:hasRole name="admin">
						<li><a href="${ctx}/admin/user">Admin Users</a></li>
						<li class="divider"></li>
					</shiro:hasRole>
					<li><a href="${ctx}/api">APIs</a></li>
					<li><a href="${ctx}/profile">Edit Profile</a></li>
					<li><a href="${ctx}/logout">Logout</a></li>
				</ul>
			</div>
		</shiro:user> 
		</h3>-->
	</div>
</div>
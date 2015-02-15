<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<title>Twitter Bootstrap Tutorial - A responsive layout tutorial</title>
<link href="${ctx}/static/css/bootstrap/2.3.2/css/bootstrap.min.css"
	rel="stylesheet" media="screen">

<style type='text/css'>
body {
	background-color: #CCC;
}
</style>
</head>
<body>
	<div class="container" style="background-color: white; height: 1500px; padding-top: 40px;">
	
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="contriner">
					<!-- .btn-navbar is used as the toggle for collapsed navbar content -->
					<a class="btn btn-navbar" data-toggle="collapse"
						data-target=".nav-collapse"> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
					</a> <a class="brand" href="#">Title</a>
					<div class="nav-collapse collapse">
						<ul class="nav">
							<!-- 分隔符 -->
							<li class="divider-vertical"></li>
							<li class="active"><a href="#">首页</a></li>
							<li class="divider-vertical"></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">用户<b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a tabindex="-1" href="#">Action</a></li>
									<li><a tabindex="-1" href="#">Another action</a></li>
									<li><a tabindex="-1" href="#">Something else here</a></li>
									<li class="divider"></li>
									<li><a tabindex="-1" href="#">Separated link</a></li>
								</ul></li>
							<li class="divider-vertical"></li>
							<li><a href="#">boot</a></li>

							<form class="navbar-search pull-left">
								<input type="text" class="search-query" placeholder="搜索">
								<i class="icon-search">a</i>
							</form>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div>
			<ul class="breadcrumb">
				<li><a href="#">首页</a> <span class="divider">/</span></li>
				<li><a href="#">Library</a> <span class="divider">/</span></li>
				<li class="active">Data</li>
			</ul>
		</div>
		<!-- 缩略图 start-->
		<div >
			<ul class="thumbnails">
				<li class="span4">
					<a class="thumbnails" href=""><img alt="缩略图" src="${ctx }/static/images/360x270.png"></a>
				</li>
				<li class="span3">
					<a class="thumbnails" href=""><img alt="缩略图" src="${ctx }/static/images/260x120.png"></a>
				</li>
				<li class="span2">
					<a class="thumbnails" href=""><img alt="缩略图" src="${ctx }/static/images/160x120.png"></a>
				</li>
				<li class="span3">
					<a class="thumbnails" href=""><img alt="缩略图" src="${ctx }/static/images/260x120.png"></a>
				</li>
				<li class="span2">
					<a class="thumbnails" href=""><img alt="缩略图" src="${ctx }/static/images/160x120.png"></a>
				</li>
			</ul>
		</div>
		<!-- 缩略图 end-->
		
		<!-- 警告框start -->
		<div class="alert">
		    <button type="button" class="close" data-dismiss="alert">&times;</button>
		    <strong>Warning!</strong> Best check yo self, you're not looking too good.
		</div>
		<!-- 警告框end -->
		
		<!-- 进度条start -->
		<div class="progress">
			<div class="bar" style="width: 10%;"></div>
		</div>
		<div class="progress">
			<div class="bar bar-success" style="width: 35%;"></div>
			<div class="bar bar-warning" style="width: 20%;"></div>
			<div class="bar bar-danger" style="width: 10%;"></div>
		</div>
		<!-- 进度条end -->
				
		<!-- 分页 start-->
		<div class="pagination pagination-large pagination-right">
			<ul>
				<li><span>&laquo;</span></li>
				<!-- span标签 ，去除了点击功能，还能保存原有样式 -->
				<li class="disable"><a href="#">1</a></li>
				<li class="active"><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">>></a></li>
			</ul>
		</div>

		<div>
			<ul class="pager">
				<li><a href="#">上一页</a></li>
				<li><a href="#">下一页</a></li>
			</ul>
			<ul class="pager">
				<li class="previous"><a href="#">&larr; Older</a></li>
				<li class="next"><a href="#">Newer &rarr;</a></li>
			</ul>
		</div>
		<!-- 分页end -->


		<!--  -->
		<div>
			<span class="label">默认样式</span> 
			<span class="label label-success">成功</span>
			<span class="label label-warning">警告</span> 
			<span class="label label-important">重要</span> 
			<span class="label label-info">信息 </span> 
			<span class="label label-inverse">反色</span>
			
			<span class="badge">1</span>
			<span class="badge badge-success">2</span>
			<span class="badge badge-warning">4</span>
			<span class="badge badge-important">6</span>
			<span class="badge badge-info">8</span>
			<span class="badge badge-inverse">10</span>
			<span class="badge badge-inverse"></span>		<!-- 如果没有值的话，前台不显示 -->
			<span class="badge badge-inverse">12</span>
		</div>
		
		
		
	</div>






	<script type="text/javascript"
		src="${ctx}/static/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript"
		src="${ctx}/static/css/bootstrap/2.3.2/js/bootstrap.min.js"></script>
</body>
</html>

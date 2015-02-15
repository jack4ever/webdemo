<%@page import="java.util.UUID"%>
<%@page import="com.ycl.entity.User"%>
<%@page import="com.ycl.cache.UserCache"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户-列表</title>
<script type="text/javascript">
$(function(){
	ajax_post('getUserlist','',function(result){
		if(result!=null && result.length>0){
			var addhtml = '';
			for(var i=0;i<result.length;i++){
				addhtml +='<tr><td><a href="'+result[i].id+'?random=abc">'+result[i].id+'</a></td><td>'+result[i].loginname+'</td>'+
				'<td>'+result[i].password+
				'</td><td><a href="'+result[i].id+'?random=abc" class="btn btn-mini" target="_black">查看</a><a href="#" class="btn btn-mini">编辑</a><a href="#" class="btn btn-mini">删除</a></td></tr>';
			}
			$('#databody').html(addhtml);
		}
		
	});
});

function ajax_post(url,param,callback){
	$.ajax({
		url:url,
		method:'post',
		error:function(a,b,c){alert(a)},
		success:callback
	});
}

function randomAdd(){
	ajax_post('randomAdd');
}

	

</script>
</head>
<body>
	<form class="form-horizontal">
		<table class="table table-bordered">
			<tr>
				<td>
					<div class="span4">
						<label class="span1">id</label>
						<input type="text" class="input">
					</div>
					<div class="span4">
						<label class="span1">姓名</label>
						<input type="text" class="input">
					</div>
					<div class="span2">
						<input type="submit" class="btn btn-small" value="搜索">
					</div>
				</td>
			</tr>
		</table>
    	
    	
    </form>
	<table class="table table-bordered table-striped table-hover">
    	<thead>
    		<tr>
    			<td class="span5">id</td>
    			<td class="span2">用户名</td>
    			<td class="span2">用户密码</td>
    			<td class="span3">操作</td>
    		</tr>
    	</thead>
    	<tbody id="databody"></tbody>
    	
    </table>
	<div class="pagination pagination-right">
		<ul>
			<li><a href="#">Prev</a></li>
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
			<li><a href="#">Next</a></li>
		</ul>
	</div>
</body>
</html>
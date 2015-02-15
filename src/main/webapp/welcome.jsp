<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>webdemo</title>
</head>
<body>
	<div id="myCarousel" class="carousel slide">
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<!-- Carousel items -->
		<div class="carousel-inner">
			<div class="active item">
				<img src="static/images/ycl.jpg" class="img-polaroid" width="100%;">
				<div class="carousel-caption">
					<h4>First Thumbnail label</h4>
					<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
				</div>
			</div>
			<div class="item">
				<img src="static/images/ycl.jpg" class="img-polaroid" width="100%;">
			</div>
			<div class="item">
				<img src="static/images/ycl.jpg" class="img-polaroid" width="100%;">
			</div>
		</div>
		<!-- Carousel nav -->
		<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
		<a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
	</div>
	
</body>
</html>
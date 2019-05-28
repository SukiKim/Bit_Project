<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Heroic Features - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<!-- <link href="/css/bootstrap.min.css" rel="stylesheet"> -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- Custom styles for this template -->
<link href="css/heroic-features.css" rel="stylesheet">

</head>

<body>

	<jsp:include page="/WEB-INF/views/navigation.jsp" />

	<!-- Page Content -->
	<div class="container">

		<!-- Jumbotron Header -->
		<header class="jumbotron my-4">
			<h1 class="display-3">${postVo.title }</h1>
			<p class="lead">${postVo.postContent }</p>
		</header>













		<!-- Page Features -->
		<div class="row text-center">

			<div class="col-lg-3 col-md-6 mb-4">
				<div class="card h-100">
					<img class="card-img-top" src="images/musicIcon.png" alt="">
					<div class="card-body">
						<h4 class="card-title">제목 : ${songVo1.title }</h4>
						<p class="card-text">가수 : ${songVo1.singer }</p>
						<p class="card-text">장르 : ${songVo1.genre }</p>
					</div>
					<div class="card-footer">
						<a
							href="https://www.youtube.com/results?search_query=${postVo.songId1 }"
							class="btn btn-primary">유튜브로 듣기</a>
					</div>
				</div>
			</div>



		<div class="col-lg-3 col-md-6 mb-4">
			<div class="card h-100">
				<img class="card-img-top" src="images/musicIcon.png" alt="">
				<div class="card-body">
					<h4 class="card-title">제목 : ${songVo2.title }</h4>
					<p class="card-text">가수 : ${songVo2.singer }</p>
					<p class="card-text">장르 : ${songVo2.genre }</p>
				</div>
				<div class="card-footer">
					<a
						href="https://www.youtube.com/results?search_query=${postVo.songId1 }"
						class="btn btn-primary">유튜브로 듣기</a>
				</div>
			</div>
		</div>




		<div class="col-lg-3 col-md-6 mb-4">
			<div class="card h-100">
				<img class="card-img-top" src="images/musicIcon.png" alt="">
				<div class="card-body">
					<h4 class="card-title">제목 : ${songVo3.title }</h4>
					<p class="card-text">가수 : ${songVo3.singer }</p>
					<p class="card-text">장르 : ${songVo3.genre }</p>
				</div>
				<div class="card-footer">
					<a
						href="https://www.youtube.com/results?search_query=${postVo.songId1 }"
						class="btn btn-primary">유튜브로 듣기</a>
				</div>
			</div>
		</div>
	</div>
	<!-- /.row -->

	</div>
	<!-- /.container -->

	<jsp:include page="/WEB-INF/views/footer.jsp" />

	<!-- Bootstrap core JavaScript -->
	<script src="jquery/jquery.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>

</body>

</html>

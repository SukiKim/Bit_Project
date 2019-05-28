<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
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


	<div class="fresh-table full-color-orange full-screen-table">
		<!--    Available colors for the full background: full-color-blue, full-color-azure, full-color-green, full-color-red, full-color-orange
            Available colors only for the toolbar: toolbar-color-blue, toolbar-color-azure, toolbar-color-green, toolbar-color-red, toolbar-color-orange
    -->
		<table id="fresh-table" class="table">
			<thead>
				<th data-field="id">말머리</th>
				<th data-field="name" data-sortable="true">제목</th>
				<th data-field="salary" data-sortable="true">작성자</th>
				<th data-field="country" data-sortable="true">날짜</th>
				<!-- 
				<th data-field="actions" data-formatter="operateFormatter"
					data-events="operateEvents">Actions</th>
				TODO: 글삭제
				 -->
				 

			</thead>

			<tbody>
				<!-- TODO: 테이블 셀 개수 지정 -->
			
				<c:forEach items="${postVoList }" var="vo">
					<tr onclick="document.location = '${pageContext.servletContext.contextPath }/view?postNo=${vo.postNo}';" style="cursor:pointer">

						<td> ${vo.postNo } </td>
						<td> ${vo.title } </td>
						<td> ${vo.userId } </td>
						<td> ${vo.regDate } </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<jsp:include page="/WEB-INF/views/footer.jsp" />

	<!-- Bootstrap core JavaScript -->
	<script src="jquery/jquery.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>

</body>

</html>

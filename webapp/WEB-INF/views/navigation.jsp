<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Bamboo write</title>
</head>
<body>
<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Bamboo</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="${pageContext.servletContext.contextPath }/list">list
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.servletContext.contextPath }/write">write</a>
          </li>
          <!-- 
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.servletContext.contextPath }/view?postNo=${postVo.postNo }">view</a>
          </li>
          
           -->
          <li class="nav-item">
            <a class="nav-link" href="#">login/logout</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</body>
</html>

<!-- 
TODO: 
현재 클릭된 화면 흰색글씨 표현하기


 -->
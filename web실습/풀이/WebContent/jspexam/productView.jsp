<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.vo.productVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<style>
   a {
      text-decoration: none;
      background: linear-gradient(to right, orange, pink, yellow); 
   }
</style>
</head>
<body>

<%
   productVO vo = (productVO)session.getAttribute("productVO");

%>
   <h1>선택된 정보는 다음과 같습니다.</h1>
   <hr>
   <p>선택된 사과의 개수 : <%= vo.getApple() %></p>
   <p>선택된 바나나의 개수 : <%= vo.getBanana()%></p>
   <p>선택된 한라봉의 개수 : <%= vo.getHalabong()%></p>


</body>
</html>
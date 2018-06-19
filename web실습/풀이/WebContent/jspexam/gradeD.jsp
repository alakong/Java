<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<h2><%=request.getParameter("name") %>님은 D등급입니다.꾸준히 하세요</h2>
<a href="/mvc/htmlexam/Form.html">성적 입력화면으로</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<h2><%=request.getParameter("name") %>님은 B등급입니다.양호한 성적이네요</h2>
<a href="/mvc/htmlexam/eduForm.html">성적 입력화면으로</a>
</body>
</html>
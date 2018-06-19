<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<style>
span{
	color : orange;
}
</style>
</head>
<body>
<h2>연산결과:<span><%=request.getAttribute("result") %></span></h2><br>
<a href="/mvc/htmlexam/calcForm.html"> 입력화면</a>
</body>
</html>
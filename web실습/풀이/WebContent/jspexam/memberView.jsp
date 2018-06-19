<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<ul>
<%
	MemberVO vo=(MemberVO)request.getAttribute("member1");
%>
<li>회원이름 : <%=vo.getName() %></li>
<li>회원계정 : <%=vo.getPhonenumber() %></li>
<li>회원암호 : <%=vo.getMember() %></li>
<li>회원전화번호 : <%=vo.getPassword() %></li>
</ul>
</body>
</html>
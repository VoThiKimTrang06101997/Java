<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${username}"/> <br>
	<c:if test="${fn:toLowerCase(username) == 'cybersoft' && password == '123'}">
		<h1>Hello ${username}</h1>
	</c:if>

	<c:choose>
		<c:when test="${fn:toLowerCase(username) == 'cybersoft' && password == '123'}">
			<h1>Hello ${username}</h1>
		</c:when>
		
		<c:otherwise>
			<h1>Tài khoản không hợp lệ</h1>
		</c:otherwise>
	
	</c:choose>
	Welcome 2
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<%! int count = 0; 
		int i = 0;
	%>
	<% int count = 10; %>
	Welcome: <%= request.getAttribute("message")%> <br/>
	Expression: ${message} <br/>
	Count: ( <%= count++ %> )
	
	<%
		for(int i=0; i<10; i++) {
	%>
		<h5><%= i %></h5>
		
	<% } %>
	
	<%
		if(1 == 2) { 
			out.print("False");
		%>
	<% } %>
	
</body>
</html>
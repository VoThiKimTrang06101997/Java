<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bài tập</title>
</head>
<body>
	<form action="" method="post">
		<input name="tenphim"/> <br/>
		<input name="daodien"/> <br/>
		<input name="quocgia"/> <br/>
		<button>SUBMIT</button>
	</form>
	
	<h1>Danh sách Phim</h1>
	<table>
		<thead>
			<tr>
				<th>#</th>
				<th>Tên phim</th>
				<th>Đạo diễn</th>
				<th>Quốc gia</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="phim" items="${phims}">
				<tr>
					<td>${phim.getId()}</td> 
					<td>${phim.getTenPhim()}</td> 
					<td>${phim.getDaoDien()}</td> 
					<td>${phim.getTenQuocGia()}</td> 
					<td><a href="http://localhost:8080/DemoJDBC/delete?id=${phim.getId()}">Delete</a></td> <br/>	
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
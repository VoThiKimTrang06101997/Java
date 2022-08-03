<%@page import="demo_bootstrap.pojo.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách Sản phẩm</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<h1>QUẢN LÝ SẢN PHẨM</h1>

	<form action="" method="post">
		<div class="form-group">
			<label for="tensp">Tên sản phẩm</label> 
			<input name="tensp" id="tensp" class="form-control"> 	
		</div>
		
		<div class="form-group">
			<label for=soluong>Số lượng</label> 
			<input name="soluong" id="soluong" class="form-control"> 	
		</div>
		
		<div class="form-group">
			<label for="giaban">Giá sản phẩm</label> 
			<input name="giaban" id="giaban" class="form-control"> 	
		</div>
		
		<button type="submit" class="btn btn-primary">Lưu lại</button>
	</form>
	
	<table class="table">
		<thead>
			<tr>
				<th>Tên sản phẩm</th>
				<th>Số lượng</th>
				<th>Giá</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="itemProduct1" items="${products1}">
				<tr>
					<td>${itemProduct1.getName()}</td>
					<td>${itemProduct1.getSoLuong()}</td>
					<td>${itemProduct1.getGia()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous">
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<table>
	<tr>
		<th>NUM</th>
		<th>TODO</th>
		<th>STATUS</th>
		<th>DATE</th>
	</tr>
	<c:forEach var="todo" items="${todo }">
		<tr>
			<td>${todo.num }</td>
			<td>${todo.todo }</td>
			<td>${todo.status }</td>
			<td>${todo.updateDate }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>입력한 정보 내역입니다 :</p>
	<table border="1">
		<tr>
			<td>First name</td>
			<td><%=request.getParameter("firstName")%></td>
		</tr>
		<tr>
			<td>Last name</td>
			<td><%=request.getParameter("lastName")%></td>
		</tr>
		<tr>
			<td>Email address</td>
			<td><%=request.getParameter("email")%></td>
		<tr>
	</table>
	<p>추가로 메일을 등록하려면 아래 Return 버튼을 클릭하세요.</p>
	<button onclick="location.href='join_email_list.html'">Return</button>
</body>
</html>
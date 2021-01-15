<%@ page import="kr.co.java.DAO.MemberDAO, kr.co.java.DTO.MemberDTO"
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	boolean resultFlag = (Boolean) request.getAttribute("resultFlag");
	if (resultFlag) {
	%>

	<p>입력한 정보 내역입니다 :</p>
	<table border="1">
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("name")%></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%=request.getParameter("id")%></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=request.getParameter("password")%></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><%=request.getParameter("email")%></td>
		<tr>
	</table>
	<%
		} else {
	%>
	<h1>DB 저장 실패!!!</h1>
	<%
		}
	%>
	<p>추가로 회원을 등록하려면 아래 Return 버튼을 클릭하세요.</p>
	<button onclick="location.href='memberJoinForm.html'">Return</button>

</body>
</html>
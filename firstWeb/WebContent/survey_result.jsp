<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String phoneNum = request.getParameter("phoneNum");
	String email = request.getParameter("email");
	String contactVia = request.getParameter("contactVia");
	String[] sports = request.getParameterValues("sports");
	String contact = request.getParameter("contact");
	String info = request.getParameter("info");
%>

<p>이름 : <%=name %></p>
<p>전화번호 : <%=phoneNum %></p>
<p>이메일 : <%=email %></p>
<p>알게 된 경로 : <%=contactVia %></p>
<p>좋아하는 스포츠 : 
	<%
		if(sports!=null){
			for(int i=0; i<sports.length; i++){
				out.print(sports[i] + " ");
			}
		}else{
			out.print("없음");
		}
	%>
</p>

<p>연락방법 : <%=contact %></p>
<p>개인정보 활용에 동의합니까?
	<%
	if(info!=null)
		out.print("-> 동의합니다.");
	else
		out.print("-> 동의하지 않습니다.");
	
	%>
</p>
</body>
</html>
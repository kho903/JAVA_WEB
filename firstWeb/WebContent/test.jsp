<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	/* 자바 주석 */
	String test = null;
	Enumeration<String> names = request.getParameterNames();

	while(names.hasMoreElements()){
		String name = names.nextElement();
		out.print(name + ": "+ request.getParameter(name) + "<br>");
	}
%>
<%-- jsp 주석 --%>
<!-- <div>안녕</div>  html 주석-->
</body>
</html>
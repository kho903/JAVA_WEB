<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 쿠키저장
	String cookieName = request.getParameter("cookieName");
	String cookieValue = request.getParameter("cookieValue");
	
	// 쿠키 생성
	Cookie cookie = new Cookie(cookieName, cookieValue);
	cookie.setPath("/");
	cookie.setMaxAge(-1); // 쿠키 유지 시간 : -1 일때 : 브라우저가 유지되는 동안
	
	// 쿠키를 응답결과에 포함시킨다.
	response.addCookie(cookie);
	
	response.sendRedirect("cookieView.jsp");
%>
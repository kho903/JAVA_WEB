package kr.co.java.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 쿠키를 이용한 로그아웃
		/*
		 * Cookie cookie = new Cookie("loginOk", ""); cookie.setPath("/");
		 * cookie.setMaxAge(0); response.addCookie(cookie);
		 */
		
		// 세션을 이용한 로그아웃
		HttpSession session = request.getSession();
		session.removeAttribute("loginOk");
		response.sendRedirect("memberList");
	}

}

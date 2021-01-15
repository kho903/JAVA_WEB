package kr.co.java;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener implements ServletContextListener {

	public TestListener() {
		System.out.println("TestListner 생성자 실행");
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("TestListner contextDestroyed 실행");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("TestListner contextInitialized 실행");
	}

}

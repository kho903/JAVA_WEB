package kr.co.multi.IOCExam.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.multi.IOCExam.tv.TV;

public class TVUser {
	public static void main(String[] args) {
		System.out.println("ApplicationContext 생성전!!");
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		TV tv = factory.getBean("j", TV.class);
		System.out.println("ApplicationContext 생성후!!");
		
		tv.turnOn();
		tv.volumUp();
		tv.volumDown();
		tv.turnOff();
	}
}

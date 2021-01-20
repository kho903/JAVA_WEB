package ioc.exam.tv;

public class TVUser {
	public static void main(String[] args) {
//        STV tv = new STV();
//        tv.TurnOn();
//        tv.volumeUp();
//        tv.volumeDown();
//        tv.TurnOff();

//    	STV2 tv = new STV2();
//    	tv.powerOn();
//    	tv.volumeUp();
//    	tv.volumeDown();
//      	tv.powerOff();
		// 인터페이스가 필요한 이유
//		TV tv = new /*GoTV();*/ TVClass_inter();
		// 팩토리 메소드
		TV tv = TVFactory.getTV(args[0]);
		tv.turnOn();
		tv.volumUp();
		tv.volumDown();
		tv.turnOff();
	}
}

package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		
		SmartTelevision tv=new SmartTelevision();
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("------------------------");
		
		//Remote 클래스에 정의 되어있는 메소드를 오버라이딩된 메소드 대입
		Remote rc=tv;//자식클래스의 객체가 부모 클래스의 객체로 묵시적인 형변환
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		//rc.search("www.naver.com");
		System.out.println("------------------------");
		
		Searchable sc=tv;
		/*
		sc.turnOn();
		sc.turnOff();
		sc.setVolume(11);
		*/
		sc.search("www.soldesk.com");
		

	}

}

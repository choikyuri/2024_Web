package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		
		SmartTelevision tv=new SmartTelevision();
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("------------------------");
		
		//Remote Ŭ������ ���� �Ǿ��ִ� �޼ҵ带 �������̵��� �޼ҵ� ����
		Remote rc=tv;//�ڽ�Ŭ������ ��ü�� �θ� Ŭ������ ��ü�� �������� ����ȯ
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

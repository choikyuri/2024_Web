package chapter11;

//추상 클래스 : 하나 이상의 추상메소드가 존재
//단 하나라도 추상 메소드가 존재하면 반드시 abstract 키워드 추가
public abstract class Computer {
	
	//추상 메소드 바디{} 즉 수행문이 없는 메소드
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}

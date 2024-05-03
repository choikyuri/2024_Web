package chapter09;

public class SportCar extends Car{
	

	@Override
	public void speedUp() {	
		speed += 10;
		System.out.println("speed: "+speed);
	}

	//@Override가 불가능한 메소드
	/*
	public void stop() {
		System.out.println("스포츠카가 멈춥니다.");
		speed=0;
	}*/
	
    //메인 메소드
	public static void main(String[] args) {
		SportCar ac=new SportCar();
		ac.speedUp();
		ac.stop();

	}

}








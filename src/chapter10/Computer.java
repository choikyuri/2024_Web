package chapter10;



public class Computer extends Calculator{

	//double PI=3.14 를 사용하여 원의 넓이를 구하는 areaCircle의 Override 구현
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 메소드 areaCircle() 실행");
		//double PI=3.14;
		return  Math.PI*r*r;
	}
	
	
	

}

package chapter11;

public class CarMain {
    /*
	public static void main(String[] args) {
		//Car car=new ManualCar();
		method(new ManualCar());
		System.out.println("======================");
		method(new AICar());

	}
	
	public static void method(Car car) {
		car.drive();
		car.stop();
	}
	*/
	
	public static void main(String[] args) {
		System.out.println("---------��������----------");
		Car mycar=new AICar();
		mycar.run();
		
		System.out.println("---------����� �����ϴ� �ڵ���----------");
		Car mycar2=new ManualCar();
		mycar2.run();
		
	}

}










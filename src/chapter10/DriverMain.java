package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		/*
		//����
		Bus bus=new Bus();
		bus.run();
		
		//�ý�
		Taxi texi=new Taxi();
		texi.run();
		*/
		
		Driver driver=new Driver();
		driver.drive(new Bus());
		
		Taxi taxi=new Taxi();
		driver.drive(taxi);

	}

}

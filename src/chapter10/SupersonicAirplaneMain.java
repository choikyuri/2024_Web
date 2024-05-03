package chapter10;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC; //flyMode=2;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL; //flyMode=1;
		sa.fly();
		sa.land();
		
	}

}

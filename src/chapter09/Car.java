package chapter09;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed+=1;
		System.out.println(speed);
	}
	
	public final void stop() {
		System.out.println("ÀÚµ¿Â÷°¡ ¸ØÃä´Ï´Ù.");
		speed=0;
	}

}

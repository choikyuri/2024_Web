package chapter11;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		//#1
		run();
		
		//#2
		for(int i=0;i<count;i++) {
			jump();
		}
		
		//#3
		turn();
	}

}

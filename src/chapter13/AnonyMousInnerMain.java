package chapter13;

class Outter2{
	//방법1 : 익명의 클래스는 클래스 이름이 없다
	Runnable getRunnable(int i) {
		int num=100;
		return new Runnable() {
			@Override
			public void run() {
				//num=200;
				//i=10;
				System.out.println(i);
				System.out.println(num);
			}
		}; //return
	}//Runnable
	
	//방법2
	Runnable runner=new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명의 클래스 변수");
		
		}
	};
	
}

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		Outter2 out=new Outter2();
		Runnable runnable= out.getRunnable(10);
		runnable.run();//방법1
		out.runner.run();//방법2
		
	}

}

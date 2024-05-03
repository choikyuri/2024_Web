package chapter13;


class Outter{
	
	int outNum=100;
	static int sNum=200;
	
	//Runnable 매개변수와 멤버변수는 final로 정의함
	//Runnable는 Data영역에 들어가며 익명의 클래스라고 한다.
	Runnable getRunnable(int i) {
		
		int num=100; //final->상수
		
		class MyRunnable implements Runnable{
            
			int localNum=10; //내부 멤버
			
			@Override
			public void run() {
				//num=200;//final
				//i=100;//final
				System.out.println("i=:"+i); //읽기만 가능
				System.out.println("int num"+num);//읽기만 가능
				System.out.println("int outNum"+outNum);
				System.out.println("int localNum"+localNum);
				System.out.println("static int sNum"+sNum);
			}
			
		}
		
		return new MyRunnable();		
	}//Runnable
	
}//Out Class

public class LocalInner {

	public static void main(String[] args) {
		Outter out=new Outter();
		Runnable runner=out.getRunnable(10);
		runner.run();

	}

}

package chapter13;


class Outter{
	
	int outNum=100;
	static int sNum=200;
	
	//Runnable �Ű������� ��������� final�� ������
	//Runnable�� Data������ ���� �͸��� Ŭ������� �Ѵ�.
	Runnable getRunnable(int i) {
		
		int num=100; //final->���
		
		class MyRunnable implements Runnable{
            
			int localNum=10; //���� ���
			
			@Override
			public void run() {
				//num=200;//final
				//i=100;//final
				System.out.println("i=:"+i); //�б⸸ ����
				System.out.println("int num"+num);//�б⸸ ����
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

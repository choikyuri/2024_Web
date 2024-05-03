package chapter21;

public class Thread_Inter_Main implements Runnable{

	public static void main(String[] args) {

		/*
		 ���� Ŭ���� ����!
		 run()
		 first()
		 second()
		 */
		
		System.out.println("���� Ŭ���� ����!");
		Thread_Inter_Main t1=new Thread_Inter_Main();
		t1.run(); //������ ������ Runnable�� �޼ҵ�
		System.out.println("=============================");
		/*
		 run()
		 first()
		 second()
		 ���� Ŭ���� ����!
		 
		 **������ ��������**
		 ���� Ŭ���� ����!
		 run()
		 first()
		 second()
		 */
		Thread mThread=new Thread(t1);
		mThread.start();
		System.out.println("���� Ŭ���� ����!");
		
	}

	@Override
	public void run() {
		System.out.println("run() �޼ҵ� ����");
		first();
	}
	
	public void first() {
		System.out.println("first() �޼ҵ� ����");
		second();
	}
	
	public void second() {
		System.out.println("second() �޼ҵ� ����");
	}

}







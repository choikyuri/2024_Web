package chapter21;

public class ThreadEx01Main {

	public static void main(String[] args) {
		
		ThreadEx01 t=new ThreadEx01();
		t.start(); //run() �޼ҵ� ȣ��Ǵ� �Ͱ� ����
		//t.run(); //�������� ������ ������ �������� ���� ����
		System.out.println("main ����");
	}

}

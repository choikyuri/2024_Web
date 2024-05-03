package chapter12.Interface;

public interface Calc {
	
	double PI=3.14; //final static
	int ERROR=-9999999; //final static
	
	//�߻�޼ҵ�
	int add(int num1, int num2);
	int substaract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//�ڹ� 8���� ����
	//default method: �⺻ ���๮�� ������ �޼ҵ�� ������ �Ҽ� ����
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod(); //private method ȣ��
	}
	
	//static method(�����޼ҵ�): ��ü ������ ������� �������̽�Ÿ��(Ŭ������)���� ����� �� ����
	static int total(int[] arr) {
		int total=0;
		
		for(int i : arr) {
			total +=i;
		}
		myStaticMethod(); //private method ȣ��
		return total;
	}
	//private method: �������̽� Ŭ���� �������� ����� ����.
	private void myMethod() {
		System.out.println("private �޼ҵ� �Դϴ�.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static �޼ҵ� �Դϴ�.");
	}
	
	
	
    
}

package chapter11;

//�߻� Ŭ���� : �ϳ� �̻��� �߻�޼ҵ尡 ����
//�� �ϳ��� �߻� �޼ҵ尡 �����ϸ� �ݵ�� abstract Ű���� �߰�
public abstract class Computer {
	
	//�߻� �޼ҵ� �ٵ�{} �� ���๮�� ���� �޼ҵ�
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}

package chapter10;

public class Bus extends Vehicle{
	
	private int busNum=510;

	//�������̵� run (510�� ������ �޸��ϴ�.)
	@Override
	public void run() {
		System.out.println(busNum+ "�� ������ �޸��ϴ�.");
	}
	
    
}

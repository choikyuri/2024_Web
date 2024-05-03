package chapter08;

public class Company {
	
	//��ü�� �� �ϳ��� �����ϴ� Ŭ����
	private static Company instance=new Company();
	
	//������(heap)
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	//singleton ��ü ���� �޼ҵ�
	public static Company  getInstance() {
		//����ó��->������ ��ü�� ������ ��ü����
		if(instance == null) {
			instance=new Company();
		}
		
		return instance;
		
	}
}
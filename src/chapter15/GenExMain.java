package chapter15;

public class GenExMain {

	public static void main(String[] args) {
		// ����ڰ� ���ϴ� ���·� ��ü ����
		GenEx<String> v1=new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//���׸� Ÿ���� �⺻�ڷ���(int, double, char)�� �ν��� �� ����
		//�׷��Ƿ� �ݵ�� ����ڽ̵� �ڷ�Ÿ�� ����
		GenEx<Integer> v2=new GenEx<Integer>();
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		//Double
		GenEx<Double> v3=new GenEx<Double>();
		v3.setValue(3.14);
		System.out.println(v3.getValue());
		
		//Character
		GenEx<Character> v4=new GenEx<Character>();
		v4.setValue('A');
		System.out.println(v4.getValue());

	}

}
package chapter14.wrapper;

public class IntegerTest {
	
	public static void main(String[] args) {
		
		//int i=100; //�Ϲ��ڷ���
		//Integer i=new Integer(100);//Ŭ������ ����
		
		Integer num=200; //����ڽ�: �Ϲ��ڷḦ Ŭ������ ������ �ʱⰪ���� ���
		int iNum=num.intValue();//��ڽ�: Ŭ������ �ڷᰡ �Ϲ��� Ÿ���� �����濡 ����
		
		int jNum=200;
		
		int sum=iNum+jNum;
		System.out.println(sum);
		
		//��ڽ�
		int total=num+jNum; //num.intValue+jNum
		System.out.println(total);
		
		//����ڽ�(int => Integer)
		Integer i=jNum; 
		System.out.println(i);
		
		
	}

}




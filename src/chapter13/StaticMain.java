package chapter13;

import javax.swing.JOptionPane;

class Out2{
	
	//��� ����
	static int a=1; //���������� Ŭ�������� �ϳ��� �����ϸ� ��� ��ü�� �����Ҽ� ����
	int b; //��ü���� ���� �ٸ� ���� ���� �� ����
	
	public static class In{
		String Infun() {
			return (a+"��° static ���� Ŭ����");
		}
	}
	
}


public class StaticMain {

	public static void main(String[] args) {
		// static�� Ŭ���������� ���� ������ ����
		Out2.In obj1=new Out2.In();
		//���ο� �ִ� �޼ҵ�
		String str=obj1.Infun();
		
		JOptionPane.showMessageDialog(null, str+"\n Success");

	}

}

package chapter08;


public class StaticFunction {
       
	String str1="�Ϲ� ȸ������";
	static String str2="Static ȸ������";
	
	public static String getStatic() {
		
		//static �޼ҵ�� static������ ����� �����ϴ�
		//str1="MEMBER";
		
		str2="VIP";
		
		return str2;
	}
	
	
}
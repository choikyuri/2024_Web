package chapter18.lambda;

public class StringConCatMain {

	public static void main(String[] args) {
	
		String s1="Hello";
		String s2="World";
		
		//�ν��Ͻ� �޼ҵ� ȣ�� ���
		System.out.println("----�ν��Ͻ� ���----");
		StringConCatImple st=new StringConCatImple();
		st.makeString(s1, s2);
		
		//���ٽ� ȣ��
		System.out.println("----���ٽ� ȣ��----");
		StringConcat concat=(s,v)->System.out.println(s+" "+v);
		concat.makeString("Hello", "World");
		
		//�͸��� ���� Ŭ���� ȣ��
		System.out.println("----�͸��� ���� Ŭ����----");
		StringConcat concat2=new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+" "+s2);
				
			}
		};
		
		concat2.makeString(s1, s2);

	}

}

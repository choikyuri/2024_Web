package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		
		//X,Y,MyInterfaceŸ���� ��ü
		
		
		MyClass mClass=new MyClass();
		
		X xClass=mClass; //X Ŭ���� Ÿ���� ��ü ����
		xClass.x();
		System.out.println("----------------");
		
		Y yClass=mClass; //Y Ŭ���� Ÿ���� ��ü ����
		yClass.y();
		System.out.println("----------------");
		
		MyInterface iClass=mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();

	}

}

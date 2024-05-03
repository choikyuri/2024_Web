package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		
		//X,Y,MyInterface타입의 객체
		
		
		MyClass mClass=new MyClass();
		
		X xClass=mClass; //X 클래스 타입의 객체 생성
		xClass.x();
		System.out.println("----------------");
		
		Y yClass=mClass; //Y 클래스 타입의 객체 생성
		yClass.y();
		System.out.println("----------------");
		
		MyInterface iClass=mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();

	}

}

package chapter09;

public class Child extends Parent{
	

	@Override
	public void method2() {
		System.out.println("Parent_Child-method2()");
	}

	public void method3() {
		System.out.println("Child-method3()");
	}
}
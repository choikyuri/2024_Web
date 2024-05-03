package chapter12.Interface;

public class InterMain {

	public static void main(String[] args) {
		
		InterTest1 inter = new InterTest2();
		System.out.println("getA(): "+inter.getA());
		System.out.println();
		
		InterTest2 it=new InterTest2();
		System.out.println("getA(): "+it.A);

	}

}

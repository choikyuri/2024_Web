package chapter14.string;

import java.util.Date;

public class toStringMain {

	public static void main(String[] args) {
		
		Object obj1=new Object();
		//�����ǰ� �ȵǾ� �ִ� �⺻ toString
		System.out.println("---�����ǰ� �ȵǾ� �ִ� �⺻ toString---");
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println("---�����ǰ� �Ǿ� �ִ� toString---");
		Date obj2=new Date();
		System.out.println(obj2);

	}

}

package chapter14.string;

import java.util.Date;

public class toStringMain {

	public static void main(String[] args) {
		
		Object obj1=new Object();
		//재정의가 안되어 있는 기본 toString
		System.out.println("---재정의가 안되어 있는 기본 toString---");
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println("---재정의가 되어 있는 toString---");
		Date obj2=new Date();
		System.out.println(obj2);

	}

}

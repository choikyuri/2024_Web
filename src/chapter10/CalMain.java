package chapter10;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("A. 정수를 입력하세요: ");
		int a=scan.nextInt();
		System.out.print("B. 정수를 입력하세요: ");
		int b=scan.nextInt();
		/*
		CalPlus plus=new CalPlus();
		int p=plus.getResult(a, b);
		System.out.println("CalPlus: "+p);
		
		CalMinus m=new CalMinus();
		int m=m.getResult(a, b);
		System.out.println("CalMinus: "+m);
		*/
		
		//방법1
		int plus=calc(new CalPlus(), a,b); //CalculatorExam c1=new Calplus();
		System.out.println("두 수의 합: "+plus);
		int minus=calc(new CalMinus(), a,b); //CalculatorExam c1=new Calplus();
		System.out.println("두 수의 차: "+minus);
		
		System.out.println();
		//방법2
		System.out.println("두 수의 합: "+calc(new CalPlus(), a,b));
		System.out.println("두 수의 차: "+calc(new CalMinus(), a,b));
		
		/*
		//방법3
		System.out.println();
		CalculatorExam[] calculators = {new CalPlus(), new CalMinus()};
		//int arr[]={1,2};
		//for(int array:arr){}
		
		System.out.print("정수 A를 입력하세요 : ");
		int aa = scan.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int bb = scan.nextInt();
		//getClass().getSimpleName() : 클래스명 가져오기
		for(CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}
		*/	

	}//main
	
	//응용 => CalculatorExam c1 : CalPlus, CalMinus
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}

}



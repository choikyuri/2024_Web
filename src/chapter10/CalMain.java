package chapter10;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("A. ������ �Է��ϼ���: ");
		int a=scan.nextInt();
		System.out.print("B. ������ �Է��ϼ���: ");
		int b=scan.nextInt();
		/*
		CalPlus plus=new CalPlus();
		int p=plus.getResult(a, b);
		System.out.println("CalPlus: "+p);
		
		CalMinus m=new CalMinus();
		int m=m.getResult(a, b);
		System.out.println("CalMinus: "+m);
		*/
		
		//���1
		int plus=calc(new CalPlus(), a,b); //CalculatorExam c1=new Calplus();
		System.out.println("�� ���� ��: "+plus);
		int minus=calc(new CalMinus(), a,b); //CalculatorExam c1=new Calplus();
		System.out.println("�� ���� ��: "+minus);
		
		System.out.println();
		//���2
		System.out.println("�� ���� ��: "+calc(new CalPlus(), a,b));
		System.out.println("�� ���� ��: "+calc(new CalMinus(), a,b));
		
		/*
		//���3
		System.out.println();
		CalculatorExam[] calculators = {new CalPlus(), new CalMinus()};
		//int arr[]={1,2};
		//for(int array:arr){}
		
		System.out.print("���� A�� �Է��ϼ��� : ");
		int aa = scan.nextInt();
		System.out.print("���� B�� �Է��ϼ��� : ");
		int bb = scan.nextInt();
		//getClass().getSimpleName() : Ŭ������ ��������
		for(CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}
		*/	

	}//main
	
	//���� => CalculatorExam c1 : CalPlus, CalMinus
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}

}



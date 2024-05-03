package chapter12.Interface;

public class CalculatorMain {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
		Calc calc=new CompleteCalc2(); //�θ�� �ڽ�Ŭ������ ���� �޼ҵ常 ��밡��
		
		System.out.println("--default Method--");
		calc.description();
		System.out.println();
		
		System.out.println("----static Method----");
		int[] arr= {1,2,3,4,5};
		System.out.println("1 ~ 5������ ��: "+Calc.total(arr)); //�����޼ҵ�
		System.out.println();
		
		System.out.println("--Interface Method ȣ��--");
		System.out.println("num1+num2: "+calc.add(num1, num2));
		System.out.println("num1-num2: "+calc.substaract(num1, num2));

		System.out.println("num1*num2: "+calc.times(num1, num2));
		System.out.println("num1/num2: "+calc.divide(num1, num2));
		System.out.println();
		
		System.out.println("--child method ȣ��--");
		CompleteCalc2 calc2=new CompleteCalc2();
		calc2.showInfo();
		

	}

}



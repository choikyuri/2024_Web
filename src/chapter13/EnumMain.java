package chapter13;

import java.util.Scanner;

public class EnumMain {
	
	public enum Item{Start, Pause, Exit} //0 1 2

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
				System.out.print("���ڸ� �Է��ϼ���[0:���ӽ���, 1:�Ͻ�����, 2:��������]: ");
				int n=scan.nextInt();
				
				Item start=Item.Start; //start=0
				Item pause=Item.Pause; //pause=1
				Item exit=Item.Exit; //exit=2
				
				if(n==start.ordinal()) {//ordinal: enum Ÿ���� �����͸� index������ ����
					System.out.println("������ ���۵˴ϴ�.");
					}else if(n==pause.ordinal()) {
						System.out.println("������ �Ͻ����� �˴ϴ�");
					}else if(n==exit.ordinal()) {
						System.out.println("������ ���� �˴ϴ�");
						return;
					}else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				 }//if
		}//while
	}//main
}//class
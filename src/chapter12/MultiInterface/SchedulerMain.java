package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
		   System.out.println();
		   System.out.println("R or r : �Ѹ� ���ʷ� �Ҵ�");
    	   System.out.println("L or l : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
    	   System.out.println("P or p : ���� skill ���� ���� �������� �Ҵ�");
    	   System.out.println("S or s : ����");
    	   System.out.print("��ȭ ��� ����� �����ϼ��� : ");
    	   
    	   String mun=scan.nextLine();//R
    	   int ch=mun.charAt(0); //82 //charAt(0): String->ACSII(int)
    	   
    	   Scheduler scheduler=null;
    	   
    	   //��ü����
    	   if(ch=='R' || ch=='r') {
    		   scheduler=new RoundRobin();
    	   }else if(ch=='L' || ch=='l') {
    		   scheduler=new LeastJob();
    	   }else if(ch=='P' || ch=='p') {
    		   scheduler=new PriorityAllocation();
    	   }else if(ch=='S' || ch=='s'){
    		   System.out.println("������ �����մϴ�.");
    		   break;
    	   }else {
    		   System.out.println("�������� �ʴ� ����Դϴ�.");
    		   continue;//�����ϰ� ��� �ݺ�
    	   }
    	   scheduler.getNextCall();
    	   scheduler.sendCallToAgent();
		}
		

	}

}

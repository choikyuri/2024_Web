package chapter16.arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		try(Scanner scan=new Scanner(System.in)){
			
			ArrayList<Person> pArr=new ArrayList<Person>();
			
			WHILE:while(true) {
				System.out.println("1. ȸ���߰�");
				System.out.println("2. ȸ��Ż��");
				System.out.println("3. ȸ������");
				System.out.println("4. ����");
				System.out.print("�׸��� : ");
				
				int select;
				
				try {
					  select=scan.nextInt();
				} catch (InputMismatchException e) {
					  select=-1; //������ ���ܻ�Ȳ���� ���� ������ ����
				}
				
				scan.nextLine(); //enter
				
				switch(select) {
				case 1:
					addPerson(scan, pArr);
					break;
				case 2:
					removePerson(scan, pArr);
					break;
				case 3:
					showPeople(pArr);
					break;
				case 4:
					System.out.println("���α׷��� ���� �˴ϴ�");
					break WHILE;
				default:
					System.out.println("�߸��� �Է� ���Դϴ�.");
				}//switch
				
				System.out.println("----------------------------");
				
			}//while	
		} catch (Exception e) {
			System.out.println("������ ����");
			System.out.println(e);
		}
	}//personMgr
	
	
	//=========================================================
	private void addPerson(Scanner sc, ArrayList<Person> pArray) {
		System.out.println("---- �����߰� ----");
		
		System.out.println("�̸�: ");
		String name=sc.nextLine();
		
		System.out.println("����: ");
		int age=sc.nextInt();
		sc.nextLine(); //enter
		
		System.out.println("��ȭ: ");
		String tel=sc.nextLine();
		
		pArray.add(new Person(name, age, tel));
	
	}//addPerson
	
	private void removePerson(Scanner sc, ArrayList<Person> pArray) {
		System.out.println("---- ȸ��Ż�� ----");
		
		if(pArray.isEmpty()) {
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
			return;
		}
		
		System.out.print("Ż���� ȸ����ȣ�� �Է��ϼ���(1 ~ " +pArray.size() +"): ");
		int index=sc.nextInt();
		
		pArray.remove(index-1);
		
	}//removePerson
	
	private void showPeople(ArrayList<Person> pArray) {
		System.out.println("---- ȸ������ ----");
		
		int i=1;
		
		for(var person:pArray) {
			System.out.println(i+".�̸�: "+person.getName());
			System.out.println(i+".����: "+person.getAge());
			System.out.println(i+".��ȭ: "+person.getTel());
			System.out.println();
			i++;
		}

	}
	
	

}






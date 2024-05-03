package chapter16.arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		try(Scanner scan=new Scanner(System.in)){
			
			ArrayList<Person> pArr=new ArrayList<Person>();
			
			WHILE:while(true) {
				System.out.println("1. 회원추가");
				System.out.println("2. 회원탈퇴");
				System.out.println("3. 회원정보");
				System.out.println("4. 종료");
				System.out.print("항목선택 : ");
				
				int select;
				
				try {
					  select=scan.nextInt();
				} catch (InputMismatchException e) {
					  select=-1; //오류나 예외상황으로 인해 비정상 종료
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
					System.out.println("프로그램이 종료 됩니다");
					break WHILE;
				default:
					System.out.println("잘못된 입력 값입니다.");
				}//switch
				
				System.out.println("----------------------------");
				
			}//while	
		} catch (Exception e) {
			System.out.println("비정상 종료");
			System.out.println(e);
		}
	}//personMgr
	
	
	//=========================================================
	private void addPerson(Scanner sc, ArrayList<Person> pArray) {
		System.out.println("---- 정보추가 ----");
		
		System.out.println("이름: ");
		String name=sc.nextLine();
		
		System.out.println("나이: ");
		int age=sc.nextInt();
		sc.nextLine(); //enter
		
		System.out.println("전화: ");
		String tel=sc.nextLine();
		
		pArray.add(new Person(name, age, tel));
	
	}//addPerson
	
	private void removePerson(Scanner sc, ArrayList<Person> pArray) {
		System.out.println("---- 회원탈퇴 ----");
		
		if(pArray.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}
		
		System.out.print("탈퇴할 회원번호를 입력하세요(1 ~ " +pArray.size() +"): ");
		int index=sc.nextInt();
		
		pArray.remove(index-1);
		
	}//removePerson
	
	private void showPeople(ArrayList<Person> pArray) {
		System.out.println("---- 회원정보 ----");
		
		int i=1;
		
		for(var person:pArray) {
			System.out.println(i+".이름: "+person.getName());
			System.out.println(i+".나이: "+person.getAge());
			System.out.println(i+".전화: "+person.getTel());
			System.out.println();
			i++;
		}

	}
	
	

}






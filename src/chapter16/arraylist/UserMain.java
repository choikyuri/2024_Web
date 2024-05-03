package chapter16.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// ArrayList생성(단 UserInfo 객체만 들어갈수 있음) 객체이름: arr
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();

		outer: while (true) {
            
			System.out.print("아이디 생성(end을 입력하면 종료) : ");
			Scanner sc = new Scanner(System.in);

			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			//종료
            if(ui.getId().equals("end")) {
            	System.out.println("프로그램이 종료됩니다.");
            	break;
            }
            
			// 아이디 중복 체크
			for (int i = 0; i < arr.size(); i++) {
				if (ui.getId().equals(arr.get(i).getId())) {
					System.out.println("아이디가 중복됩니다. 다른 아이디를 입력하세요");
					continue outer;
				}
			}
			// 중복된 아이디가 아니라면 pwd입력
			System.out.print("패스워드를 입력하세요 : ");
			Scanner sc2 = new Scanner(System.in);
			ui.setPwd(sc2.nextInt());

			arr.add(ui);

			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println("-----------------------");
			}

		}
		
	}

}

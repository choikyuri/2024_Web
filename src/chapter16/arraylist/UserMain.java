package chapter16.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// ArrayList����(�� UserInfo ��ü�� ���� ����) ��ü�̸�: arr
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();

		outer: while (true) {
            
			System.out.print("���̵� ����(end�� �Է��ϸ� ����) : ");
			Scanner sc = new Scanner(System.in);

			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			//����
            if(ui.getId().equals("end")) {
            	System.out.println("���α׷��� ����˴ϴ�.");
            	break;
            }
            
			// ���̵� �ߺ� üũ
			for (int i = 0; i < arr.size(); i++) {
				if (ui.getId().equals(arr.get(i).getId())) {
					System.out.println("���̵� �ߺ��˴ϴ�. �ٸ� ���̵� �Է��ϼ���");
					continue outer;
				}
			}
			// �ߺ��� ���̵� �ƴ϶�� pwd�Է�
			System.out.print("�н����带 �Է��ϼ��� : ");
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

package chapter16.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
        //List������ ���� ArrayListŬ������ ��ü ����
		//�迭: String ls[]={1,2,3,4,5,6,7,8,9,10};
		List<String> ls=new ArrayList<String>();
		//����Ʈ�� �������߰�
		ls.add("Hi!");
		ls.add("Happy");
		ls.add("Nice");
		
		for(int i=0;i<ls.size();i++) {
			System.out.println((i+1)+": "+ls.get(i).toString());
		}
		
		System.out.println();
		System.out.println("-------������ �߰���-------");
		ls.add(1,"Good");
		for(int i=0;i<ls.size();i++) {
			System.out.println((i+1)+": "+ls.get(i).toString());
		}
		
		System.out.println();
		System.out.println("-------������ ������-------");
		ls.remove(0);
		for(int i=0;i<ls.size();i++) {
			System.out.println((i+1)+": "+ls.get(i).toString());
		}

	}

}






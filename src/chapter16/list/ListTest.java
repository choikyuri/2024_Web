package chapter16.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
        //List구조를 갖는 ArrayList클래스의 객체 생성
		//배열: String ls[]={1,2,3,4,5,6,7,8,9,10};
		List<String> ls=new ArrayList<String>();
		//리스트에 데이터추가
		ls.add("Hi!");
		ls.add("Happy");
		ls.add("Nice");
		
		for(int i=0;i<ls.size();i++) {
			System.out.println((i+1)+": "+ls.get(i).toString());
		}
		
		System.out.println();
		System.out.println("-------데이터 추가후-------");
		ls.add(1,"Good");
		for(int i=0;i<ls.size();i++) {
			System.out.println((i+1)+": "+ls.get(i).toString());
		}
		
		System.out.println();
		System.out.println("-------데이터 삭제후-------");
		ls.remove(0);
		for(int i=0;i<ls.size();i++) {
			System.out.println((i+1)+": "+ls.get(i).toString());
		}

	}

}






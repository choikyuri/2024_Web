package chapter16.arraylist;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("�ֿ���");
		list.add("���Ѽ�");
		list.add("���");
		list.add("������");
		list.add("�ۼ���");
		list.add("�輺��");
		
		System.out.println(list);
		
		System.out.println("list[0]: "+list.get(0));
		System.out.println("list[1]: "+list.get(1));
		

	}

}

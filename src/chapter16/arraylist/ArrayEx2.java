package chapter16.arraylist;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("ÃÖ¿µÁØ");
		list.add("±ÇÇÑ¼Ö");
		list.add("Àå¹Î");
		list.add("±èÇö¼ö");
		list.add("¼Û¼öÁø");
		list.add("±è¼º¿õ");
		
		System.out.println(list);
		
		System.out.println("list[0]: "+list.get(0));
		System.out.println("list[1]: "+list.get(1));
		

	}

}

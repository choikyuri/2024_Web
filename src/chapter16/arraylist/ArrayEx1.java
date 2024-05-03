package chapter16.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		//Collection => List => ArrayList
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("list.size(): "+list.size());
		
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println("list.size(): "+list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//���ؽ��� �����ϴ� ������ �Ը� Ŀ���� ������ ���ϵ� �� �������� �ذ��ϱ� ���� Iterator ����
		System.out.println("-----------------------");
		//#1.List������ �ڿ��� �ݺ��ڷ� ��ȯ
		Iterator<Integer> it=list.iterator();
		
		//#2.�ݺ��ڸ� while���� �����Ͽ� ��� �����͸� �о��
		while(it.hasNext()) {
			int v=it.next();//unBoxing�Ͽ� ��ü�� �⺻�ڷ����� ����
			System.out.println(v);
			
		}
		
		
		
	}

}







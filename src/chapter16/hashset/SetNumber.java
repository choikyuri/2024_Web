package chapter16.hashset;

import java.util.HashSet;
import java.util.Random;

public class SetNumber {

	public static void main(String[] args) {

        //�ߺ��ȵ� / ���ľȵ�
		HashSet<Integer> hs=new HashSet<Integer>();
		
		while(true) {
			//���� �߻�
			int v=(int)(Math.random()*45+1);
			//int v1=new Random().nextInt(45)+1;
			
			hs.add(v);
			
			if(hs.size()>=6) {
				break;
				}
			}
		System.out.println(hs);

	}

}

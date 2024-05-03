package chapter18.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		//int => IntStream ����ȯ
		IntStream stream =Arrays.stream(arr);
		int sum=stream.sum();
		System.out.println(sum);
		
		//sum()�� Integer�� ��ȯ�ǹǷ� unBoxing�Ͽ� ���
		int sumVal=Arrays.stream(arr).sum();
		int count=(int)Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
		/*
		//ERROR �ѹ� ����Ͽ����Ƿ� �缱�� �ȵ� �̹� �Ҹ�� stream���� ������
		count=(int)stream.count();
		System.out.println(count);
		*/
		//�缱�� ����
		int count2=(int)Arrays.stream(arr).count();
		System.out.println(count2);
		
	    //reduce(�ʱ갪, ���޵Ǵ� ��� -> �� ��Ұ� �����ϴ� ���)
		System.out.println(Arrays.stream(arr).reduce(0,(a,b)->a+b));
	
		

	}

}

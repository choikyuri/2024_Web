package chapter16.stack_queue;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
	   
		Object obj;
		
		Stack<Object> st=new Stack<Object>();
		
		//�Է�
		if(st.empty()) {//������ ����ִ��� Ȯ�� 
			for(int i=0;i<=5;i++) {
				st.push(new String("Hi"+i));
				System.out.println("�Է� "+i+"��°: "+st.peek()); //peek() : �۾���ġ
			}
			
		}//if
		
		//���
		st.pop(); //������ ������ 5���
		System.out.println("���� Top�� ��ġ: "+st.peek());//���� ��ġ 4
		st.pop(); //������ ������ 4���
		System.out.println("���� Top�� ��ġ: "+st.peek());//���� ��ġ 3
		
		 st.push(new String("Happy!!"));
		 System.out.println(st.peek());
         st.push(new String("Good!!"));
         System.out.println(st.peek());

	}

}










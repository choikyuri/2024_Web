package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer, String> hashMap;//����
	
	public MemberHashMap() {
		hashMap=new HashMap<Integer, String>();
	}
	//addMember
	public void addMember(Member2 member) {
		
		hashMap.put(member.getMemberId(), member.getMemberName());
	}
	
	//removeMember
	public boolean removeMember(int memberId) {
		 
		 while(hashMap.containsKey(memberId)) {//ã�� memberId�� �����ϴ��� ���θ� ���
			 hashMap.remove(memberId);
				 return true;
			 }
		 System.out.println(memberId+"�� �������� �ʽ��ϴ�");
		 return false;
	}
	
	//showAllMember
 	public void showAllMember() {
 		
 		Iterator<Integer> ir=hashMap.keySet().iterator();//��ȯ������ ����
 		
		while(ir.hasNext()) {
			int key=ir.next();
			String member=hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
	

}
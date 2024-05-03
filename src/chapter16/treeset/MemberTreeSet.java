package chapter16.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member3> treeSet;
	
	//DI
	public MemberTreeSet() {
		//Comparable�� ���Ľ� ���
		treeSet=new TreeSet<Member3>();
		
		//Comparator�� ���Ľ� (new Member3())�� �ݵ�� ������ �����
		//treeSet=new TreeSet<Member3>(new Member3());
	}
	
	//�Է�
	public void addMember(Member3 member) {
		treeSet.add(member);
	}
	
	//����
	public boolean removeMember(int memberId) {
		
		Iterator<Member3> ir=treeSet.iterator();
		
		while(ir.hasNext()) {
			Member3 member=ir.next();
			int tempId=member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}//while
		System.out.println("memberId"+"��(��) �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember(){
		for(Member3 member : treeSet){
			System.out.println(member);
		}
		System.out.println();
	}
	

}







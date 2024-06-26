package chapter16.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member3> treeSet;
	
	//DI
	public MemberTreeSet() {
		//Comparable로 정렬시 사용
		treeSet=new TreeSet<Member3>();
		
		//Comparator로 정렬시 (new Member3())를 반드시 생성자 명시함
		//treeSet=new TreeSet<Member3>(new Member3());
	}
	
	//입력
	public void addMember(Member3 member) {
		treeSet.add(member);
	}
	
	//삭제
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
		System.out.println("memberId"+"가(는) 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember(){
		for(Member3 member : treeSet){
			System.out.println(member);
		}
		System.out.println();
	}
	

}







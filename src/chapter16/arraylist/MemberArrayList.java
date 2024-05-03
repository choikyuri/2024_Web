package chapter16.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	//ArrayList 선언(arrayList)
	private ArrayList<Member> arrayList;
    
	
	//생성자(DI)
	public MemberArrayList() {
		arrayList=new ArrayList<>(); //heap
	}
	
	//메소드
	//저장: arrayList에 add하는 메소드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//삭제: arrayList에 remove하는 메소드
	public boolean removeMember(int memberId) {
		Iterator<Member> it=arrayList.iterator();
		
		while(it.hasNext()) {
			Member member=it.next();
			int templd=member.getMemberId();
			if(templd==memberId) {
				arrayList.remove(member);
				return true;
			}//if
		}//while
		System.out.println(memberId+"가(는) 존재하지 않습니다.");
	return false;
	
	}
	
	//정보출력 메소드: arrayList 출력하기
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}//showAllMember

}










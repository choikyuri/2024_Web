package chapter16.linkedlist;

import chapter16.arraylist.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		
		MemberLinkedList memberLinkedList=new MemberLinkedList();
		
		//팀원들 정보 입력 (중복 O, 순서 O)
		memberLinkedList.addMember(new Member(1001, "박영도"));
		Member memberLee=new Member(1002,"이석준");
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(new Member(1003, "송예림"));
		memberLinkedList.addMember(new Member(1004, "이진건"));
		memberLinkedList.addMember(new Member(1005, "임도영"));
		Member rem=new Member(1005,"임도영");
		memberLinkedList.addMember(rem);
		
		memberLinkedList.showAllMembe();
		memberLinkedList.removeMember(1005);
		memberLinkedList.showAllMembe();
		
		
		
		

	}

}

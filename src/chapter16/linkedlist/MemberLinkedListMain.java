package chapter16.linkedlist;

import chapter16.arraylist.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		
		MemberLinkedList memberLinkedList=new MemberLinkedList();
		
		//������ ���� �Է� (�ߺ� O, ���� O)
		memberLinkedList.addMember(new Member(1001, "�ڿ���"));
		Member memberLee=new Member(1002,"�̼���");
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(new Member(1003, "�ۿ���"));
		memberLinkedList.addMember(new Member(1004, "������"));
		memberLinkedList.addMember(new Member(1005, "�ӵ���"));
		Member rem=new Member(1005,"�ӵ���");
		memberLinkedList.addMember(rem);
		
		memberLinkedList.showAllMembe();
		memberLinkedList.removeMember(1005);
		memberLinkedList.showAllMembe();
		
		
		
		

	}

}

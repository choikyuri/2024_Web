package chapter16.treeset;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet =new MemberTreeSet();
		
	
		
		memberTreeSet.addMember(new Member3(1003, "�չα�"));
		memberTreeSet.addMember(new Member3(1002, "������"));
		memberTreeSet.addMember(new Member3(1001, "�ڼ���"));
		
		memberTreeSet.showAllMember();

	}

}

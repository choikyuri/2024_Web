package chapter17.hashmap;

public class MemberHashMapMain {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap=new MemberHashMap();
		
		//�Է¿� �ʿ��� �Ű����� ��ü ����
		Member2 memberLee=new Member2(1001, "�̼���");
		Member2 memberSon=new Member2(1004, "�չα�");
		Member2 memberPark=new Member2(1003, "�ڼ���");
		Member2 memberHong=new Member2(1002, "ȫ����");
		
		//�Է�
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(new Member2(1005, "�̹���"));
		memberHashMap.addMember(new Member2(1005, "�ӹ���"));
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMember();
		

	}

}

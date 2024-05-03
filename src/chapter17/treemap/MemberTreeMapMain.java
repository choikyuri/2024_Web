package chapter17.treemap;

import chapter17.hashmap.Member2;
public class MemberTreeMapMain {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap=new MemberTreeMap();
		
		//�Է¿� �ʿ��� �Ű����� ��ü ����
		MemberTree memberLee=new MemberTree(1001, "�̼���");
		MemberTree memberSon=new MemberTree(1004, "�չα�");
		MemberTree memberPark=new MemberTree(1003, "�ڼ���");
		MemberTree memberHong=new MemberTree(1002, "ȫ����");
		
		//�Է�
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberHong);
		memberTreeMap.addMember(new MemberTree(1005, "�̹���"));
		memberTreeMap.addMember(new MemberTree(1005, "�ӹ���"));
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1002);
		memberTreeMap.showAllMember();
		

	}

}

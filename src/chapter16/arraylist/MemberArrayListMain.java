package chapter16.arraylist;

public class MemberArrayListMain {

	public static void main(String[] args) {
		 
		MemberArrayList memberArrayList=new MemberArrayList();
        
		Member memberLee=new Member(1001, "ÀÌÁö¿ø");
		Member memberSon=new Member(1002, "¼Õ¹Î±¹");
		Member memberPark=new Member(1003, "¹Ú½ÃÈÍ");
		Member memberHong=new Member(1004, "È«±æµ¿");
		
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberSon.getMemberId());
		
		memberArrayList.showAllMember();
		

	}

}

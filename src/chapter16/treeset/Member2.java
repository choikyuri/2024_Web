package chapter16.treeset;

import java.util.Comparator;
import java.util.Objects;

public class Member2 implements Comparator<Member2>{
	
	private int memberId;
	private String memberName;
	
	public Member2() {
		// TODO Auto-generated constructor stub
	}
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
    
	//拱府利 林家
	@Override
	public int hashCode() {
		return memberName.hashCode()+memberId;
	}
	
    //稠府利 林家
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member=(Member2)obj;
			return member.memberName.equals(memberName) && (member.memberId==memberId);
		}else {
			return false;
		}
	}

	@Override
	public int compare(Member2 member1, Member2 member2) {
		
		return (member1.memberId - member2.memberId)*-1;
	}
	
	


}

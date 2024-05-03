package chapter16.treeset;

import java.util.Comparator;
import java.util.Objects;

public class Member3 implements Comparable<Member3>{
	
	private int memberId;
	private String memberName;
	
	public Member3() {
		// TODO Auto-generated constructor stub
	}
	
	public Member3(int memberId, String memberName) {
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
		if(obj instanceof Member3) {
			Member3 member=(Member3)obj;
			return member.memberName.equals(memberName) && (member.memberId==memberId);
		}else {
			return false;
		}
	}

	@Override
	public int compareTo(Member3 member3) {
		
		return (this.memberId-member3.memberId)*-1;
	}

	
	
	


}

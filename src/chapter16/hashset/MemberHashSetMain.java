package chapter16.hashset;

import java.util.HashSet;
import java.util.Set;

import chapter16.arraylist.Member;

public class MemberHashSetMain {

	public static void main(String[] args) {
			
		Set<Member> set=new HashSet<Member>();
		
		set.add(new Member(30, "È«±æµ¿"));
		set.add(new Member(30, "È«±æµ¿"));//ÀúÀåµÇ¸é ¾ÈµÊ
		
		System.out.println("ÃÑ °´Ã¼¼ö: "+set.size());
		System.out.println(set);

	}

}

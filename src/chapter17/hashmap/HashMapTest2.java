package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map<String Integer>생성 map
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		//팀원 데이터(성함, 1)저장
		map.put("최영준", 1);
		map.put("김성웅", 2);
		map.put("송수진", 3);
		map.put("김현수", 4);
		map.put("장민", 5);
		map.put("권한솔", 6);
		
		//팀원의 인원
		System.out.println("팀 인원: "+map.size());
		System.out.println();
		
		//팀원의 학번을 알아내자
		System.out.print("팀장 학번: ");
		System.out.println(map.get("최영준"));
		System.out.println();
		
		//팀원 모두의 학번 출력
		Set<String> keyset=map.keySet();
		Iterator<String> keyIterator=keyset.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			int value=map.get(key);
			System.out.println("\t"+key+": "+value);
		}//while
         System.out.println();
	}

}








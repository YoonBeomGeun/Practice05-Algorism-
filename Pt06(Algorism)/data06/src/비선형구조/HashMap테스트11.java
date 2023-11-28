package 비선형구조;

import java.util.HashMap;
import java.util.Set;

public class HashMap테스트11 {
	public static void main(String[] args) {

		// 중복이 없는 경우
		String[] s = { "leo", "kiki", "eden" };
		String[] c = { "eden", "kiki" };

		// 1. 참여자 목록 만들기
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			map.put(s[i], 0);
		}
		System.out.println(map);

		// 2. 완주한 선수 체크
		for (int i = 0; i < c.length; i++) {
			map.put(c[i], map.getOrDefault(c[i], 0) + 1);
		}
		System.out.println(map);

		// 3. 완주하지 못한 선수가 나옴
		String answer = "";
		for (int i = 0; i < s.length; i++) {
			if (map.get(s[i]) == 0) {
				answer = s[i];
			}
		}
		System.out.println(answer);
		
		System.out.println("===============================");
		
		// 중복이 있는 경우
		String[] s2 = {"leo", "kiki", "eden", "leo"};
		String[] c2 = {"kiki", "eden", "leo"};
		
		// 1. 참여자 목록 만들기
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		for (int i = 0; i < s2.length; i++) {
			list.put(s2[i], list.getOrDefault(s2[i], 0)+1);
		}
		System.out.println(list);
		
		// 2. 완주한 선수 체크
		for (int i = 0; i < c2.length; i++) {
			list.put(c2[i], list.get(c2[i])-1);
		}
		System.out.println(list);
		
		// 3. 완주하지 못한 선수가 나옴
		String answer2 = "";
		//방법 1
//		for (int i = 0; i < s2.length; i++) {
//			if(list.get(s2[i])!=0) {
//				answer2=s2[i];
//			}
//		}
		
		//방법 2
		Set keys = list.keySet();
		for(Object key : keys) {
			if(list.get(key)!=0) {
				answer = (String)key;
			}
		}
		System.out.println(answer);
	}
}

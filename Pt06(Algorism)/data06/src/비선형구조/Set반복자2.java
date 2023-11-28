package 비선형구조;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set반복자2 {

	public static void main(String[] args) {

		String s = "abcabcadc";
		//한 글자씩 분리
		//set으로 중복 제거
		String[] s2 = s.split("");
		List<String> list = Arrays.asList(s2); //읽기전용, 값수정 가능, 길이 조정 불가능
		//asList()는 실제로 list를 따로 만드는 것은 아니고,
		//배열을 그대로 둔 채 읽기 전용인 list방식으로 접근만 가능한 방식
		
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s2.length; i++) {
			set.add(s2[i]);
		}
		System.out.println(set);
		// "a"가 몇 개 있는지 출력
		System.out.println(Collections.frequency(list, "a"));
		
		Iterator<String> it = set.iterator();
		String answer = "";
		for (int i = 0; i < set.size(); i++) {
			String s3 = it.next();
			System.out.print(s3 + ": ");
			System.out.println(Collections.frequency(list, s3));
			if(Collections.frequency(list, s3)==1) {
				//answer = answer+s3;
				answer = String.join(answer, s3);
			}
		}
		System.out.println(answer);
	}

}

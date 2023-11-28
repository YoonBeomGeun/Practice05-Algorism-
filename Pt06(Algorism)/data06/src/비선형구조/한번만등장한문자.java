package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String s2 = "abcabcadc";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution1 {
	public String solution(String s2) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < s2.length(); i++) {
			list.add(s2.charAt(i)+"");			
		}
		System.out.println(list);
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		System.out.println(set);
		Iterator<String> it = set.iterator();
		String answer = "";
		
		ArrayList<String> result = new ArrayList<>();
		
		for (int i = 0; i < set.size(); i++) {
			String s3 = it.next();
			System.out.print(s3 + ": ");
			System.out.println(Collections.frequency(list, s3));
			if(Collections.frequency(list, s3)==1) {
				result.add(s3);
			}
		}
		Collections.sort(result);
		answer = String.join("", result); //""을 기준으로 컬렉션을 문자열로 만듦.
		return answer;
	}
}
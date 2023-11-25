package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String s2 = "a234";
		boolean result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution5 {
	public boolean solution(String x) {
		//String의 문자를 하나하나 분리해야 한다면 list, array 사용
		boolean answer = true;
		if(x.length()==4 || x.length()==6) {
			char[] c = x.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if(c[i] < '0' || c[i] > '9') {
					return false;
				}
			}
		} else {
			answer = false;
		}
		return answer;
	}
}
package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		String n = "hello";
		String result = s.solution(n);
		System.out.println(result);
	}
}

class Solution9 {
	public String solution(String n) {
		String answer = "";
		int k = 3;
		char[] ch = n.toCharArray();
		for(char x : ch) {
			for (int i = 0; i < k; i++) {
				answer += x;
			}
		}
		return answer;
	}
}
package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		String[] s2 = { "Jane", "Kim" };
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution6 {
	public String solution(String[] s2) {
		// String의 문자를 하나하나 분리해야한다면
		// list, array을 사용하세요.!
		String answer = "";
		List<String> list = Arrays.asList(s2);
		answer = "김서방은 " + list.indexOf("Kim") + "에 있다";

		// for문 사용
		// for (int i = 0; i < s2.length; i++) {
		// if(s2[i].equals("Kim")) {
		// answer = "김서방은 " + i + "에 있다";
		// }
		// }

		return answer;
	}
}
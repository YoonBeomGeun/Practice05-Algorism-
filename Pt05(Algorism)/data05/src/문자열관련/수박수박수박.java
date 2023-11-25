package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 수박수박수박 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int n = 3;
		String result = s.solution(n);
		System.out.println(result);
	}
}

class Solution7 {
	public String solution(int x) {
		String answer = "";
		//StringBuilder를 사용한 방법
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=x;i++) {
            if(i%2==1) {
                sb.append("수");
            } else {
            	sb.append("박");
            }
        }
        answer = sb.toString();
        return answer;
	}
}
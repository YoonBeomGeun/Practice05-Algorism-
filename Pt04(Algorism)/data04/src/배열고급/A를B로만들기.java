package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class A를B로만들기 {

	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "allpe";
		Solution000 s = new Solution000();
		int result = s.solution(s1, s2);
		System.out.println(result);
	}
}

class Solution000 {
	 public int solution(String before, String after) {
	        int answer = 0;
	        char[] ch1 = before.toCharArray();
	        char[] ch2 = after.toCharArray();
	        Arrays.sort(ch1);
	        Arrays.sort(ch2);
	        
	        System.out.println(Arrays.equals(ch1, ch2));
	        
	        String s1 = new String(ch1);
	        String s2 = new String(ch2);
	        
	        if(s1.equals(s2)) {
	            answer = 1;
	        } else {
	            answer = 0;
	        }
	        return answer;
	    }
}
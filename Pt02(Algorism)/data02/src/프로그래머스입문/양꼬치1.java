package 프로그래머스입문;

import java.util.Scanner;

public class 양꼬치1 {

	public static void main(String[] args) {
		
		Solution5 s = new Solution5();
		int result = s.solution(40, 5); // 200
		System.out.println(result);
	}

}

class Solution5 {
	public int solution(int n, int k) {
		int answer = n*12000 + (k-(n/10))*2000;
		return answer;
	}
}
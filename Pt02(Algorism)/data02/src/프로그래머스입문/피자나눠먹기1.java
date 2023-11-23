package 프로그래머스입문;

import java.util.Scanner;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		
		Solution6 s = new Solution6();
		int result = s.solution(40); // 200
		System.out.println(result);
	}

}

class Solution6 {
    public int solution(int n) {
        int k = 7;
        int answer = 0;
        while(true) {
            if(k>=n) {
                answer = k/7;
                break;
            } else {
                k+=7;
            }
        }
        return answer;
    }
}
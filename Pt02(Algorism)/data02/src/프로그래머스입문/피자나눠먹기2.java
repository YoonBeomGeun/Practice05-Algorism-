package 프로그래머스입문;

import java.util.Scanner;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		
		Solution7 s = new Solution7();
		int result = s.solution(40); // 200
		System.out.println(result);
	}

}

class Solution7 {
    public int solution(int n) {
        int answer = 0;
        int k = 6;
        while(true) {
            if(k%n==0) {
                answer=k/6;
                break;
            } else {
                k+=6;
            }
        }
        return answer;
    }
}
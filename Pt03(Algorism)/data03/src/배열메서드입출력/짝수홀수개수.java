package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 짝수홀수개수 {

	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5};
		Solution8 s = new Solution8();
		int[] answer = s.solution(num_list);
		Print.arr(answer);
	}
}

class Solution8 {
	public int[] solution(int[] num_list) {
		int[] answer = {0, 0};
        int jjak = 0;
        int hol = 0;
        for(int x : num_list) {
            if(x%2==0) {
                jjak++;
            } else if(x%2==1) {
                hol++;
            } else {
                System.out.println("0입니다.");
            }
        }
        answer[0] = jjak;
        answer[1] = hol;
        return answer;
	}
}
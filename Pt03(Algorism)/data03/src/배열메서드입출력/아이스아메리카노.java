package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 아이스아메리카노 {

	public static void main(String[] args) {
		int money = 17000;
		Solution7 s = new Solution7();
		int[] answer = s.solution(money);
		Print.arr(answer);
	}
}

class Solution7 {
	public int[] solution(int money) {
		int[] answer = {0, 0};
		int count = money/5500;
        int change = money%5500;
        answer[0] = count;
        answer[1] = change;
		return answer;
	}
}
package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[] num_list = {1, 2, 3, 4, 5};
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution01 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[num_list.length-1-i];
		}
		return answer;
	}
}
package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 같은숫자는싫어 {

	public static void main(String[] args) {

		Solution03 s = new Solution03();
		int[] num_list = { 1, 1, 3, 3, 0, 1, 1 };
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution03 {
	public int[] solution(int[] num_list) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(num_list[0]);
		for (int i = 1; i < num_list.length; i++) {
			if(num_list[i]!=num_list[i-1]) {
				list.add(num_list[i]);
			}
		}
		System.out.println(list);
		/*
		 * HashSet<Integer> set = new HashSet<>(); for (int i = 0; i < num_list.length;
		 * i++) { set.add(num_list[i]); }
		 */
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
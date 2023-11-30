package Coding;

import java.util.Arrays;

public class 접미사배열 {

	public static void main(String[] args) {
		String my_string = "banana";
		String[] answer = new String[my_string.length()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = my_string.substring(i);
		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}

}

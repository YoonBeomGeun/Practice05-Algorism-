package Coding;

import java.util.Arrays;

public class 접미서인지확인하기 {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_suffix = "ana";
		int answer = 0;
		System.out.println(my_string.endsWith(is_suffix)? 1 : 0);
	}

}

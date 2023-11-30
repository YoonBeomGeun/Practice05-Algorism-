package Coding;

import java.util.Arrays;

public class 접두사인지확인하기 {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_prefix = "ban";
		int answer = 0;
		System.out.println(my_string.startsWith(is_prefix)? 1 : 0);
	}

}

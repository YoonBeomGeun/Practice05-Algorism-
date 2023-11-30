package Coding;

import java.util.Arrays;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		String my_string = "Progra21Sremm3";
		String answer = my_string.substring(6, 12+1);
		String sss = "";
		for (int i = answer.length()-1; i >= 0; i--) {
			sss = sss + answer.charAt(i);
		}
		System.out.println(sss);
		my_string = my_string.replaceAll(answer, sss);
		System.out.println(my_string);
	}

}

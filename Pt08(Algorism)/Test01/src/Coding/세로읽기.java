package Coding;

import java.util.ArrayList;

public class 세로읽기 {
	public static void main(String[] args) {
		String my_string = "ihrhbakrfpndopljhygc";
		String answer = "";
		int m = 4;
		int c = 2;
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i += m) {
			list.add(my_string.substring(i, m+i));
		}
		for (String s : list) {
			answer = answer + s.charAt(c-1);
		}
		System.out.println(answer);
	}
}

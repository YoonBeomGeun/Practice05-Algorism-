package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링정리문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[10];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
		}
		Arrays.sort(jumsu);
		System.out.println(jumsu[0]);
		System.out.println(jumsu[jumsu.length-1]);
	}

}

package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링정리문제3 {

	public static void main(String[] args) {
		int[] jumsu = {10, 11, 12, 10, 10, 13, 14, 14, 15, 15};
		Arrays.sort(jumsu);
		int min = jumsu[0];
		int max = jumsu[jumsu.length-1];
		for (int i = 0; i < jumsu.length; i++) {
			if(min>=jumsu[i]) {
				min = jumsu[i];
				System.out.print(i);
			}
		}
		System.out.println();
		for (int i = jumsu.length-1; i >0; i--) {
			if(max<=jumsu[i]) {
				max = jumsu[i];
				System.out.print(i);
			}
		}
	}

}

package 배열응용;

import java.util.Random;

import 배열기본.Print;

public class 정리문제3 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n = new int[20];
		for(int i=0; i<n.length;i++) {
			n[i] = r.nextInt(900);
		}
		int max = n[0];
		for(Integer x : n) {
			if(x>max) {
				max = x;
			}
		}
		System.out.println(max);
		Print.arr(n);
	}

}

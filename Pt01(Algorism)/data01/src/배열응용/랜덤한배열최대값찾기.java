package 배열응용;

import java.util.Random;

import 배열기본.Print;

public class 랜덤한배열최대값찾기 {

	public static void main(String[] args) {

		Random r = new Random();
		r.setSeed(100);
		int[] n = new int[10];
		
		for(int i=0;i<n.length;i++) {
			n[i]=r.nextInt(1000);
		}
		
		int max = n[0];
		for(Integer x : n) {
			if(x>max) {
				max=x;
			}
		}
		System.out.println(max);
		Print.arr(n);
	}

}

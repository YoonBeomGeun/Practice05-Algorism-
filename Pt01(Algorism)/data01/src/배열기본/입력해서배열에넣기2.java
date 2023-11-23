package 배열기본;

import java.util.Arrays;
import java.util.Random;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
		
		//랜덤한 값 출력
		
		Random r = new Random();
		int[] numbers = new int[3];
		//numbers --> {0,0,0} + length
		for(int i=0; i<numbers.length;i++) {
			numbers[i] = r.nextInt(10);
		}
		
		System.out.println(Arrays.toString(numbers));
		
	}

}

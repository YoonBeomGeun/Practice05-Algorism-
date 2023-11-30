package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기 {

	public static void main(String[] args) {
		int[] num = {6,1,2,3,5};
		System.out.println(Arrays.toString(num));
		
		//swap 전에 백업을 해 놓아야 한다.
		int temp = num[1];
		num[1] = num[0];
		num[0] = temp;
		System.out.println(Arrays.toString(num));
		
	}

}

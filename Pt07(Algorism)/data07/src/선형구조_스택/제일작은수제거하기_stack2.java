package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 제일작은수제거하기_stack2 {

	public static void main(String[] args) {
		int[] n = { 500,400,200,300,900 }; //==> {4,3,2,5}
		//Stack을 이용하여 최대값을 제외한 값을 목록으로
		Arrays.sort(n); // 정렬
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n.length; i++) {
			stack.push(n[i]);
		}
		stack.pop(); // 최대값 제거
		System.out.println(stack);
		
		int[] answer = new int[stack.size()];
		//1. 오름차순 배열로 모아 프린트
//		for (int i = answer.length-1; i >= 0; i--) {
//			answer[i] = stack.pop();
//		}
//		System.out.println(Arrays.toString(answer));

		//2. 내림차순 배열로 모아 프린트
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
		
	}

}
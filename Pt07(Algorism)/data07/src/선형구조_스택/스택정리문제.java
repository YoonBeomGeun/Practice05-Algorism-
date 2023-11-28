package 선형구조_스택;

import java.util.ArrayList;
import java.util.Stack;

public class 스택정리문제 {

	public static void main(String[] args) {
		String[] food = {"apple", "apple", "apple", "banana", "banana", "melon", "melon", "berry"};
		Stack<String> stack = new Stack<>();
		ArrayList<String> arr = new ArrayList<String>();
		
		stack.push(food[0]); // stack.peek() --> apple
		for (int i = 1; i < food.length; i++) {
			if(!food[i].equals(stack.peek())) {
				stack.push(food[i]);
			} else {
				arr.add(food[i]);
			}
		}
		System.out.println("중복된 목록: " + arr);
		System.out.println(stack);
	}

}

package 선형구조_큐;

import java.util.LinkedList;

public class 큐정리문제 {

	public static void main(String[] args) {
		String[] wait = {"홍길동", "김길동", "송길동", "정길동", "박길동", "이길동"};
		LinkedList<String> queue = new LinkedList<>();
		for (int i = 0; i < wait.length; i++) {
			queue.add(wait[i]);
		}
		System.out.println(queue);
		queue.pop();
		queue.pop();
		queue.add(queue.poll());
		System.out.println(queue);
		
		queue.pop();
		queue.add(queue.poll());
		System.out.println(queue);
		System.out.println(queue.size());
	}
}

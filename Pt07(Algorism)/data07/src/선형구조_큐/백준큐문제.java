package 선형구조_큐;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class 백준큐문제 {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		//System.out.println(queue);
		//System.out.println(queue.element()); // element() -> 가장 앞에 있는 값 검색
		System.out.println(queue.peek()); // 위와 같은 기능
		System.out.println(queue.get(queue.size()-1));
		System.out.println(queue.size());
		System.out.println(queue.isEmpty()? 1 : 0);
		try {
			System.out.println(queue.pop());
			System.out.println(queue.pop());
			System.out.println(queue.pop());
		} catch (EmptyStackException e) {
			System.out.println(-1);
		}
		
	}

}

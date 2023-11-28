package 선형구조_큐;

import java.util.LinkedList;

public class 백준카드2 {

	public static void main(String[] args) {
		int n = 6;
		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		
		for (int i = 0; i <= queue.size(); i++) {
			queue.remove();
			queue.add(queue.remove());
		}
		queue.remove();
		System.out.println(queue);
	}

}

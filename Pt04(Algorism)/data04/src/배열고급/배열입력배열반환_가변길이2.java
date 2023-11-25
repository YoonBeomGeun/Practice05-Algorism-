package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력배열반환_가변길이2 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		int find = 3;
		Solution5 s = new Solution5();
		int[] result = s.solution(n, find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution5 {
	public int[] solution(int[] n, int find) {
		//find의 배수가 되는 값읠 목록만 구하기
		//1. 답안의 개수가 가변이어서 ArrayList 필요
		ArrayList<Integer> list = new ArrayList<>();
		
		//2. 일단 반복문으로 list에 find의 배수가 되는 숫자를 모으기
		//		if(n[i] % find == 0)
		for (int i = 0; i < n.length; i++) {
			if(n[i] % find==0) {
				list.add(n[i]);
			}
		}
		//3. 리스트를 프린트해서 확인해 보고, 사이즈 확인
		int size = list.size();
		System.out.println(size);
		//4. 배열을 리스트 사이즈만큼 만들어주고 리스트에서 꺼내서 배열에 같은 인덱스에 넣기
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
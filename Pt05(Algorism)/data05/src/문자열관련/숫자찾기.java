package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 숫자찾기 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int num = 29183;
		int k = 1;
		int result = s.solution(num, k);
		System.out.println(result);
	}
}

class Solution1 {
	public int solution(int num, int k) {
		//인덱스를 활용한 문제가 나오면 int
		//--> 다른 타입으로 바꿔버림
		//--> array, list, String
		String s = String.valueOf(num); //"29183"
		String k2 = String.valueOf(k); //"1"
		int index = s.indexOf(k2);
		//System.out.println(index+1);
		int answer = -1;
		if(s.contains(k2)) {
			answer = index + 1;
		}
		return answer;
	}
}
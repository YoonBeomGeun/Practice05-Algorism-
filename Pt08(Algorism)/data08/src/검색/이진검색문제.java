package 검색;

import java.util.Arrays;

public class 이진검색문제 {

	public static void main(String[] args) {
		int[] num = {1,4,5,2,7,8,9,6};
		int[] search = {1,7,6};
		// 오름차순 정렬 후 위치를 찾아서 프린트("인덱스 - 인덱스 - 인덱스")
		//StringBuilder 사용
		
		Arrays.sort(num);
		StringBuilder sb = new StringBuilder();
		for (int find : search) {
			sb.append(" - " + Arrays.binarySearch(num, find)); // 이진 검색
		}
		
		System.out.println(sb);
		String answer = sb.toString();
		System.out.println(answer);
	}

}

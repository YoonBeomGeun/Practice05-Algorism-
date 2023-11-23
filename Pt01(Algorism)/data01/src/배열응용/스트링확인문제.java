package 배열응용;

import java.util.Arrays;

import 배열기본.Print;

public class 스트링확인문제 {
	
	private static String s10;

	public static void main(String[] args) {
		String s1 = "참좋다.";
		String s2 = "진짜좋다.";
		
		System.out.println(s1.equals(s2));
		if(s1.length() > s2.length()) {
			System.out.println("s1이 더 큼");
		} else {
			System.out.println("s2가 더 큼");
		}
		
		//영어만 java programmer만 추출하여 모두 대문자로 출력
		String s3 = "나는 진짜 java programmer가 되었어";
		System.out.println(s3.substring(6, 21)); //6~20
		String s33 = s3.substring(6, 21);
		System.out.println(s33.toUpperCase());
		
		String s4 = "2056521";
		char c = s4.charAt(0);
		if(c=='2' || c=='4') {
			System.out.println("여자임");
		} else {
			System.out.println("남자임");
		}
		
		String s5 = " [ 10, 222, 30, 40, 50]";
		s5 = s5.replace("[", ""); // 대체하는 함수
		s5 = s5.replace("]", "");
		System.out.println(s5);
		s5 = s5.trim();
		System.out.println(s5);
		String[] s6 = s5.split(", "); // ,로 문자를 문리하여 배열로 만듦
		Print.arr(s6);
		int sum = 0;
		for(String s : s6) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
		
		int[] newArr = new int[5];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = Integer.parseInt(s6[i]);
		}
		
		Print.arr(newArr);
		Arrays.sort(newArr); //오름차순으로 정렬, 파괴형
		Print.arr(newArr);
		
		s10 = "김길동";
		s10 = "박길동";
		//String이 변경될때는 새로운 메모리에 새로운 변경된
		//데이터를 넣는다.! 비효율적
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동");
		System.out.println(sb);
		sb.insert(0, "하하하");
		System.out.println(sb);
		
		String all = "국어, 영어, 수학, 컴퓨터";
		String[] all2 = all.split(", ");
		Print.arr(all2);
	}
}

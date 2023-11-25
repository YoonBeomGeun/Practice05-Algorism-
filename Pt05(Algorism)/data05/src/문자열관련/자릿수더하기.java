package 문자열관련;

public class 자릿수더하기 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int num = 1234;
		int result = s.solution(num);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int n) {
		int answer = 0;
		String s = String.valueOf(n);
		//String의 값을 하나씩 떨어트리는 방법 2가지
		//1) char로 분리 ==> 아스키코드를 고려!!
		char[] c = s.toCharArray(); 
		//c = {'1','2','3','4'};
		for (int i = 0; i < c.length; i++) {
			answer = answer + c[i] - '0';
			// -'0'(아스키코드값=48)을 해줌으로써 숫자를 얻어낼 수 있다.
		}
		
		//2) String으로 분리(더 편하지만 용량을 많이 차지함)
//		String[] s2 = s.split(""); // s2 = {"1", "2", "3", "4"};
//		
//		for (int i = 0; i < s2.length; i++) {
//			int k = Integer.parseInt(s2[i]);
//			answer += k;
//		}
		return answer;
	}
}
package 문자열관련;

public class StringBuilderTest {

	public static void main(String[] args) {

		String s1 = "pongpong";
		String s2 = "pongpong";
		System.out.println(s1 == s2); // 주소비교
		System.out.println(s1.equals(s2)); // 값 비교
		s2 = "hahaha";
		System.out.println(s1 == s2); // 주소비교
		System.out.println(s1.equals(s2)); // 값 비교
		//String의 값을 변경하면 주소도 함께 변경
		//String의 값의 변경이 자주 일어나는 경우 비효율적!
		StringBuilder sb1 = new StringBuilder("pongpong");
		StringBuilder sb2 = new StringBuilder("pongpong");
		System.out.println((sb1==sb2));
		//StringBuilder는 주소가 다르고 값이 변경된다.
		sb1.append("hahaha");
		System.out.println(sb1);
		//sb1을 String으로 변경하는 방법
		String result = sb1.toString();
		System.out.println(result);
		sb1.replace(0, 3, "ttt");
		System.out.println(result);
	}

}

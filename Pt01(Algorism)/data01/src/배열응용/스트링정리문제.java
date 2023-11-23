package 배열응용;

import java.util.Scanner;

import 배열기본.Print;

public class 스트링정리문제 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력(- 포함) >> ");
		String s = sc.next();
		s = s.trim();
		String[] sss = s.split("-");
		if(sss[0]=="011") {
			System.out.println("SK");
		} else {
			System.out.println("LG");
		}
		if(sss[1].length()>=4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		if(sss[0].length() + sss[1].length() + sss[2].length()>=10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}*/
		
		String str = " '휴지', '블루볼펜', '지우개' +=-";
		str=str.trim();
		str=str.replace("'", "");
		str=str.replace("'", "");
		str=str.replace("+=-", "");
		System.out.println(str);
		String[] str2 = str.split(", ");
		Print.arr(str2);
		if(str2[1].charAt(0)=='블' && str2[1].charAt(1)=='루') {
			System.out.println("블루");
		} else { 
			System.out.println("레드");
		}
		
	}

}

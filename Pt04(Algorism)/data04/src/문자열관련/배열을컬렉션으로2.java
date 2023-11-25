package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로2 {
	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자", "고구마", "우유", "감자", "양파"};
		//StringPrint(냉장고음식);
		List<String> list = Arrays.asList(냉장고음식);
		
		//1. 감자가 들어있는 마지막 위치를 구해보세요, 전체 출력
		int a = list.lastIndexOf("감자");
		System.out.println(a);
		
		//2. 양파를 포함하고 있으면 "양파는 안 사도 된다.",
		//		포함하고 있지 않으면 "양파사서 냉장고에 넣어야 한다.", 전체 출력
		if(list.contains("양파")) {
			System.out.println("양파는 안 사도 된다.");
		} else {
			System.out.println("양파사서 냉장고에 넣어야 한다.");
		}
		
		//3. 우유를 "춘식이 우유"로 수정, 전체 출력
		//ArrayList<String> list2 = new ArrayList<>(Arrays.asList(냉장고음식));
		list.set(2, "춘식이 우유");
		System.out.println(list);
		
		//4. 양파의 위치를 찾은 후, 해당 위치에 "양파즙"이라고 수정, 전체 출력
		int index = list.indexOf("양파");
		list.set(index, "양파즙");
		System.out.println(list);
		
		//5. 다시 배열로 변환하여 전체 내용 출력
		list.toArray(); //Object[] 배열로 바꿈
		// String으로 바꿔야 함.
		String[] s2 = (String[])list.toArray();
		System.out.println(Arrays.toString(s2));
	}
}

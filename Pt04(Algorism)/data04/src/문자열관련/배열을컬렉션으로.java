package 문자열관련;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로 {
	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc"};
		
		List<String> list = Arrays.asList(s2);
		// 읽기전용, 꺼내서 검색하는 정도, 리스트의 길이를 늘리지 못함(수정 불가)
		// 같은 길이에서 수정은 가능
		// 읽기 전용의 list로 변환이 가능.
		int index = list.indexOf("bbb");
		System.out.println(index);
		boolean result = list.contains("ccc");
		System.out.println(result);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		//list.add("ttt"); ==> 수정불가능!
		//list를 수정을 하고 싶은 경우에는 
		//list를 새로 만들어야 한다.
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(s2)); // 수정 가능
		System.out.println(list);
		
	}
}

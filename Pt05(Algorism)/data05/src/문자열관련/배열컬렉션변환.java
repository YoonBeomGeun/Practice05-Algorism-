package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열컬렉션변환 {

	public static void main(String[] args) {
		String[] s3 = {"박명수", "유재석", "김종국", "송지효", "하하"};
		//오름차순 정렬해서 프린트
		Arrays.sort(s3);
		System.out.println(Arrays.toString(s3));
		
		//내림차순 정렬해서 프린트
		String[] result = new String[s3.length];
		int k=0;
		for (int i = s3.length-1; i >= 0; i--) {
			result[k] = s3[i];
			k++;
		}
		System.out.println(Arrays.toString(result));
		
		//글자수가 3미만인 사람 삭제후  프린트
		//List<String> list = Arrays.asList(s3);
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s3));
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).length()<3) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		//유재석을 찾아서 유재돌로 변경한 후 프린트
		int index = list.indexOf("유재석");
		list.set(index, "유재돌");
		System.out.println(list);
		
		//전체 목록에 "김종민"을 3번째에 추가한 후 프린트
		list.add(2, "김종민");
		System.out.println(list);
	}
}
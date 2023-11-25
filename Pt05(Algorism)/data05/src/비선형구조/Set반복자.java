package 비선형구조;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Set반복자 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("휴대폰");
		set.add("휴지");
		set.add("휴지"); // 중복된 값은 들어가지 않음, 넣을 수는 있지만 꺼내는 연산은 없음
		System.out.println(set);
		//반복자(iterator)
		//set에 있는 값을 하나씩 꺼내려면 반복자가 필요
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()); //컴퓨터의 상황에 따라 출력(순서가 없음)
		}
		//array --> list : Arrays.asList()
		//list --> array : list.toArray()
		//set --> array : set.toArray()
		Object[] arr = set.toArray(); // Object 타입으로 만들어짐
		System.out.println(Arrays.toString(arr));
		
		
	}
}

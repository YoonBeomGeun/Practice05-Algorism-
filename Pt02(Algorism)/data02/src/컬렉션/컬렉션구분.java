package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션구분 {

	public static void main(String[] args) {

		//중복제거된 컬렉션 ==> set
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add(1000);
		System.out.println(bag); //주소가 나와야하지만 toString이 오버라이딩 되어있어서 값이 출력됨(String)
		System.out.println(bag.size());
		
		
		ArrayList list = new ArrayList();
		list.add("코딩수업");
		list.add(2);
		System.out.println(list);
		String s = (String)list.get(0); // String <-- Object
		int time = (int)list.get(1);
		System.out.println(time+1);
		
		//<타입을 나타내는 클래스명>은 객체생성할 때 결정 가능!
		ArrayList<String> name = new ArrayList<String>();
		name.add("홍길동");
		name.add("김길동");
		String s2 = name.get(0);
		
		ArrayList<Integer> food = new ArrayList<>();
		food.add(18000);
		food.add(12000);
		int in = food.get(0);
		food.add(0, 10000); // 오버로딩(다형성)
		//자바에서는 입력형태가 다르면 메서드 이름을 동일하게 써도 된다.
		boolean result = food.contains(12000);
		System.out.println(result);
		int in2 = food.indexOf(12000);
		System.out.println(in2);
		boolean result2 = food.isEmpty();
		System.out.println(result2);
		int in3 = food.lastIndexOf(10000);
		System.out.println(in3);
		food.set(0,  11000);		
		System.out.println(food);
		Object[] arr = food.toArray();
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		food.clear();
		System.out.println(food);
		
		
		HashMap<Integer, String> tel = new HashMap<>();
		tel.put(1,"엄마");
		tel.put(2,"친구");
		System.out.println(tel);
		
		
		
		
		
		
		
	}

}

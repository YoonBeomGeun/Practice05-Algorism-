package 배열응용;

import 배열기본.Print;

public class 배열최소값찾기 {

	public static void main(String[] args) {

		int[] n = {90, 80, 20, 60, 70};
		//최소값/최대값을 찾을 때는 인덱스를 하나씩 옮기면서 거기까지의 최소값/최대값을 넣어줄 수 있는 변수를 따로 만들기
		//그 최소값/최대값보다 작거나 크면 최소값/최대값으로 변수설정하기
		
		int min = n[0]; //첫 번째값 넣기
		for(int x : n) {
			if(x<min) {
				min=x;
			}
		}
		System.out.println(min);
		Print.arr(n);
	}

}

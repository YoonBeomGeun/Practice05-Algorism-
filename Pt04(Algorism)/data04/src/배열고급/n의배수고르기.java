package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class n의배수고르기 {

	public static void main(String[] args) {
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int n = 3;
		Solution8 s = new Solution8();
		int[] result = s.solution(n, numlist);
		System.out.println(Arrays.toString(result));
	}
}

class Solution8 {
    public int[] solution(int n, int[] numlist) {
    	//1. 가변리스트인 ArrayList 만들기
    	//2. 배열 조건에 맞는 것을 lsit에 모으기
    	//3. list 사이즈만큼 배열 만들기
    	//4. list에서 배열로 옮기기
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<numlist.length;i++) {
            if(numlist[i]%n==0) {
                list.add(numlist[i]);
            }
        }
        int size = list.size();
        //System.out.println(size);
        int[] answer = new int[list.size()];
        for(int k=0;k<answer.length;k++) {
            answer[k] = list.get(k);
        }
        return answer;
    }
}
package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class K번째큰수 {
	public static void main(String[] args) {
		//k 번째로 큰 수
		int[] arr = {22,33,66,11,10,15};
		int k = 2;
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
		//k2 번째로 큰 수
		int[] arr2 = {22,22,44,11,11,33,55,66,20,10,30,55};
		int k2 = 3;
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for (int i = 0; i < arr2.length; i++) {
			tree.add(arr2[i]);			
		}
		System.out.println(tree);
		System.out.println(tree.size());
		System.out.println(tree.first()); //가장 작은 거
		System.out.println(tree.last()); //가장 큰 거
		System.out.println(tree.lower(20)); //20보다 작은 가장 가까운 수
		System.out.println(tree.higher(20)); //20보다 큰 가장 가까운 수		
		Object[] ob = tree.toArray();
		System.out.println(ob[ob.length-3]);
		
	}
}

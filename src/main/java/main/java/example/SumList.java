package main.java.example;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class SumList{
	/** @return the sum of the numbers in the list */
	public static int sum(List<Integer> list) {
		int sum = 0;
		for (int x : list) {
			sum += x;
		}
		return sum;
	}

	/** @return the sum of the absolute values of the numbers in the list */
	public static int sumAbsolute(List<Integer> list) {
		// let's reuse sum(), because DRY, so first we take absolute values
//	    ArrayList<Integer> l = new ArrayList<Integer>(list);
		for (int i = 0; i < list.size(); ++i){
			list.set(i, Math.abs(list.get(i)));
		}
		return sum(list);
	}

	// meanwhile, somewhere else in the code...
	public static void main(String[] args) {
		// ...
		List<Integer> myData = Arrays.asList(-5, -3, -2);
		System.out.println(sum(myData));
		System.out.println(sumAbsolute(myData));

	}
}



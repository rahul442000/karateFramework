package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public void removeDuplicate(int[] num) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i=0;i<num.length;i++) {
			set.add(num[i]);
		}
		System.out.println("Unique values: "+set);
	}

	public static void main(String[] args) {
		int[] num = {2,3,1,4,0,7,7,5,4,4,3,9};
		RemoveDuplicate rd = new RemoveDuplicate();
		rd.removeDuplicate(num);

	}

}

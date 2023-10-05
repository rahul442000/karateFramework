package javaPrograms;

import java.util.HashMap;

public class FindDuplicateWord {


	private void findDuplicate(String str) {
		String[] split = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		try {
			for(int i=0;i<split.length;i++) {
				if(map.containsKey(split[i])) {
					int count = map.get(split[i]);
					count = count +1;
					map.put(split[i], count);
				}else {
					map.put(split[i], 1);
				}
			}
			System.out.println(map);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception catched.");
		}
		
	}
	
	
	public static void main(String[] args) {
		String str = "my name is Rahul Soni and Rahul Soni";
		FindDuplicateWord a = new FindDuplicateWord();
		a.findDuplicate(str);
		
	}

}

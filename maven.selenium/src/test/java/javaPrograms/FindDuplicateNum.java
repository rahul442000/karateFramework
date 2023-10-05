package javaPrograms;

public class FindDuplicateNum {
	
	public void findDuplicate(int num[]) {
		
		try {
			for(int i=0;i<num.length;i++) {
				for(int j=i+1;j<num.length;j++) {
					if(num[i] == num[j]) {
						System.out.println("Dulpicate Num is: "+num[i]);
					}
				}
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception catched.");
		}
		
	}
	
	public static void main(String[] args) {
		int[] num = {1,2,3,0,1,4,2,5,6,0};
		FindDuplicateNum a = new FindDuplicateNum();
		a.findDuplicate(num);
	}

}

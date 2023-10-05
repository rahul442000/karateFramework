package javaPrograms;

public class FindLargestNumber {

	public void largestNumber(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Largest Number is: "+arr[0]);
		System.out.println("Second largest Number is: "+arr[1]);
		System.out.print("Desending Order: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" , ");
		}
		System.out.println("");
		System.out.print("Asending Order: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" , ");
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {1,9,3,4,8,5,6,4,10,2};
		FindLargestNumber fln = new FindLargestNumber();
		fln.largestNumber(arr);

	}

}

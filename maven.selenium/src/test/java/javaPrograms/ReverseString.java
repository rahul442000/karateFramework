package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Rahul Soni";
		System.out.println("Actual Number: "+str);
		ReverseString rn = new ReverseString();
		rn.reverseString(str);

	}

	private void reverseString(String str) {
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse String: "+reverse);
	}

}

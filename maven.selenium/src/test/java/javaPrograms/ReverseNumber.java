package javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12341234;
		System.out.println("Actual Number: "+num);
		ReverseNumber rn = new ReverseNumber();
		rn.reverseNumber(num);

	}

	private void reverseNumber(int num) {
		int reverse = 0, number = num;
		while(number>0) {
			int rem = number%10;
			reverse = reverse*10  + rem;
			number = number/10;
		}
		System.out.println("Reverse Number: "+reverse);
	}

}

package javaPrograms;

public class SwapNumWithoutLoop {

	public static void main(String[] args) {
		int num1 = 15, num2 = 5;
		SwapNumWithoutLoop sn = new SwapNumWithoutLoop();
		sn.swapNumWithoutLoop(num1,num2);
	}

	private void swapNumWithoutLoop(int num1, int num2) {
		System.out.println("Before Swap First num : "+num1);
		System.out.println("Before Swap Second num : "+num2);
		num2 = num2 - num1;
		num1 = num2 + num1;
		num2 = num1 - num2;
		System.out.println("After Swap First num : "+num1);
		System.out.println("After Swap Second num : "+num2);
	}

}

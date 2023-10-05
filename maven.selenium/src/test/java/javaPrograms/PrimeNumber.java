package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.primeNumber(11);
	}

	private void primeNumber(int i) {
		boolean flag=true;
		for (int j=2;j<=i/2;j++) {	
			if(i%j==0) {
				flag = false;
				break;
			}
		}
		if (flag==true) {
			System.out.print(i+" is a Prime Number");
		}else{
			System.out.print(i+" is not a Prime Number");
		}
	}
}

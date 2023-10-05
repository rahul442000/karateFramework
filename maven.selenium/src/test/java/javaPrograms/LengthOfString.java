package javaPrograms;

public class LengthOfString {

	public static void main(String[] args) {
		String str = "My name is Rahul Soni";
		LengthOfString los = new LengthOfString();
		los.lengthOfString(str);
	}

	private void lengthOfString(String str) {
		String[] strArr = str.split("\\s"); 
		System.out.println("Length of String is :" +strArr.length);
	}

}

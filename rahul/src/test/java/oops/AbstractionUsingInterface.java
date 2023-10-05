package oops;

interface Animals{
	void walk();
}

class Cow implements Animals{
	public void walk(){
		System.out.println("Walk on 4 Legs");
	}
}

class Hen implements Animals{
	public void walk(){
		System.out.println("Walk on 2 Legs");
	}
}

public class AbstractionUsingInterface {

	public static void main(String[] args) {

		Hen h1 = new Hen();
		h1.walk();

		Cow c1 = new Cow();
		c1.walk(); 
		
	}
	
}

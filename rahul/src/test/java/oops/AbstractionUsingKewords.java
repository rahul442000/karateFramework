package oops;

abstract class Animal{
	abstract void walk();
}

class Horse extends Animal{
	public void walk(){
		System.out.println("Walk on 4 Legs");
	}
}

class Chicken extends Animal{
	public void walk(){
		System.out.println("Walk on 2 Legs");
	}
}

public class AbstractionUsingKewords {

	public static void main(String[] args) {

		Horse h1 = new Horse();
		h1.walk();

		Chicken c1 = new Chicken();
		c1.walk(); 
		
	}

}

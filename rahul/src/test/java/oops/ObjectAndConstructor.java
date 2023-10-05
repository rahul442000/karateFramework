package oops;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("Writing something");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}

class Student {
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student(){
		System.out.println("This is constructor.");
	  }
}

public class ObjectAndConstructor {

	public static void main (String args[]) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";
		pen1.write();
		
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ballpoint";
		
		
		pen1.printColor();
		pen2.printColor();
		
		Student s1 = new Student();
		s1.age = 21;
		s1.name = "Rahul";
		
		s1.printInfo();
	}
}

package p115;

public class Dog extends Animal{
	String name = "犬类";
	void shout() {
		super.shout();
	}
	void printName() {
		System.out.println("name=" + super.name);
	}
}

package test_this;

public class Dog extends Animal{
	public void setName(String name) {
		super.name = name;
	}
	public void showName() {
		System.out.println("My name is " + name);
	}
}

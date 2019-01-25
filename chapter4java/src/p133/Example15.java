package p133;

public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		animalShout(dog);
	}
	
	public static void animalShout(Animal animal) {
		Cat cat = (Cat)animal;
		cat.sleep();
		cat.shout();
	}
}

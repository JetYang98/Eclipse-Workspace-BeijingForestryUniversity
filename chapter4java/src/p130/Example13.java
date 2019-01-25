package p130;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an1 = new Cat();
		Animal an2 = new Dog();
		animalShout(an1);
		animalShout(an2);
	}
	
	public static void animalShout(Animal an) {
		an.shout();
	}

}

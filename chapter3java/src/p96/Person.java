package p96;

public class Person {
	String name;
	int age;
	public Person(String con_name, int con_age) {
		name = con_name;
		age = con_age;
	}
	public Person(String con_name) {
		name = con_name;
	}
	public void speak() {
		System.out.println("大家好，我叫" + name + ",我今年" + age + "岁了");
	}
}

package p105;

public class Example14 {
	static {
		System.out.println("Example14类中的静态代码块执行了");
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
	}
}

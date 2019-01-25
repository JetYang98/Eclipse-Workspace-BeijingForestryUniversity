package p188;

import java.util.LinkedList;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("stu1");
		link.add("stu2");
		link.add("stu3");
		link.add("stu4");
		System.out.println(link.toString());
		link.add(3, "Strudent");
		link.addFirst("First");
		System.out.println(link);
		System.out.println(link.getFirst());
		link.remove(3);
		link.removeFirst();
		System.out.println(link);
	}

}

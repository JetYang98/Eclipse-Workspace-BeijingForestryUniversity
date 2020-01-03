package p191;

import java.util.ArrayList;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Jack");
		list.add("Rost");
		list.add("Tom");
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}

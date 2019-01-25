package p208;

import java.util.HashMap;
import java.util.Map;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println("1:" + map.get("1"));
		System.out.println("2:" + map.get("2"));
		System.out.println("3:" + map.get("3"));

	}

}

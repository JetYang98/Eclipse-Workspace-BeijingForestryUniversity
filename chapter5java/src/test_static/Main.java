package test_static;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Market.name);
		System.out.println(Zone.name);
//		Zone.name = "区域";
//		System.out.println(Market.name);
//		System.out.println(Zone.name);
		Zone zo = new Zone();
		zo.name = "区域";
		System.out.println(Market.name);
		System.out.println(Zone.name);
		//Market.shout();
		//Zone.shout();
		Market mar = new Zone();
		mar.shout();
	}

}

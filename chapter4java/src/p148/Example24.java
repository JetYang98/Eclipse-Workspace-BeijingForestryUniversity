package p148;

public class Example24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = divide(4, 2);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static int divide(int x, int y) {
		int result = x / y;
		return result;
	}
}

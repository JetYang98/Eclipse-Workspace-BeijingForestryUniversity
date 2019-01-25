package p146;

public class Example21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int resule = divide(4, 0);
			System.out.println(resule);
		}
		catch(Exception e){
			System.out.println("捕获的异常信息为：" + e.getMessage());
		}
		System.out.println("程序继续向下执行...");
	}
	public static int divide(int x, int y) {
		int result = x / y;
		return result;
	}

}

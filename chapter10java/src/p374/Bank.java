package p374;

public class Bank {
	private int sum;
	public void add(int num) {
		synchronized(this) {
			sum = sum + num;
			System.out.println("账户的余额为：" + sum);
		}
	}
}

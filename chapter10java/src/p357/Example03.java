package p357;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		while(true) {
			System.out.println("main()方法在运行");
		}
	}

}
class MyThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println("MyThread类的run()方法在运行");
		}
	}
}
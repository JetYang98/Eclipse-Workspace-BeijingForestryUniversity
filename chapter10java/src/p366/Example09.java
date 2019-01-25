package p366;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new EmergencyThread(), "线程一");
		t.start();
		for(int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "输出：" + i);
			try {
				if (i == 2) {
					t.join();
				}
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
class EmergencyThread implements Runnable{
	public void run() {
		for(int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
package p363;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Task()).start();
		for(int i = 1; i <= 10; i++) {
			try {
				if (i == 5) {
					Thread.sleep(2000);
				} else {
					Thread.sleep(500);
				}
				System.out.println("main主线程正在输出：" + i);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}


class Task implements Runnable{
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				if (i == 3) {
					Thread.sleep(2000);
				} else {
					Thread.sleep(500);
				}
				System.out.println("线程一正在输出：" + i);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
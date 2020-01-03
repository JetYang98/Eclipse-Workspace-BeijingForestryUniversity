package p359;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow task = new TicketWindow();
		new Thread(task, "窗口1").start();
		new Thread(task, "窗口2").start();
		new Thread(task, "窗口3").start();
		new Thread(task, "窗口4").start();
	}

}


class TicketWindow implements Runnable{
	private int tickets = 100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(tickets > 0) {
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name + "正在发售第" + tickets-- + "张票");
			}
			else {
				break;
			}
		}
	}
	
}
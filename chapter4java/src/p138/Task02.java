package p138;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendTask task = new SendTask("HYX600235", 76.34);
		task.sendBefore();
		System.out.println("--------");
		ZTransportation t = new ZTransportation("Z024", "大奔", "小韩");
		Phone p = new Phone();
		task.send(t, p);
		System.out.println("--------");
		task.sendAfer(t);
		t.upKeep();
	}

}

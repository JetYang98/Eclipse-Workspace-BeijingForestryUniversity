package p126;

public class Mic implements USB{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("麦克风启动了..");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("麦克风关闭了..");
	}

}

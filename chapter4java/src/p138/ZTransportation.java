package p138;

public class ZTransportation extends Transportation implements Careable{
	public ZTransportation() {
		super();
	}
	public ZTransportation(String number, String model, String admin) {
		super(number, model, admin);
	}
	@Override
	public void upKeep() {
		// TODO Auto-generated method stub
		System.out.println("货物运输车辆保养完毕");
	}

	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("运输进行中..");
	}

}

package p123;

public class Dog implements Animal{

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println(ANIMAL_BEHAVIOR + "狗在呼吸");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(ANIMAL_BEHAVIOR + "狗在奔跑");
	}
	
}
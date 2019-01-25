package p124;

public class Dog implements LandAnimal{

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

	@Override
	public void liveOnLand() {
		// TODO Auto-generated method stub
		System.out.println("狗是陆地上的动物...");
	}
	
}

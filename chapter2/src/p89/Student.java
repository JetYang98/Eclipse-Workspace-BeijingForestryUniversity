package p89;

public class Student {
	String name;	//定义一个姓名属性
	int age;
	public void introduce() {
		//方法中打印属性name和age的值
		System.out.println("大家好，我叫" + name + "，我今年" + age + "岁！");
	}
}
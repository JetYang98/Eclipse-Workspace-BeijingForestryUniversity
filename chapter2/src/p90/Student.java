package p90;

public class Student {
	private String name;	//将name属性私有化
	private int age;
	//下面是公有的getXxx和setXxx方法
	public String getName() {
		return name;
	}
	public void setName(String stuName) {
		name = stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int stuAge) {
		//下面是对传入的参数进行检查
		if(stuAge <= 0) {
			System.out.println("对不起，您输入的年龄不合法...");
		}else {
			age = stuAge;
		}
	}
	public void introduce() {
		System.out.println("大家好，我叫" + name + "，我今年" + age + "岁。");
	}
}


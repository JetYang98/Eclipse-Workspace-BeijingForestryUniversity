package p232;

public class Books {
	int id;
	String name;
	double price;
	int number;
	double money;
	String Publish;
	public Books(int id, String name, double price, int number, double money, String Publish) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
		this.money = money;
		this.Publish = Publish;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "图书编号：" + id + " 图书名称：" + name + " 出版社：" + Publish + " 单价：" + price + " 库存数量：" + number;
		return message;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}

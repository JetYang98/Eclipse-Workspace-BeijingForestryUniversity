package p108;

public class Trade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank.bankName = "招商银行";
		Bank.welcome();
		Bank bank = new Bank("小梦", "654321", 100.0);
		bank.deposit(500.00);
		bank.withdrawal("123456", 200.0);
		bank.withdrawal("654321", 1000.0);
		bank.withdrawal("654321", 200.0);
		Bank.welcomeNext();
	}

}

package makeup.q10;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Mete", 100);
		System.out.println(acc);
		acc.deposit(100);
		acc.deposit(300);
		System.out.println(acc);
		acc.withdraw(50);
		System.out.println(acc);
		acc.withdraw(500);
		acc.withdraw(300);
		acc.deposit(400);
		acc.withdraw(200);
		System.out.println(acc);
		System.out.println(acc.getDepositCount());
		System.out.println(acc.getWithdrawCount());
		System.out.println(acc.getMaximumDeposit());
		System.out.println(acc.getNegativeBalanceCount());



	}

}

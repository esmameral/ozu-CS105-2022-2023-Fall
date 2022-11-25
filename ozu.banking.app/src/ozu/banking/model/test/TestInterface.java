package ozu.banking.model.test;

import ozu.banking.model.BankAccount;
import ozu.banking.model.CheckTransaction;
import ozu.banking.model.DepositTransaction;
import ozu.banking.model.EFTTransaction;
import ozu.banking.model.OwnerChange;
import ozu.banking.model.SalaryPaymentTransaction;
import ozu.banking.model.Transaction;
import ozu.banking.model.WithdrawTransaction;

public class TestInterface {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("Kerem",123);
		OwnerChange change=new OwnerChange("Kerem Can");
		
		Transaction t1 = new EFTTransaction(200.0, "aaa", 0.04);
		Transaction t2 = new DepositTransaction(10000.0);
		
		

	}

}

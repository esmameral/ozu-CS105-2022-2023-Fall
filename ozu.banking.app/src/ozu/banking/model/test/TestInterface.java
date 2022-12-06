package ozu.banking.model.test;

import ozu.banking.model.BankAccount;
import ozu.banking.model.DepositTransaction;
import ozu.banking.model.EFTTransaction;
import ozu.banking.model.OwnerChange;
import ozu.banking.model.Transaction;

public class TestInterface {

	public static void main(String[] args) {
		try {
		BankAccount myAccount = new BankAccount("Kerem",123);
		OwnerChange change=new OwnerChange("Kerem Can");
		
		
			Transaction t1 = new EFTTransaction(200.0, "aaa", 0.04);
			Transaction t2 = new DepositTransaction(10000.0);
			myAccount.post(t1);
			myAccount.post(t2);
			myAccount.post(change);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

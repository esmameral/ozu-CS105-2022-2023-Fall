package ozu.banking.model.test;

import ozu.banking.model.DebitTransaction;
import ozu.banking.model.EFTTransaction;
import ozu.banking.model.WithdrawTransaction;

public class TestTransactions {

	public static void main(String[] args) {
		EFTTransaction eft = new EFTTransaction(200.0, "aaa", 0.04);
		DebitTransaction debit = new DebitTransaction(100.0);
		WithdrawTransaction with = new WithdrawTransaction(200.0);

	}

}

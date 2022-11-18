package ozu.banking.model.test;

import ozu.banking.model.BankAccount;
import ozu.banking.model.CheckTransaction;
import ozu.banking.model.DepositTransaction;
import ozu.banking.model.EFTTransaction;
import ozu.banking.model.SalaryPaymentTransaction;
import ozu.banking.model.Transaction;
import ozu.banking.model.WithdrawTransaction;

public class TestTransactions {

	public static void main(String[] args) {
		Transaction eft = new EFTTransaction(200.0, "aaa", 0.04);
		Transaction deposit = new DepositTransaction(10000.0);
		Transaction with = new WithdrawTransaction(200.0);
		Transaction check= new CheckTransaction(50.0,"C001");
		Transaction s = new SalaryPaymentTransaction(20000.0);

		Transaction[] list=new Transaction[5];
		list[0]=eft;
		list[1]=deposit;
		list[2]=with;
		list[3]=check;
		list[4]=s;
		printTrx(list);
	   
		
		BankAccount acc=new BankAccount("Yasemin");
		acc.post(deposit);
		
		System.out.println(acc.getBalance());
		acc.post(eft);
		
		System.out.println(acc.getBalance());
		
		acc.post(with);
		System.out.println(acc.getBalance());
		
	
		
	}
	
	public static void printTrx(Transaction[] list) {
		 for (Transaction t : list) {
			 System.out.println(t.toString());
			}	
	}

}

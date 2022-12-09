package ozu.banking.model.test;

import ozu.banking.model.BankAccount;
import ozu.banking.model.CheckTransaction;
import ozu.banking.model.ContactInfo;
import ozu.banking.model.ContactInfoChange;
import ozu.banking.model.DepositTransaction;
import ozu.banking.model.EFTTransaction;
import ozu.banking.model.InsufficientBalanceException;
import ozu.banking.model.NegativeTransactionAmountException;
import ozu.banking.model.OwnerChange;
import ozu.banking.model.SalaryPaymentTransaction;
import ozu.banking.model.Transaction;
import ozu.banking.model.WithdrawTransaction;

public class TestTransactions {

	public static void main(String[] args) {
		try {
			BankAccount acc=new BankAccount("Yasemin");
			ContactInfo info=new ContactInfo("05324445566","kadikoy");
			acc.setContactInfo(info);

			Transaction eft = new EFTTransaction(200.0, "aaa", 0.04);
			Transaction deposit = new DepositTransaction(10000.0);
			Transaction deposit2 = new DepositTransaction(300.0);
			Transaction with = new WithdrawTransaction(200.0);
			Transaction check= new CheckTransaction(500.0,"C001");
			Transaction s = new SalaryPaymentTransaction(20000.0);

			Transaction[] list=new Transaction[5];
			list[0]=eft;
			list[1]=deposit;
			list[2]=with;
			list[3]=check;
			list[4]=s;
			//printTrx(list);
   
			OwnerChange oc=new OwnerChange("Arda");
			acc.post(oc);
			
			ContactInfoChange newInfo=new ContactInfoChange("05449998877", "MALTEPE");
			acc.post(newInfo);
			acc.post(deposit);
			acc.post(deposit2);
			
			acc.post(eft);
			acc.post(with);
			acc.post(s);
			acc.post(check);
			
			System.out.println("AVG:"+acc.getAvgDepositTrxAmount());
			Transaction maxTrx=acc.findMaxDepositTransaction();
			System.out.println("Max:"+maxTrx.getId()+"-"+maxTrx.getAmount());
			
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}catch (NegativeTransactionAmountException e2) {
			e2.printStackTrace();
		}
		
	
		
	}
	
	public static void printTrx(Transaction[] list) {
		 for (Transaction t : list) {
			 System.out.println(t.toString());
			}	
	}

}

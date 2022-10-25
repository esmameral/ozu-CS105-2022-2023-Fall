package week4.examples;

public class TestBankAccountWeek5 {

    public static void main(String[] args) {
        System.out.println("------------- Creating Bank Account instance -------------");

        BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.getAccountNumber());
        
        BankAccount myAccount2 = new BankAccount("Ali");
        System.out.println(myAccount2.getAccountNumber());
        
        
       if(myAccount instanceof BankAccount)
    	   System.out.println("a Bank Account ");
       else
    	   System.out.println("not a Bank Account ");
       
       //Object Operators
       BankAccount account1 = new BankAccount("ece");
       BankAccount account2 = new BankAccount("ece");
       account2.setAccountNumber(account1.getAccountNumber());
       System.out.println(account1==account2);
       //account1=account2;
       System.out.println(account1==account2);
       System.out.println(account1.equals(account2));

    	   
    }

}

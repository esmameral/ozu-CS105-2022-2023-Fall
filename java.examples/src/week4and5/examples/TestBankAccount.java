package week4and5.examples;

public class TestBankAccount {

    public static void main(String[] args) {
        System.out.println("------------- Creating Bank Account instance -------------");

        BankAccount myAccount = new BankAccount();
        myAccount.setOwner("Kerem Demircan");
        //myAccount.setBalance(4509); //setBalance is private
        System.out.println("Owner:"+myAccount.getOwner());;
        System.out.println("Balance:"+myAccount.getBalance());
        System.out.println("Account Number:"+myAccount.getAccountNumber());
        System.out.println();
        System.out.println("------------- Deposit/Withdraw Examples -------------");
        
        myAccount.deposit(900);
        System.out.println("After deposit:"+myAccount.getBalance());
        myAccount.withdraw(100);
        System.out.println("After withdraw:"+myAccount.getBalance());
        
        myAccount.withdraw(10000);
        System.out.println("After second withdraw:"+myAccount.getBalance());
        System.out.println();
        System.out.println("------------- Interest amount examples -------------");
        double interest=myAccount.computeInterestAmount(12.5, 7);
        
        
        System.out.println("Interest Amount(Original):"+interest);
        System.out.println("Interest Amount:"+myAccount.formatAmount(interest));
        
        //Find interest amount for 10000
        double interestNew=myAccount.computeInterestAmountFor(10000.0,12.5, 7);
        System.out.println("WHEN Amount:"+10000+" Rate:"+12.5+" Duration:"+7);
        System.out.println("INTEREST:"+interestNew);
        
        myAccount.withdraw(100.0);
        myAccount.deposit(300.0);
        
        //check balance value     
    }

}

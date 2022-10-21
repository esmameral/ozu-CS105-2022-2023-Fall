package week4.examples;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setOwner("Kerem Demircan");
        myAccount.setBalance(4509);

        double interest=myAccount.computeInterestAmount(12.5, 7);
        
        System.out.println(myAccount.getOwner());;
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getAccountNumber());
        System.out.println("Interest Amount(Original):"+interest);
        System.out.println("Interest Amount:"+myAccount.formatAmount(interest));
        
        //Find interest amount for 10000
        double interestNew=myAccount.computeInterestAmountFor(10000.0,12.5, 7);
        System.out.println("WHEN Amount:"+10000+" Rate:"+12.5+" Duration:"+7);
        System.out.println("INTEREST:"+interestNew);
        

    }

}

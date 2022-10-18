package week4.examples;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setOwner("Kerem Demircan");
        myAccount.setBalance(1000);

        System.out.println(myAccount.getOwner());;
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getAccountNumber());

    }

}

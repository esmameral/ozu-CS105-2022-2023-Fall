package ozu.banking.model.test;

import ozu.banking.model.BankAccount;

public class TestObjectMethods {

	public static void main(String[] args) {
		BankAccount myAccount1 = new BankAccount("Kerem",123);
		
		BankAccount myAccount2 = new BankAccount("Keremcan",123);
		System.out.println(myAccount1);
		System.out.println(myAccount2);
		System.out.println(myAccount2.hashCode());
		System.out.println(myAccount1.hashCode());
		System.out.println(myAccount1==myAccount2);
		System.out.println(myAccount1.equals(myAccount2));
		System.out.println(myAccount1.equals(null));
		System.out.println(myAccount1.equals("Ali"));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		
		
	}

}

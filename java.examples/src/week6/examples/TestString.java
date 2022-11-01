package week6.examples;

import week4and5.examples.BankAccount;

public class TestString {
public static void main(String[] args) {
	String name=new String("Ali Karadeniz");
	
	System.out.println(name.indexOf("Ka"));
	System.out.println(name.substring(0,3));
	System.out.println(name.toUpperCase());
	System.out.println(name.concat("Ozyegin"));
	name=name+ " "+" Welcome";
	
	
	StringBuffer buf=new StringBuffer("Hello");
	buf.append(" World !!");
	buf.replace(0, 4, "Hi");
	String result=buf.toString();
	System.out.println(result);
	System.out.println(System.currentTimeMillis());
	BankAccount acc=new BankAccount();
	System.out.println(acc.getClass().getName());
	System.out.println(acc.getClass().getSimpleName());
	System.out.println(name);
    System.out.println(name.substring(1, 2));
	

}
}

package week9.interfc.examples;

public class Person implements Policyable{

	@Override
	public Policy createPolicy() {
		System.out.println("Person Policy");
		return new Policy("Person");
	}

}

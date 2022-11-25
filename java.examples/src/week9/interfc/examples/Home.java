package week9.interfc.examples;

public class Home implements Policyable{

	@Override
	public Policy createPolicy() {
		System.out.println("Home Policy");
		return new Policy("Home Policy");
	}

}

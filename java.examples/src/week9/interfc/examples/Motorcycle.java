package week9.interfc.examples;

import java.io.Serializable;

public class Motorcycle extends Vehicle implements Policyable,Transferable,Serializable {


	private static final long serialVersionUID = -3934585870099561278L;

	@Override
	public Policy createPolicy() {
		System.out.println("Motorcycle Policy");
		return new Policy("Motorcycle Policy");
	}

	@Override
	public double getPrice() {
		
		return 100;
	}

}

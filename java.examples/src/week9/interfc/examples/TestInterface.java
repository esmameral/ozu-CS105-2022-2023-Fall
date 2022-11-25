package week9.interfc.examples;

public class TestInterface {

	public static void main(String[] args) {
		Home home=new Home();
		Motorcycle motor=new Motorcycle();
		Person p=new Person();
		
		Policyable[] arr=new Policyable[3];
		arr[0]=home;
		arr[1]=motor;
		arr[2]=p;
		for (Policyable policyable : arr) {
			Policy pol=policyable.createPolicy();
			//sendMail 
		}
		

	}

}

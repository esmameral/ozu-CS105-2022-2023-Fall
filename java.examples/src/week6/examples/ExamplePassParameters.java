package week6.examples;

public class ExamplePassParameters {

	public static void main(String[] args) {
		int value=5;
		Person p=new Person(1,"Elif");
		System.out.println("(A) p.id="+p.getId()+" p.name:"+p.getName()+" value:"+value);

		myMethod(p,value);
		System.out.println("(B) p.id="+p.getId()+" p.name:"+p.getName()+" value:"+value);
	
		String code="CS105";
		System.out.println("(before update) code:"+code);
		updateCode(code);
		System.out.println("(after update) code:"+code);
	
	}

	private static void updateCode(String code) {
		System.out.println("(inside method before update) code:"+code);
		code="CS101";
		System.out.println("(inside method after update) code:"+code);
		
	}

	private static void myMethod(Person p, int value) {
		System.out.println("(C) p.id="+p.getId()+" p.name:"+p.getName()+" value:"+value);
		
		p.setId(12);
		p.setName("Erdem");
		value=55;
		System.out.println("(D) p.id="+p.getId()+" p.name:"+p.getName()+" value:"+value);
	}

}

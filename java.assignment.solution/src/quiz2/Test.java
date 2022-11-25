package quiz2;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person(123,"Celal");
		Student p2=new Student(112,"Kemal","IE",2022);
		p2.setFee(20000.0);
		Person p3= new Staff(342,"Esra",12500.0);
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}
	

}
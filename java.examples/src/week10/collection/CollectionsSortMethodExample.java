package week10.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMethodExample {

	public static void main(String[] args) {
		Person p1 = new Person(3, "Kaan", 3000);
		Person p2 = new Person(32, "Ece", 5000);
		Person p3 = new Person(43, "Hasan", 8000);
		Person p4 = new Person(13, "Isa", 7000);
		List<Person> list=new ArrayList<>();
		list.add(p2);
		list.add(p1);
		list.add(p3);
		list.add(p4);
		
		System.out.println("-----BEFORE SORT------");
		for (Person person : list) {
			System.out.println(person);
		}
		Collections.sort(list);
		System.out.println("-----AFTER SORT------");
		for (Person person : list) {
			System.out.println(person);
		}
	}

	
	
	

}

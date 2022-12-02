package week10.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		Person p1 = new Person(3, "Kaan", 3000);
		Person p2 = new Person(32, "Ece", 5000);
		Person p3 = new Person(43, "Hasan", 8000);
		Person p4 = new Person(13, "Isa", 7000);
		Map<Integer, Person> list1=new HashMap<>();
		list1.put(p1.getId(),p1);
		list1.put(p2.getId(),p2);
		list1.put(p3.getId(),p3);
		list1.put(p4.getId(),p4);
		
		
		//System.out.println(list1.get(3));
		
		for (Map.Entry<Integer, Person> entry : list1.entrySet()) {
			Integer key = entry.getKey();
			Person val = entry.getValue();
			System.out.println(val);
		}
		
	}

}

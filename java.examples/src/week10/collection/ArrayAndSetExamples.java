package week10.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayAndSetExamples {

	public static void main(String[] args) {
		arrayListExample();
		hashSetExample();
		setExampleWithPerson();
		
	}
	private static void setExampleWithPerson() {
		Person p1 = new Person(3, "Kaan", 3000);
		Person p2 = new Person(32, "Ece", 5000);
		Person p3 = new Person(43, "Hasan", 8000);
		Person p5 = new Person(43, "Ali", 8000);
		Person p4 = new Person(13, "Isa", 7000);
		System.out.println(p3==p5);
		System.out.println(p3.equals(p5));
		
		HashSet<Person> list1=new HashSet<>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		list1.add(p4);
		list1.add(p5);
		for (Person person : list1) {
			System.out.println(person);
		}
		
	}
	private static void arrayListExample() {
		String name1 = "Veli";
		String name2 = "Zeki";
		String name3 = "Ece";
		String name4 = "İbo";
		List<String> names = new ArrayList<>();
		names.add(name1);
		names.add(name2);
		names.add(name3);
		names.add(name4);
		names.add(1, "Ertugrul");
		names.set(0, "Kaan");
		System.out.println(names.get(0));
		System.out.println(names.size());

		for (int i = 0; i < names.size(); i++) {
			System.out.println(i + ":" + names.get(i));

		}

		for (String aName : names) {
			System.out.println(aName);
		}
	}
	
	private static void hashSetExample() {
		String name1 = "Veli";
		String name2 = "Zeki";
		String name3 = "Ece";
		String name4 = "İbo";
		Set<String> names = new HashSet<>();
		names.add(name1);
		names.add(name2);
		names.add(name3);
		names.add(name4);
		names.add("Ertugrul");
		names.add("Kaan");
		names.add("Zeki");
		names.remove("Veli");

		for (String aName : names) {
			System.out.println(aName);
		}
		
	}

}

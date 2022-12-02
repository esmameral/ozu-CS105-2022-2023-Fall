package week10.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		sortedSetExample();
	}
	
	private static void sortedSetExample() {
		Person p1 = new Person(3, "Kaan", 3000);
		Person p2 = new Person(32, "Ece", 5000);
		Person p3 = new Person(43, "Hasan", 8000);
		Person p5 = new Person(43, "Hasan", 8000);
		Person p4 = new Person(13, "Isa", 7000);
		HashSet<Person> list1=new HashSet<>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		list1.add(p4);
		list1.add(p5);
		System.out.println("----------SET- NO ORDER----------");
		for (Person person : list1) {
			System.out.println(person);
		}
		System.out.println("----------TREESET-ORDER BY ID----------");
		TreeSet<Person> list2=new TreeSet<>();
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);
		list2.add(p4);
		for (Person person : list2) {
			System.out.println(person);
		}
		
		System.out.println("----------TREESET-ORDER BY SALARY----------");
		TreeSet<Person> list3=new TreeSet<>(new PersonSalaryComparator());
		list3.add(p1);
		list3.add(p2);
		list3.add(p3);
		list3.add(p4);
		for (Person person : list3) {
			System.out.println(person);
		}
	}

}

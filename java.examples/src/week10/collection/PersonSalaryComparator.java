package week10.collection;

import java.util.Comparator;

public class PersonSalaryComparator implements Comparator<Person> {


	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getSalary()>o2.getSalary())
			 return 1;
		 else if(o1.getSalary()<o2.getSalary())
			 return -1;
		 
		return 0;
	}

}

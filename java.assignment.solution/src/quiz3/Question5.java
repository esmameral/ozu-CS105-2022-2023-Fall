package quiz3;

import java.util.ArrayList;
import java.util.List;

public class Question5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("X");
		list.add("D");
		list.add("B");
		list.add(1,"K");
		list.remove(0);
		list.set(2, "L");
		for (String a : list) {
			System.out.print(a+" ");
		}
	}

}

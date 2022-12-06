package week11.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestException {

	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 2 };
			// System.out.println(numbers[1]+" "+numbers[2]);

			String a = "a";
			System.out.println(a.toUpperCase());
			ArrayList<String> names = new ArrayList();
			names.add("ali");
			names.add("esra");

			for (int i = 0; i < names.size(); i++) {
				String aName = (String) names.get(i);
				System.out.println(aName.toUpperCase());
			}
				method1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		

	}
	public static void method1() throws FileNotFoundException {
		method2();
	}
	public static void method2() throws FileNotFoundException {
		method3();
	}
	public static void method3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(new File("a.txt"));
	}
	

}

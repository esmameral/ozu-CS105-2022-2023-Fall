package quiz1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer value:");
		int N=input.nextInt();
		boolean number13Found=false;
		for (int i = 1; i <=N; i++) {
			int newNumber=10+(int)(Math.random()*10);
			System.out.println("next number:"+newNumber);
			if(newNumber==13)
				number13Found=true;
		}
		if(number13Found)
			System.out.println("We saw at least one 13!");
		else
			System.out.println("No 13 was seen");

	}

}

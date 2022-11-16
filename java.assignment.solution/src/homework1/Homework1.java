package homework1;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		 question1();
		// question2();

	}

	private static void question2() {
		Scanner input = new Scanner(System.in);
		int computerWinCount = 0;
		int userWinCount = 0;
		int gameCount = 1;
		int maxGameCount = 0;
		while (true) {
			int random = (int) (Math.random() * 3);
			System.out.println(random);
			
			System.out.print("Game (" + gameCount + "):");
			System.out.print("Enter your choice (scissors:0, rock:1, paper:2) ?");
			int userChoice = input.nextInt();
			
			switch (userChoice) {
			case 0:
				System.out.print("You choose SCISSORS. ");
				break;
			case 1:
				System.out.print("You choose ROCK. ");
				break;
			case 2:
				System.out.print("You choose PAPER. ");
				break;
			default:
				System.out.println("Enter a valid choice (0,1,2) !");
				continue;
			}
			switch (random) {
			case 0:
				System.out.print("The computer chooses SCISSORS. ");
				break;
			case 1:
				System.out.print("The computer chooses ROCK. ");
				break;
			case 2:
				System.out.print("The computer chooses PAPER. ");
				break;
			}
			
			if (userChoice==random) {
				System.out.println("It is a draw");
				computerWinCount = 0;
				userWinCount = 0;
			} else if ((userChoice==1 && random==0)
					|| (userChoice==0 && random==2)
					|| (userChoice==2 && random==1)) {
				System.out.println("You win");
				userWinCount++;
				computerWinCount = 0;
			} else {
				System.out.println("Computer wins");
				computerWinCount++;
				userWinCount = 0;
			}
			
			if (computerWinCount == 3) {
				System.out.println("* * * Game over. Computer won 3 times * * *");
				break;
			} else if (userWinCount == 3) {
				System.out.println("* * * Game over. User won 3 times * * *");
				break;
			}
			maxGameCount++;
			if (maxGameCount >= 15) {
				System.out.println();
				System.out.println("* * * GAME OVER. NO WINNER * * *");
				break;
			}
			gameCount++;
		}
	}

	private static void question1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines([1-9]");

		int numberOfLines = sc.nextInt();
		int a = numberOfLines;

		if (a >= 1 && a <= 9) {

			for (int i = 1; i <= numberOfLines; i++) {

				if (i > 1) {
					for (int x = i; x > 1; x--) {
						System.out.print(" ");
					}
				}

				for (int j = a; j > 0; j--) {
					System.out.print(j);
				}

				for (int k = 2; k <= a; k++) {

					System.out.print(k);
				}

				System.out.println();
				a--;
			}
		} else {
			System.out.println("You must enter a number between 1 and 9 !!");

		}
	}

}

package midterm.others;

public class Question5to7 {

	public static void main(String[] args) {
		// Q5
		int sum = 0;
		int k = 1;
		while (sum < 12 || k < 4)
		sum += k;
		k++;
		System.out.println(sum);

		// Q6
//		for (int k = 1; k <= 100; k++)
//			if ((k % 4) == 0)
//				System.out.println(k);
//
//		for (int k = 4; k <= 100; k = k + 4)
//			System.out.println(k);

		// Q7:
		int x = 7, y = 3;
		int z = x / y + x % y;
		if (z == x)
			y++;
		if (z == y)
			x++;
		System.out.println(x + " " + y + " " + z);

	}

}

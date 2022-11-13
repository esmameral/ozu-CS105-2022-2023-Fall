package midterm.q4;

public class ArrayTest {

	public static void main(String[] args) {
System.out.println(sumArray());
	}

	public static int sumArray() {
		int[] key = { 1, 1, 1 };
		int sum = 0;
		for (int i = 1; i <= key.length; i++) {
			sum += key[i -1];
		}
		return sum;
	}

}

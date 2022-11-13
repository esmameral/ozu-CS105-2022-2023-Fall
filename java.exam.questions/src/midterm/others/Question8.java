package midterm.others;

public class Question8 {
	public static void main(String[] args) {
		int x = 13;
		strange(x);
		System.out.println("x = " + x);
	}

	public static void strange(int x) {
		x++;
		System.out.println("x = " + x);
		x++;
	}
}

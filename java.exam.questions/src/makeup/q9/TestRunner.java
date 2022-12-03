package makeup.q9;

public class TestRunner {

	public static void main(String[] args) {
		Runner firstRunner = new Runner(1, 99);
		System.out.println(firstRunner);
		Runner.variable1 = 99;
		Runner secondRunner = new Runner();
		System.out.println(secondRunner);

	}

}

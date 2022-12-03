package makeup.q9;

public class Runner {
	static public int variable1=3;
	static public int variable2=5;

	public Runner() {
	}

	public Runner(int a, int b) {
		variable1 = a;
		variable2 = b;
	}

	public String toString() {
		return variable1 + " " + variable2;
	}
}

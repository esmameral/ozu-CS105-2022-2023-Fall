package midterm.q13;

public class Question13 {

	public static void main(String[] args) {
		int[][] arr = { { 2, 1, 0 }, { 1, 3, 2 }, { 0, 0, 0 }, { 4, 5, 6 } };
		int zeroRowCount = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean isAllZero = true;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != 0) {
					isAllZero = false;
					break;
				}
			}
			if (isAllZero)
				zeroRowCount++;
		}
		System.out.println(zeroRowCount);
	}	
}

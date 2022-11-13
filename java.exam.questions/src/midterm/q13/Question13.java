package midterm.q13;

public class Question13 {

	public static void main(String[] args) {
		int[][] arr = {{ 0,0,0 }, { 1, 2, 3, 4, 5 }, { 0,0,0,0,0 },{ 11, 3, 8, 9, 12 }, { 22, 33, 44, 1, 98 } };
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

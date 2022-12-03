package makeup.q13;

public class Question13 {

	public static void main(String[] args) {
		

		int[][] arr1 = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}};
		int[][] arr2 = {{2, 0, 0}, {12, 4, 2}, {10, 0, 0}, {4, 5, 6}};
		int[][] arr3 = { { 2, 12, 10 }, { 2, 8, 2 }, { 0, 0, 0 }, { 4, 52, 6 } };
		System.out.println(loopArray(arr1));
		System.out.println(loopArray(arr2));
		System.out.println(loopArray(arr3));
	
	}



	
	private static int loopArray(int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] % 2 == 1) {
					count++;
					break;
				}
			}


		}
		return count;
	}
}

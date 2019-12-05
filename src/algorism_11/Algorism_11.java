package algorism_11;

public class Algorism_11 {

	public static void main(String[] args) {

		/*
		 * 	1  2  3  4  5 
		 * 10  9  8  7  6 
		 * 11 12 13 14 15 
		 * 20 19 18 17 16 
		 * 21 22 23 24 25
		 * 
		 * 위의 패턴으로 입력된 수만큼의 행 과 열을 만드시오
		 */

		int inputNum = 5;
		int arr[] = new int[inputNum + 1];
		int count = 1;
		for (int j = 1; j <= inputNum; j++) {
			if (j % 2 != 0) {
				for (int i = 1; i <= inputNum; i++) {
					arr[i] = count;
					count++;
				}
				for (int k = 1; k <= inputNum; k++) {
					System.out.printf("%4d", arr[k]);
				}

			} else {
				for (int i = 1; i <= inputNum; i++) {
					arr[i] = count;
					count++;
				}
				for (int k = 1; k <= inputNum; k++) {
					System.out.printf("%4d", arr[inputNum - k + 1]);
				}
			}
			System.out.println();
		}
		//============================= ������ Ǯ�� ===============================
		int n = 5;
		int arrNum[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arrNum[i][j]= i*n+j+1;
				}
			} else {
				for (int j = n-1; j >=0; j--) {
					arrNum[i][j]= i*n+n-j;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", arrNum[i][j]);
			}
		System.out.println();
		}
	}

}

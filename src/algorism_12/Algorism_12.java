package algorism_12;

public class Algorism_12 {

	public static void main(String[] args) {
		
		/*
		 * 입력된 n의 수만큼 n행 n열의 형태로 보기처럼 숫자를 출력하시오
		 * 보기
		 * n=4
		 * 1  5  9   13
		 * 2  6  10  14
		 * 3  7  11  15
		 * 4  8  12  16
		 * 
		 */
		int n = 4;
		int arr[][] = new int [n+1][n+1];
		int count = 1;
//		for (int i = 1; i <= n; i++) {
//			count=i;
//			for (int j = 1; j <= n; j++) {
//				arr[i][j] = count;
//				count+=n;
//			}
//		}

		
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				System.out.printf("%4d", arr[i][j]);
//			}
//		System.out.println();
//		}
		
		//=====================================================================
		
		int arrNum[][] = new int [n][n];
		for (int i = 0; i < n; i++) {	// 행
			for (int j = 0; j < n; j++) {	// 열
				arrNum[j][i] = count;
				count++;
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

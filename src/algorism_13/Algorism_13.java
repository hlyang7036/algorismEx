package algorism_13;

public class Algorism_13 {

	public static void main(String[] args) {
		
		/*
		 * 입력된 n의 수만큼의 n행 n열의 형태로 보기처럼 숫자를 출력하시오
		 * 
		 * n=4;
		 * 1  2  3  4
		 * 2  4  6  8
		 * 3  6  9  12
		 * 4  8  12 16
		 * 
		 */
		
		
//		int n = 4;
//		int count = 1;
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				count  = i*j; 
//				
//				System.out.printf("%4d",count);
//			}
//			System.out.println();
//		}
		
		int n = 4;
		int arr[][] = new int [n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (i+1)*(j+1);
			}
		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}

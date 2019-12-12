package algorism_16;

public class Algorism_16 {

	public static void main(String[] args) {
		/*
		 * 입력받은 n행만큼 별을 보기처럼 그리시오
		 * n=5
		 * *
		 * **
		 * ***
		 * ****
		 */
		
		int n=5;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <i+1 ; j++) {	// n행에는 n개의 갯수만큼의 별이 찍힌다
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

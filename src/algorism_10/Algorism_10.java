package algorism_10;

public class Algorism_10 {
	
	/*
	 * 입력된 n만큼 n행 n열의 형태로 연속되는 숫자 사각형을 출력하시오
	 * 보기
	 * 1  2  3  4
	 * 5  6  7  8
	 * 9  10 11 12
	 * 13 14 15 16
	 * */
	
	public static void main(String[] args) {
		
		int inputNum = 5;
		
		int count = 1;
		for (int j = 1; j <=4; j++) {	// ex 2행 =
			for (int i = 1; i <=5 ; i++) {	// ex 5열 ㅣㅣㅣㅣㅣ
				System.out.print(i);
				System.out.print(j);
				System.out.printf("%4d", count);
				System.out.print(" ");
				count ++;
			}
			System.out.println();
		}
		
	}

}

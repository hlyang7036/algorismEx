package algorism_15;

public class Algorism_15 {

	public static void main(String[] args) {
		/*
		 * 입력된 수 n1 부터 n2까지 구구단을 출력하시오
		 * ex) n1=2 n2=3
		 * 2*1=1   3*1=3
		 *  ~	    ~
		 * 2*9=18  3*9=27
		 * 
		 */
		int n1=2;
		int n2=8;
		for (int i = 1; i < 10; i++) {
			for (n1=2; n1 <= n2; n1++) {
				System.out.print(n1+" * "+i+"= "+n1*i+"  ");
				
			}
			System.out.println();
		}
	}

}

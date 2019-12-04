package algorism_8;

public class Algorism_8 {

	public static void main(String[] args) {
		int inputNum = 5;
		int mok = 1;
		
		for (int i = 1; i <= inputNum; i++) {
			mok *= i;	// mok = mok*i
			
		}
		System.out.println(mok);
		
		mok=1;
		for (int i = inputNum; i >= 1; i--) {
			mok *= i;	// mok = mok*i
			
		}
		System.out.println(mok);
	}

}

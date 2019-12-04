package algorism_9;

public class Algorism_9 {

	public static void main(String[] args) {
	
		int inputNum = 1242;
		int accSum = 0;
		
		while (inputNum>0) {
			accSum += inputNum%10;	// inputNum의 나머지 값을 accSum에 저장후 더함
			inputNum /=10;			// inputNum을 10으로 나누면 소수점은 사라져서 124가 되고 124를 inputNum에 저장함
			System.out.println(accSum);
		}
		System.out.println(accSum);
		
	}

}

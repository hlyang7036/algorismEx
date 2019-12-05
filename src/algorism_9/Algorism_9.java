package algorism_9;

public class Algorism_9 {

	public static void main(String[] args) {
	
		int inputNum = 1242;
		int accSum = 0;
		
		while (inputNum>0) {
			accSum += inputNum%10;	// inputNum 입력된 수를 10으로 나눈 나머지를 accSum으로 저장
			inputNum /=10;			// inputNum 입력된 수를 10으로 나누어 소수점이 되는 가장 뒷 수를 버림 
			System.out.println(accSum);	// int는 정수만을 표현가능한 자료형이다
		}
		System.out.println(accSum);
		
	}

}

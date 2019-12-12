package algorism_14;

public class Algorism_14 {

	public static void main(String[] args) {
		
		int n = 421314218;
		int arr[] = new int [10];
		
		for (; n>0; ) {
			arr[n%10]++;	// n을 10으로 나눈 나머지 값의 인덱스 값을 1만큼 증가시켜라
			n/=10;			// 이후에 n의 값을 10으로 나누면 소수점이 생기는데 
							// int는 소수점을 표현하지 못함 그래서 마지막 자리수는 버리게됨
			
		}
		
//		while (n > 0) {	// while문으로 표현
//			arr[n%10]++;
//			n/=10;
//		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr"+"[ "+i+" ]"+arr[i]);
		}

	}

}

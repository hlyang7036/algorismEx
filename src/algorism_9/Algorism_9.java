package algorism_9;

public class Algorism_9 {

	public static void main(String[] args) {
	
		int inputNum = 1242;
		int accSum = 0;
		
		while (inputNum>0) {
			accSum += inputNum%10;	// inputNum�� ������ ���� accSum�� ������ ����
			inputNum /=10;			// inputNum�� 10���� ������ �Ҽ����� ������� 124�� �ǰ� 124�� inputNum�� ������
			System.out.println(accSum);
		}
		System.out.println(accSum);
		
	}

}

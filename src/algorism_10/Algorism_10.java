package algorism_10;

public class Algorism_10 {
	
	/* �Էµ� n�� ������ŭ n��� n���� ���·� ���ӵǴ� ���� ����Ͻÿ� */
	
	public static void main(String[] args) {
		
		int inputNum = 5;
		
		int count = 1;
		for (int j = 1; j <=4; j++) {	// ex �� 2�� = 
			for (int i = 1; i <=5 ; i++) {	// ex �� 5�� �ӤӤӤӤ�
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

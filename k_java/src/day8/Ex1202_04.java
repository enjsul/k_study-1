package day8;

public class Ex1202_04 {

	public static void main(String[] args) {
		// 1. [10,5] 2���� �迭 ����
		//    �迭�� 1-50���� ������� ���ڸ� �Է��ϰ� ���!
		// 2. �������� ���ڸ� �ְ� ���!(�ߺ�����)
		int[][] score = new int[10][5];
		int[] arr = new int[50];
		for(int i=0;i<50;i++) {
			arr[i] = i+1;
		}
		int temp=0;
		int a_j=0;
		for(int i=0;i<200;i++) {
			a_j = (int)(Math.random()*50); // 0-49
			temp = arr[0];
			arr[0] = arr[a_j];
			arr[a_j] = temp;
		}
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = (score[i].length*i)+j+1; //1,2,3,...45
//				score[i][j] = (int)(Math.random()*50)+1; //�������� �ߺ�����
				score[i][j] = arr[score[i].length*i+j]; //�������� �ߺ��Ұ�
				// arr[0],arr[1],arr[2],arr[3]....arr[49]
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		// 3. 1���� �迭�� ���� 1-50���� ���������� ���� �Է��ϰ�
		//    �������� ��� �Էµ� �迭 ���ڸ� 2�����迭�� �ְ� ���!
		//    (�ߺ��Ұ���)
		
		// 4. 30�� �Է¹����� [5,4] ��ġ���� ����Ͻÿ�.
		// 5. [3,4] -> ��ǥ�� 0���� �ԷµǾ ��� ���� ����Ͻÿ�.

	}

}

package day8;

public class Ex1202_03 {

	public static void main(String[] args) {
		//[9,5] �迭�� ���� 1-45���� ���ڸ� �Է��ϰ� ����Ͻÿ�.
		int[] temp_s = new int[45];
		for(int i=0;i<45;i++) {
			temp_s[i] = i+1;
		}
		int temp=0;
		int temp_j=0;
		for(int i=0;i<200;i++) {
			temp_j = (int)(Math.random()*45); // 0-44
			temp = temp_s[0];
			temp_s[0] = temp_s[temp_j];
			temp_s[temp_j] = temp;
		}
		
		int[][] score = new int[9][5];
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				score[i][j] = temp_s[(5*i)+j]; // temp_s[0-44]
//				score[i][j] = (int)(Math.random()*45+1);//�ߺ�����
//				score[i][j] = (5*i)+j+1; //1-45
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		// �������ڸ� �־����.(�ߺ��Ұ���)
		
		
		
		
		
		//1�� �Է¹޾� �迭�� ���°�� �ִ��� ����Ͻÿ�.
		// 44 -> [8,3]

	}

}

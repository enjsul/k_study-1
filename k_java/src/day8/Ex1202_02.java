package day8;

public class Ex1202_02 {

	public static void main(String[] args) {
		// 7,5 -> 1-35���� �������ڸ� �־�ÿ�.(�ߺ��Ұ���)
		int[][] score = new int[7][5];
		//1�����迭 -> 1-35���� ���ڸ� �Է� -> �������� 
		
		
		int[] arr = new int[35];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		int temp=0;
		int arr_j=0;
		for(int i=0;i<200;i++) {
			arr_j = (int)(Math.random()*35);
			temp = arr[0];
			arr[0] = arr[arr_j];
			arr[arr_j] = temp;
		}
		// ���ڳֱ�
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][j] = arr[(score[i].length*i)+j];
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		// 10,5 1-50���� ���ڸ� �Է��ϰ� ����Ͻÿ�.
//		int[][] score = new int[10][5];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = (score[i].length*i)+j+1;
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
//		int[][] score = new int[5][3];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j]=(3*i)+j+1; 
//				//i=0 1,2,3 i=1 4,5,6 i=2 7,8,9 
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		// 1���� �迭
//		int[] arr = new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = i+1;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		

	}

}

package day7;

public class Ex1201_07 {

	public static void main(String[] args) {
		
		// 50�� �迭 
		// 1-50���� �Է� -> �������� ����
		// 100�� �迭 -> �����ؼ� ����Ͻÿ�.
		int[] number = new int[50];
		int[] newNumber = new int[100];
		//���������� ���ڳֱ�
		for(int i=0;i<number.length;i++) {
			number[i] = i+1;
		}
		
		int temp=0;
		int j=0;
		// ���� ����
		for(int i=0;i<200;i++) {
			j = (int)(Math.random()*50);
			temp = number[0];
			number[0]=number[j];
			number[j]=temp;
		}
		// �迭����
		for(int i=0;i<number.length;i++) {
			newNumber[i] = number[i];
		}
		// �迭 ���
		for(int i=0;i<50;i++) {
			System.out.println(newNumber[i]);
		}
		
		
		
//		int[] number = {1,2,3,4,5};
//		int[] newNumber = new int[10];
//		
//		for(int i=0;i<number.length;i++) {
//			newNumber[i] = number[i];
//		}
//		
//		for(int i=0;i<newNumber.length;i++) {
//			System.out.print(newNumber[i]+" ");
//		}

	}

}

package day18;

public class Number {
	static int[] arr = new int[10]; //Ŭ���� ����
	
	static{
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1; //1-10
		}
		
	}//Ŭ���� �ʱ�ȭ��
	
	//������
	Number(){
		
	}

}

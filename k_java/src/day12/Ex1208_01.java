package day12;

public class Ex1208_01 {
	

	public static void main(String[] args) {
		//���� ���α׷�
		int num1=20,num2=10;
		int result=0;
		result = add(num1,num2); //return 30
		System.out.println("����� :"+result);
		
		int num3=30,num4=20;
		add(num3,num4);
		
		int num5=40,num6=2;
		add(num5,num6);
		
		int num7=100,num8=25;
		add(num7,num8);
//		result=num7+num8;
//		System.out.println("����� :"+result);
		
	}//main
	
	//�޼ҵ� 1�� -> �����޼ҵ�
	public static int add(int num1,int num2){
		return num1+num2;
	}
	
	
	
}//class

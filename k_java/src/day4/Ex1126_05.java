package day4;
import java.util.Scanner;

public class Ex1126_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1��° ���ڸ� �Է��ϼ���.>>");
		int num1 = scan.nextInt();
		System.out.println("2��° ���ڸ� �Է��ϼ���.>>");
		int num2 = scan.nextInt();
		System.out.println("+,-,*,/ �� 1���� �Է��ϼ���.>>");
		char op = scan.next().charAt(0);
		
		int result=0;
		switch(op) {
		case '*':
			result = num1 * num2;
			//50
		case '+':
			result = num1 + num2;
			//15
		case '-':
			result = num1 - num2;
			//5
		case '/':
			result = num1 / num2;
			//2
			break;
		}
		System.out.println(result);
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϼ���.");
//		int input = scan.nextInt();
//		switch(input) {
//			case 1: case 7:
//			System.out.println("SK");
//		    break;
//		    
//			case 6:
//			case 8:
//			System.out.println("KTF");
//			break;
//			
//			case 9:
//			System.out.println("LG");	
//		    break;
//		    
//		    default:
//		    	System.out.println("�߸��Է��ϼ̽��ϴ�.");
//		    	break;
//		
//		}

	}

}

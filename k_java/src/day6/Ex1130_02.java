package day6;

public class Ex1130_02 {

	public static void main(String[] args) {
		// 1~500���� ���ϴ� ���α׷�����
		// 300�� �Ѵ� ������ �󸶱��� ���ؾ� �ϴ���? �� ���� �հ谪�� ����Ͻÿ�.
		// while
		
		int sum=0;
		int i=1;
		while(i<=500) {
			sum = sum + i;
			if(sum>=300) {
				break;
			}
			i++;
		}
		
		System.out.println("i�� �� : "+i);
		System.out.println("sum�� �� : "+ sum);
		
		
//		int sum = 0;
//		int i=0;
//		for(i=1;i<=500;i++) {
//			sum = sum + i;
//			if(sum>=300) {
//				break;
//			}
//			System.out.println("i : "+i);
//			System.out.println("sum : "+sum);
//		}
//		System.out.println("i�� �� : "+ i);
//		System.out.println("sum�� �� : "+sum);
		

	}

}

package day19;

import java.util.Scanner;

public class Ex1217_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 직사각형 구하는 넓이공식 ( x좌표 2개, y좌표 2개 )
		// 직선 길이 : 2개를 입력받아 넓이를 구하시오.
		Point[] p = new Point[2];
		System.out.println("x 좌표 2개를 입력하세요.>>");
		p[0] = new Point();
		p[1] = new Point();
		p[0].x = scan.nextInt();
		p[1].x = scan.nextInt();
		System.out.println("y 좌표 2개를 입력하세요.>>");
		p[0].y = scan.nextInt();
		p[1].y = scan.nextInt();
		
		// 밑변(x0-x1) * 높이(y0-y1)
		double result1 = Math.abs(p[0].x-p[1].x); //절대값
		double result2 = Math.abs(p[0].y-p[1].y);
		double result = result1 * result2;
		
		System.out.println("넓이 : "+result);
		System.out.printf("1좌표 : %d,%d \n",p[0].x,p[0].y);
		System.out.printf("2좌표 : %d,%d \n",p[0].x,p[1].y);
		System.out.printf("3좌표 : %d,%d \n",p[1].x,p[0].y);
		System.out.printf("4좌표 : %d,%d \n",p[1].x,p[1].y);
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("두 직선길이를 입력하세요.>>");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println("직사각형의 넓이 : "+a*b);

	}

}

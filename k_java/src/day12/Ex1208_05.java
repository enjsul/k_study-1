package day12;

import java.util.Scanner;

public class Ex1208_05 {

	public static void main(String[] args) {
		// Student �迭 - s���������� 3�� ����
		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[3];
		for(int i=0;i<s.length;i++) {
			s[i] = new Student();
			System.out.println((i+1)+"��° ��ȣ�� �Է��ϼ���.>>");
			s[i].stu_num=scan.nextInt();
			scan.nextLine();
			System.out.println("�̸��� �Է��ϼ���.>>");
			s[i].name=scan.nextLine();
			System.out.println("���������� �Է��ϼ���.>>");
			s[i].kor_score=scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			s[i].eng_score=scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			s[i].math_score=scan.nextInt();
			s[i].total=s[i].kor_score+s[i].eng_score+s[i].math_score;
			s[i].avg=s[i].total/3.0;
			s[i].rank=0;
		}
		
		//���-s1��
		for(int i=0;i<s.length;i++) {
			int rank_count=1;
			for(int j=0;j<s.length;j++) {
				if(s[i].total<s[j].total) {
					rank_count++;
				}
			}
			s[i].rank=rank_count;
		}
		
		System.out.println("[���� ���α׷�]");
		for(int i=0;i<s.length;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%.2f \n",s[i].stu_num,s[i].name,s[i].kor_score,s[i].total,s[i].avg);
		}
		

	}

}

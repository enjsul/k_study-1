package day18;

public class English {
	// car,answer,house,subway,boy,girl,dog,family,man,woman
	// ��,����,��,����ö,�ҳ�,�ҳ�,��,����,����,����
	static String[][] eng = {  //[10][2]
		{"car","��"},{"answer","����"},{"house","��"},	
		{"subway","����ö"},{"boy","�ҳ�"},{"girl","�ҳ�"},
		{"dog","��"},{"family","����"},{"man","����"},{"woman","����"}
	};
	
	static { //�ʱ�ȭ��
		String[][] temp = new String[1][2]; //�ӽ����庯��
		for(int i=0;i<100;i++) {
			// eng 0��° -> temp, ���� -> 0, temp -> ����
			int r = (int)(Math.random()*10); //0-9���� ��������
			temp[0][0] = eng[0][0];//����-car
			temp[0][1] = eng[0][1];//�ѱ�-��
			eng[0][0] = eng[r][0];
			eng[0][1] = eng[r][1];
			eng[r][0] = temp[0][0];
			eng[r][1] = temp[0][1];
		}//for
		
	}//�ʱ�ȭ��
	

}

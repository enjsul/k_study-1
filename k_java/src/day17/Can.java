package day17;

public class Can {
	static int count;
	static int d_count;
	{
		++count; //count = count+1;
		s_no = count;
	}
	Can(){
		
	}
	
	Can(String name){
		this.d_no = d_no;
		this.name = name;
	}
	
	
	// ���̴�,�ݶ�,�̶���
	int s_no; // ���������� 1�� ����
	String d_no; // s001,c001,m001
	String name; // ���̴�,�ݶ�,�̶���
	int size; //ũ��
	
	void add() {
		System.out.println(size);
	}

}

package day17;

public class Product {
	static int count=0; //��ü������ ������ ���� �Բ� ����ϴ� ����
	
	Product(){
		count=count+1;
		serialNo = count;
	}
	
	int serialNo;    //������ȣ 0001
	String pro_no;      //��ǰ��ȣ t001,w001,d001,r001,s001
	String pro_name; //��ǰ�� - TV,��Ź��,������,�����,��Ÿ�Ϸ�
	int size;        //ũ��
	
	

}

package day17;

public class Drink {
	static int s_count;  //serialNo
	static int p_count; //p_num-����ݶ�
	static int m_count; //p_num-�̶���
	static int o_count; //p_num-������
	static int d_count; //p_num-���ڿ�
	
	Drink(){ }
	
	Drink(String drink_name){
		s_count++;
		this.serialNo = "s" + String.format("%04d", s_count);
		
		// s001 1.����ݶ�-p001 2.�̶���-m001 3.������-o001 4.���ڿ�-d001
		switch(drink_name) {
		case "����ݶ�":
			p_count++; //����ݶ���ǰ��ȣ
			this.p_num = "p" + String.format("%04d", p_count);
			this.drink_name=drink_name;
			this.sale_price=1000;
			this.cost=300;
			break;
		case "�̶���":
			m_count++; //����ݶ���ǰ��ȣ
			this.p_num = "m" + String.format("%04d", m_count);
			this.drink_name=drink_name;
			this.sale_price=800;
			this.cost=200;
			break;
		case "������":
			o_count++; //����ݶ���ǰ��ȣ
			this.p_num = "o" + String.format("%04d", o_count);
			this.drink_name=drink_name;
			this.sale_price=900;
			this.cost=250;
			break;
		case "���ڿ�":
			d_count++; //����ݶ���ǰ��ȣ
			this.p_num = "d" + String.format("%04d", d_count);
			this.drink_name=drink_name;
			this.sale_price=900;
			this.cost=250;
			break;	
			
		}
	}
	
	
	String serialNo; // ����Ḧ �����ص� 1�� ���� - s001
	String p_num; // 1.����ݶ�-p001 2.�̶���-m001 3.������-o001 4.���ڿ�-d001 
	String drink_name;
	int sale_price;
	int cost;

}

package day19;

public class Trangle extends Shape {
	Point[] p; //������ 3��
	
	Trangle(Point[] p){
		this.p = p;
	}
	
	Trangle(Point p1,Point p2,Point p3){
		p = new Point[] {p1,p2,p3}; 
	}

}

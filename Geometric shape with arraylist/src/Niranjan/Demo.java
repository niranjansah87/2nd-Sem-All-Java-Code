package Niranjan;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setLength(10);
		r.setWidth(10);
		Circle c=new Circle();
		c.setRadius(7);
		
		ArrayList<Rectangle>rec=new ArrayList<Rectangle>();
		
		rec.add(r);
	
		//System.out.println(rec);
		ArrayList<Circle>cir=new ArrayList<Circle>();
		cir.add(c);
		//System.out.println(cir);
		
		

	}

}

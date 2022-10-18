package areaCalculation;

import java.util.ArrayList;

public class AreaOfRectangle extends Area {

	public float length, breadth;
	
	public AreaOfRectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public float area() {
		float area = length * breadth;
		return area;
	}
	
	public static void main(String[] args) {
		
		AreaOfRectangle r1 = new AreaOfRectangle(5, 6);
		AreaOfRectangle r2 = new AreaOfRectangle(6, 7);
		AreaOfRectangle r3 = new AreaOfRectangle(7, 8);
		AreaOfRectangle r4 = new AreaOfRectangle(8, 9);
		
		ArrayList<AreaOfRectangle> l = new ArrayList<AreaOfRectangle>();
		l.add(r1);
		l.add(r2);
		l.add(r3);
		l.add(r4);
		
		try {
			for(AreaOfRectangle obj: l) {
				System.out.println(obj.area());
			}
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			
		}

	}

}

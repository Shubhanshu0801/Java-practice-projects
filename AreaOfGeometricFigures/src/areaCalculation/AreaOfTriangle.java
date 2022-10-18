package areaCalculation;

import java.util.ArrayList;

public class AreaOfTriangle extends Area {
	
	public float base, height;
	
	public AreaOfTriangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	
	public float area() {
		float area = 0.5f * base * height;
		return area;
	}
	
	public static void main(String[] args) {
		
		AreaOfTriangle t1 = new AreaOfTriangle(3, 4);
		AreaOfTriangle t2 = new AreaOfTriangle(4, 5);
		AreaOfTriangle t3 = new AreaOfTriangle(5, 6);
		AreaOfTriangle t4 = new AreaOfTriangle(7, 8);
		
		ArrayList<AreaOfTriangle> l = new ArrayList<AreaOfTriangle>();
		l.add(t1);
		l.add(t2);
		l.add(t3);
		l.add(t4);
		
		try {
			for(AreaOfTriangle obj: l) {
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

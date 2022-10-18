package areaCalculation;

import java.util.ArrayList;

public class AreaOfCircle extends Area {
	
	public final float PI = 3.14f;
	public float radius;
	
	public AreaOfCircle(float radius) {
		this.radius = radius;
	}
	
	public float area() {
		float area = PI * radius * radius;
		return area;
	}

	public static void main(String[] args) {
		
		AreaOfCircle c1 = new AreaOfCircle(2);
		AreaOfCircle c2 = new AreaOfCircle(3);
		AreaOfCircle c3 = new AreaOfCircle(4);
		AreaOfCircle c4 = new AreaOfCircle(5);
		
		ArrayList<AreaOfCircle> l = new ArrayList<AreaOfCircle>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);

		try {
			for(AreaOfCircle obj: l) {
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

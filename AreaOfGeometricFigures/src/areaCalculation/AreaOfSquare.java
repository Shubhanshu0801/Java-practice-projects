package areaCalculation;

import java.util.ArrayList;

public class AreaOfSquare extends Area {

	public float side;

	public AreaOfSquare(float side) {
		this.side = side;
	}

	public float area() {
		float area = side * side;
		return area;
	}

	public static void main(String[] args) {
		
		AreaOfSquare s1 = new AreaOfSquare(5);
		AreaOfSquare s2 = new AreaOfSquare(6);
		AreaOfSquare s3 = new AreaOfSquare(7);
		AreaOfSquare s4 = new AreaOfSquare(8);
		
		ArrayList<AreaOfSquare> l = new ArrayList<AreaOfSquare>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		
		try {
			for(AreaOfSquare obj: l) {
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




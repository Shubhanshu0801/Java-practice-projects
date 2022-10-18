

public class TypeCasting {

	public static void main(String[] args) {
		
		char a = 'A';
		System.out.println("Implicit Type Casting");
		int b = a;
		System.out.println("Value of b: " + b);
		float c = a;
		System.out.println("Value of c: " + c);
		long d = a;
		System.out.println("Value of d: " + d);
		double e = a;
		System.out.println("Value of e: " + e);
		
		System.out.println("Explicit Type Casting");
		double dob = 54.23;
		int i = (int) dob;
		System.out.println("Value of dob: " + dob);
		System.out.println("Value of i: " + i);

	}

}



public class TryCatchBlock {
	
	public static void main(String[] args) {
		
		int a, b;
		try {
			a = 14;
			b = a/0;
			System.out.println(b);
		}
		catch(ArithmeticException e) {
			System.out.println("We cannot divide any number by zero");	
		}
		System.out.println("exception handled");
		System.out.println("end of try-catch");

	}

}



public class ThrowKeyword {
	
	static void validate(int age){  
		if(age<18)  
		throw new ArithmeticException("not valid");  
		else
		System.out.println("welcome to vote");  
		   }  

	public static void main(String[] args) {
		validate(13);
		System.out.println("Rest of the code");
	}

}
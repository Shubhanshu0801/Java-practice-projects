

public class PrivateAccessModifiers {
	
	private void display() {
		System.out.println("This is private access modifier");
	}

}

class AccessModifier2 {
	
	public static void main(String[] args) {
		
		PrivateAccessModifiers p = new PrivateAccessModifiers();
//      We are trying to access the private method outside the class	
//	    p.display();
	}
}

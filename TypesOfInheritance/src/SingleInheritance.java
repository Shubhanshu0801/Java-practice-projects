

class Parent {
	
	public void methodA() {
		System.out.println("Parent class method");
	}
}

public class SingleInheritance extends Parent {
	
	public void methodB() {
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		
		SingleInheritance s = new SingleInheritance();
		s.methodA();
		s.methodB();
		
	}

}

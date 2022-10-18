

class X {
	
	public void methodX() {
		System.out.println("X class method");
	}
}

class Y extends X{
	
	public void methodY() {
		System.out.println("Y Class Method");
	}
}

class MultiLevelInheritance extends Y{

	public void methodZ() {
		System.out.println("Z class method");
	}
	
	public static void main(String[] args) {
		
		MultiLevelInheritance obj = new MultiLevelInheritance();
		obj.methodX();
		obj.methodY();
		obj.methodZ();
	}

}



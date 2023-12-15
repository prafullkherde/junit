package main.com;

public class Math {
	//constructor
	public Math() {
		System.out.println("Math constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math obj= new Math();
		System.out.println("Hi Prafull "+ obj.add(1, 2));
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
}

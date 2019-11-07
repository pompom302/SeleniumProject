package test;

import selenium.Test3;

public class Test1 {

	static Test1 t1 = new Test1();       // i.e.global declaration is made outside method
	static Test2 t2 = new Test2(5);
	//className ObjName = new ClassName(); constructors don't need to be called they come automatically
	
	public static void main(String[] args) {
		
		//Test1 t1 = new Test1();           //  i.e. local declaration is made inside method
		//Test2 t2 = new Test2();
		
		System.out.println("Hello");
		printMe();
		t1.scanMe();
		Test2.testing1();
		t2.testing2();
		int x  = t1.sum();
		System.out.println("x : "+x);
		int y  = t1.sum(10 , 11);
		System.out.println("y : "+y);
		int z  = t1.sum(4 , 5);
		System.out.println("z : "+z);	
		Test3.testing3();
	}

	public static void printMe( ) {             //printme is method here
		System.out.println("I am in printMe method");
	}
	
	public void scanMe() {           //void means returning nothing //scanme is method here
		System.out.println("I am in scanMe method");
	}
	
	public int sum() {
		int a = 2 + 3;
		return a;
	}
	
	public int sum(int b ,int c) {
		int d = b + c;
		return d;
}
}
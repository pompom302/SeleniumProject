//pankaj
//main method runs first, inside it test1 is called so secondly it runs, test2 is called under test1 so lastly it runs
package durgaSoft;

public class JavaExample1 {

	public void Test2() {
		System.out.println("inside test2");
	}

	
	public void Test1() {
		System.out.println("inside test1");
		Test2();
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		JavaExample1 obj1 = new JavaExample1();
		obj1.Test1();
		}
}

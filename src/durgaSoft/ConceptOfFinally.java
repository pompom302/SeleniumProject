//naveen

//finally is a block and is always used with try catch. It gets executed after try catch block.
//whether exception is coming or not finally runs always after try catch.
package durgaSoft;

public class ConceptOfFinally {

	public static void main(String[] args) {
		test1();
		System.out.println("*********");
		test2();
		System.out.println("*********");
		division();
		System.out.println("*********");
		division1();
	}

	public static void test1() {
		try {
			System.out.println("Inside test1 mehod");
			throw new RuntimeException();
		}catch(Exception e){
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("Inside test2 mehod");
		}finally {
			System.out.println("Inside finally block of test2 method");
		}
	}
	
	public static void division() {
		int i = 10;
		try {
			System.out.println("Inside try block");
			int k = i/0;
		}catch(ArithmeticException e){
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		}
		finally {
			System.out.println("Execute even after real time exception");
		}
	}
	
	public static void division1() {
		int p = 10;
		try {
			System.out.println("Inside try1 block");
			int q = p/0;
		}catch(NullPointerException e){ //ctrl wont be coming to catch as we are catching wrong exception
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		}
		finally { //we always have to close connection with database after retrieving data at end then this concept is helpful 
			//like driver.quit(); in selenium
			System.out.println("Execute even after wrong exception");
		}
	}
}
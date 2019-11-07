//pankaj
//abstract classes//abstract:concept hiding, exposing to be used though
//we can not create an object of an abstract class
//so inside abstract class, inheritance is used(extends)
//eg in POM test base class can be made abstract, page classes will extend its methods.
//need to use abstract key word for abstract class
//abstract methods don't have {} braces but ; at end
//if class has even one abstract method inside we must make class abstract
package durgaSoft;

abstract class JavaExample15 {
	static int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("sum is: " + z);
	}

	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("subtraction is: " + z);
	}
	
	public abstract void division(int x,int y);
}

//pankaj
package durgaSoft;

public class JavaExample {

	int rank = 5;
	
	public void test1() {  //created user defined method test1 , to execute it we will create object in main method
		System.out.println("I am in a Test1");
		
	}
	
	public void test2() {  //created user defined method test1 , to execute it we will create object in main method
		System.out.println("I am in a Test2");
	}
	public static void main(String[] args) {
		System.out.println("I am in Main method");
		
		JavaExample obj1;//syntax of object creation in class i.e.className objectName;
		//whenever we create an object, memory is allocated to object 
		//if it is not called through object, only code under main method will run
		//ignoring code outside main method
		obj1 = new JavaExample();// this line instantiates an object, meaning with above line object obj1 was created and 
		//has been allocated memory location but was still empty, 
		//but this line will store everything(i.e. all vars and methods) in object which is defined inside class like rank = 5,test1() , test2()
		//that is why objects are called instance of a class

		obj1.test1();
		obj1.test2();
		
		//JavaExample obj2;
		JavaExample obj2 = new JavaExample();
		obj2.test2();
		
		System.out.println("End of Main");
	}

}

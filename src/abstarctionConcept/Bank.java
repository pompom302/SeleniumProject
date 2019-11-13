//for class to be abstract class at least one method has to be abstract in it. 
//however we can have an abstract class without Abstract Methods as both are independent concepts. 
//Declaring a class abstract means that it can not be instantiated on its own and can only be sub classed. 
//Declaring a method abstract means that Method will be defined in the subclass.
//object of abstract class can't be created

package abstarctionConcept;

public abstract class Bank {
	//partial abstraction(bcz 1 method is abstract, two are not.
	//abstraction means hiding implementation logic
	
	
	int amt = 10000;
	final int loanRate = 13;
	static int rate = 5;
	
	public abstract void loan();//abstarct method:no methd body:just declaration
	
	//non-abstarct method
	public void credit() {
		System.out.println("bank-credit");
	}
	
	//non-abstarct method
	public void debit() {
		System.out.println("bank-debit");
	}
	

}

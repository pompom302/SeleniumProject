//only method declaration is made in interfaces
//100% abstraction is used
//no method or logic declaration just the prototype
//always define only abstract methods
//can't create object of interface same as abstarct class

package abstarctionConcept;
//only final and static vars can be defined in interface, while abstarct class can have any kind of vars
//no static methods allowed
public interface Car {
	
	int wheels = 4;//it will by default be final and static in nature whether wemention those keywords or not
	static int gear = 6;
	final static String str = "Smart car";
	
	public void start();
	public void stop();
	public void refuel();
	
}

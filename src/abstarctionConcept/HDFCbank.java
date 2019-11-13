//abstract methods body is defined in child class
package abstarctionConcept;

public class HDFCbank extends Bank{

	//@Override //not must to write but good practice
	public void loan() {  //overridden method
		System.out.println("HDFC bank-loan");		
	}
	
	public void funds() {  //overridden method
		System.out.println("HDFC bank-funds");		
	}

}

//pankaj
//throw keyword
package durgaSoft;

public class JavaExample18 {

	static void checkEligibility(int stuAge, int stuWeight){
		if(stuAge<12 && stuWeight<50) {
			throw new ArithmeticException("student is not eligible for registration");
		}else {
			System.out.println("Entries valid!");
		}
	}
	
	public static void main(String[] args) {

			System.out.println("Welcome to the registration process!");
			checkEligibility(10,30);
			//checkEligibility(12,50);
			//checkEligibility(20,60);
			//checkEligibility(15,30);
	}

}

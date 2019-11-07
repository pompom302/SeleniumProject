//pankaj
//eg of exception, try, catch, finally
package durgaSoft;

public class JavaExample4 {

	public void testCase1() {
		String[] tranID = {"ABC123" , "ABC234"};
		String name = null;
		
		//example of try catch
		/*
		 * for(int i=0; i <= 3 ; i++) { try { System.out.println("Tran ID " + i + "-" +
		 * tranID[i]); }catch(Exception e) { System.out.println("Exception thrown - " +
		 * e.getMessage() + "|"); }}}
		 */

		//example of try and multiple catch(nested try catch)
		//note When an exception is thrown, it will be caught by the catch block as increasing order of precedence(priority)
		//while using multiple catches
		for(int i=0; i <= 3 ; i++) {
			try {
				System.out.println("Tran ID " + i + "-" + tranID[i]);
				System.out.println("Trying to print the value of name " + name.length());
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Error accessing Trans ID - " + i + " | " + e.getMessage() );
				System.out.println("Tran ID " + i + "-" + tranID[0]);
				e.printStackTrace();// gives lines where exception is thrown
			}catch(NullPointerException e) {
				System.out.println("Name is Null");
			}catch(Exception e) {         //here e is an object of Exception class
				System.out.println("Exception thrown - " + e.getMessage() + " | "); 	
			}finally {   //finally block always gets executed no matter if there is any exception or not
				System.out.println("Final statement");
			}
		}
	}
		

public static void main(String[] args) {
	System.out.println("Exception handling 1");
	JavaExample4 obj1 = new JavaExample4();
	obj1.testCase1();
	System.out.println("End of Exception handling 1");
}
}
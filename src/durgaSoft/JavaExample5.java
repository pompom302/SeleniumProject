//pankaj
//exception handling using throws keyword
package durgaSoft;

public class JavaExample5 {

	String[] tranID = {"ABC123" , "ABC234"};
	
	public String getTranId(int i)throws Exception{
		return tranID[i];
	}
	public void testCase1() {
		for(int i=0; i <= 3 ; i++) {  
			try {
				System.out.println("Tran ID " + i + "-" + getTranId(i)); 
			}catch(Exception e) {
				System.out.println("Error accessing Trans ID - " + i );
				//e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Exception handling 2");
		JavaExample5 obj1 = new JavaExample5();
		obj1.testCase1();
		System.out.println("End of Exception handling 2");
	}
}
//calling method is responsible for entering all the incorrect values. called method throws exception.
//so calling method must handle exception.
//pankaj
package durgaSoft;

public class JavaExample3 {

	static int rank = 20; //try without static keyword , and see the difference
	//with static int both the times value printed in console is 30, bcz 20 is not only going in objects
	
	public void testCase1() {
		rank = 30;
		}
	public void testCase2() {
		System.out.println(rank);
		}
	public static void main(String[] args) {

		JavaExample3 obj1 = new JavaExample3();
		obj1.testCase1();
		obj1.testCase2();
		
		JavaExample3 obj2 = new JavaExample3();
		obj2.testCase2();
	}

}

//video part10 
//how to call instance var
//instance variable is declared under class but outside method
		
package durgaSoft;

public class Test1 {

	int x = 10; 
	
	public static void main(String[] args) {
				
		Test1 t = new Test1();//in static method to call instance var. x we need to use object as reference..see class test2
		System.out.println("x : "+ t.x);
		}
}

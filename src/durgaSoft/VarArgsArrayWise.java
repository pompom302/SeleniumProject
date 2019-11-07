package durgaSoft;

public class VarArgsArrayWise {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {40,50,60};
		m1(a,b);

	}
	public static void m1(int[]... x) {   //x is 2 d array , m1 becomes 3 - D
		for(int x1[]: x) {  //x1=[{10,20,30},{40,50,60}]
			System.out.println(x1[0]);	
		}
		
	}
	
}

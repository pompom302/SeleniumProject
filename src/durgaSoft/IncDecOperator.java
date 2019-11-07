package durgaSoft;
//naveen

public class IncDecOperator {

	public static void main(String[] args) {
		
		int a, b, c, d;
		a = 0;
		b = a++; //post increment
		// b = 0; a = 1
		c = 0; 
		d = ++c; //pre increment
		// d = 1; c = 1
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);

		int a1, b1, c1, d1;
		a1 = 1;
		b1 = a1--; //post decrement
		
		c1 = 1; 
		d1 = --c1; //pre decrement
		
		System.out.println("a1: " + a1);
		System.out.println("b1: " + b1);
		System.out.println("c1: " + c1);
		System.out.println("d1: " + d1);
	}

}

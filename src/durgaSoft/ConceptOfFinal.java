//naveen
//final is a keyword
package durgaSoft;

public class ConceptOfFinal {

	public static void main(String[] args) {

		final int i = 20;//final keyword makes value of i constant
		//now I can not change value of i
		//also final prevents  inheritance to be used, if I make parent class final, it won't be extended by any other class.
		//prevents method over riding
		//i = 30; uncomment and see
		ConceptOfFinal cof = new ConceptOfFinal();
		cof.start();
		
	}

	public final void start() {
		System.out.println("start method");
	}
	
}

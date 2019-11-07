package durgaSoft;

public class Factorial {

	public static void main(String[] args) {
		
		int i,f = 1;
		int num = 6;//change value to get factorial of any number
		
		for(i = 1; i <= num; i++) {
			f = f * i;
		}
		System.out.println("Factorial of "+ num +" is: "+ f);
	}

}

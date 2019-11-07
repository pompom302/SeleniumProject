package durgaSoft;

public class FactorialUsinfRecursion {

	public static int fact(int num) {
		if(num == 0) {
			return 1;
		}else {
			return(num * fact(num-1));
		}
	}
	
	public static void main(String[] args) {
		int f;
		int num = 4;
		f = fact(5);
		System.out.println("Factorial of " + num + " is " + f);

	}

}

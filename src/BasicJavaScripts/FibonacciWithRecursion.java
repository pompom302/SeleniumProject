package BasicJavaScripts;

public class FibonacciWithRecursion {

	static int n1=0,n2=1,n3=0; 
	
	public static void fibo(int count) {
		if(count > 0) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			fibo(count-1);
		}
	}
	
	public static void main(String[] args) {
		
		int count = 10;
		System.out.print(n1 + " " + n2);//printing 0 and 1
		fibo(count-2);//n-2 because 2 numbers are already printed
		
		
	}

}

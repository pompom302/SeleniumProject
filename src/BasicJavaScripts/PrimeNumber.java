package BasicJavaScripts;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		//edge corner cases
		if(num <= 1 ) {
			return false;
		}

		for(int i = 2; i < num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//how many prime nums within given range: 0 and 20
	public static void getPrimeNum(int num) {
		for(int i = 2; i <= num; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("2 is the prime number: " + isPrimeNumber(2));
		System.out.println("3 is the prime number: " + isPrimeNumber(3));
		System.out.println("8 is the prime number: " + isPrimeNumber(8));
		System.out.println("10 is the prime number: " + isPrimeNumber(10));		
		System.out.println("17 is the prime number: "+ isPrimeNumber(17));
		System.out.println("0 is the prime number: "+ isPrimeNumber(0));
		System.out.println("-1 is the prime number: "+ isPrimeNumber(-1));
	
		getPrimeNum(20);
	}

}

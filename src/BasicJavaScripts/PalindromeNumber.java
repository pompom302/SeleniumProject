package BasicJavaScripts;

public class PalindromeNumber {

	//reverse of number is same like 141, 34543, 727

	
	public void isPalindromeNumber(int num) {
		System.out.println("Given number is " + num);
		int r = 0;
		int sum = 0;
		int t;
		t = num;
		
		while(num > 0) {
			r = num % 10;  //get the reminder
			sum = sum*10 + r;
			num = num/10;
		}
		
		if(t == sum) {
			System.out.println("This number is palindrome");
		}else {
			System.out.println(" This number is not palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		PalindromeNumber p =new PalindromeNumber();
		p.isPalindromeNumber(151);
		p.isPalindromeNumber(345543);
		p.isPalindromeNumber(34543);
		p.isPalindromeNumber(0);
		p.isPalindromeNumber(1);
		}

}

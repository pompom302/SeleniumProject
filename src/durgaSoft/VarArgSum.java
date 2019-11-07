package durgaSoft;

public class VarArgSum {

	public static void sum(int...x) {
		int total = 0;
		for(int x1 : x) {
			total = total + x1;
		}
		System.out.println("The sum is: "+ total);
	}
	public static void main(String[] args) {
		sum();
		sum(10,20);
		sum(10,20,30,40);
		sum(10,20,30,40,50);
		

	}

}

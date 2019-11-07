package durgaSoft;

public class VarArgs {
	
	public static void m1(int...x) {   //m1(int...x)=m1(int[] x))
		System.out.println("var-args method");
	}

	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20,30,40);
		m1(new int[]{10,20});

	}

}

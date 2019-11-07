package durgaSoft;

public class VarArgsVsGeneral {

	public static void m1(int...x) {
		System.out.println("Var-args method");
	}

	public static void m1(int x) {
		System.out.println("General method");
	}

	public static void main(String[] args) {
		m1();//not passing any value does not match with int x
		m1(10);//matches with both but int x takes precedence over int...x
		m1(10,20,30,40);//doesn't match to int x
	}

}

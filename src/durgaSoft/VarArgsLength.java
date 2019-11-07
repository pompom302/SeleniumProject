package durgaSoft;

public class VarArgsLength {

	public static void m1(int...x) {   //m1(int...x,int... y)
		System.out.println("Thenumber of arguments are: "+ x.length);
	}

	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20,30,40);

	}

}

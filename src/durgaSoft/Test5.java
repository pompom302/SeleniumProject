package durgaSoft;

public class Test5 {

	static int x = 10;
	int y = 20;
	public static void main(String[] args) {
		Test5 t1 = new Test5();
		t1.x = 888;//for t1 obj x = 888 now
		t1.y = 999;//for t2 obj y= 999 now
		System.out.println(t1.x);
		System.out.println(t1.y);
		
		Test5 t2 = new Test5();
		System.out.println(t2.x);
		System.out.println(t2.y);
		System.out.println(t2.x + t2.y);  //for t2 obj x=888 ,y = 20 now
		//bcz x was static so accept new value and use copy of same
		//y instance var so will have new copy for every object in class
	}

}

package OOPConceptPart1;

public class CallByValAndCallByRef {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		obj.sum(x, y);//call by value or pass by value
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int sum(int a, int b) {
		a=30;
		b=40;
		int c = a + b;
		System.out.println(c);
		return c;
	}
	
	//call by reference: passing the value of object reference instead of pointers in c
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p; //temp=50
		t.p = t.q; // t.p = 60
		t.q = temp; //t.q = 50
	}
}

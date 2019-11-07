package durgaSoft;

public class JavaExample19 {

	public static int myMethod() {
		try {
			System.out.println("Inside try block");
			return 0;
		}finally{//finally always gets executed
			System.out.println("Inside finally block");
			return 10;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(JavaExample19.myMethod());
	}

}

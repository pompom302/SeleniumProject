//naveen
package OOPConceptPart1;

public class MethodOverLoading {

	public void sum() {
		System.out.println("sum");
	}
	
	public void sum(int i) {
		System.out.println("sum1");
	}
	
	public void sum(double k) { //same parameter diff data type is ok, but int k won't be
		System.out.println("sum2");
	}
	
	public void sum(int j, int k) {
		System.out.println("sum3");
	}

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(1);
		obj.sum(2.5);
		obj.sum(1, 3);
		//contructors define properties. property has to be same bt value can vary
		
	}

}

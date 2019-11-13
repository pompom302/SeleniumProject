package OOPConceptPart1;

public class NullConcept {

	public static void sum() {
		System.out.println("sum...");
	}
	
	public void division() {
		System.out.println("division..");
	}
	
	public static void main(String[] args) {
		//int i = null; //Type mismatch: cannot convert from null to int
		
		//instanceof
		Integer i = null;
		Integer j = 10; //Integer is wrapper class.
		System.out.println(i);
		System.out.println(j);
		System.out.println(i instanceof Integer);//for null it's false
		System.out.println(j instanceof Integer);
		//static vs non static
		NullConcept obj =  null;
		obj.sum();
		//obj.division();
		
		//== and !=
		System.out.println(null == null);//true
		System.out.println(null != null);//false
		
		//
		String s1=(String)null;//typecast
		System.out.println(s1);
		String s = null;
		System.out.println(s);
		System.out.println(s1.length());//gives NPE
		System.out.println(s1.charAt(0));//gives NPE

	}

}

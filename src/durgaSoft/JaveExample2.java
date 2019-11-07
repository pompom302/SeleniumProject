//pankaj
/*
 * //this e.g. talks about static objects //value of object can change, but
 * object won't change package durgaSoft;
 * 
 * public class JaveExample2 {
 * 
 * int rank = 2; int age = 2; String name;
 * 
 * 
 * public void testCase1() {
 * 
 * System.out.println("inside test case 1");
 * System.out.println("value of global var rank is: " + rank);
 * System.out.println("value of global var age is: " + age); } public void
 * testCase2() { System.out.println("inside test case 2");
 * System.out.println("value of global var rank is: " + rank);
 * System.out.println("value of global var age is: " + age); } public static
 * void main(String[] args) { System.out.println("My first java example");
 * 
 * JaveExample2 obj1 = new JaveExample2(); obj1.rank = 5; obj1.testCase1();
 * obj1.testCase2();
 * 
 * JaveExample2 obj2 = new JaveExample2(); obj2.testCase1(); obj2.testCase2(); }
 * }
 */

  package durgaSoft;
  
  public class JaveExample2 {
  
  static int rank = 2; int age = 5; String name;
  
  
  public void testCase1() { 
	  int age; age = 15;
  
	  System.out.println("inside test case 1");
	  System.out.println("value of local var age is: " + age);
	  System.out.println("value of global var age is: " + this.age); 
   }
  public static void testCase2() { 
	  
	  System.out.println("inside test case 2");
      System.out.println("value of global var rank is: " + rank); 
  } public static
  void main(String[] args) { System.out.println("My first java example");
  JaveExample2 obj1 = new JaveExample2(); 
  obj1.rank = 5; //rank is static(class level var) so it should be called like classname.varname then warning will disappear.
  //JaveExample2.rank = 5; 
  obj1.testCase1();
 
  //obj1.testCase2();
  JaveExample2.testCase2();
  
  JaveExample2 obj2 = new JaveExample2(); 
  obj2.testCase1();
  obj2.testCase2();
   }
  }
 
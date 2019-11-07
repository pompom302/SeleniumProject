//naveen
//class contains entities , methods, properties and variables
package OOPConceptPart1;

public class Car {
	
	//global or class variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new Car();--this is the object of a car class
		Car a = new Car();//a is referring to object new car, a is object reference variable
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel= 4;
		b.mod = 2010;
		b.wheel = 4;
		c.mod = 2019;
		c.wheel = 4;
		
		System.out.println("before assigning references");
		System.out.println(a.mod + " " + a.wheel);
		System.out.println(b.mod+ " " + b.wheel);
		System.out.println(c.mod + " " + c.wheel);
		
		System.out.println("after shifting references");
		a=b;b=c;c=a;
		a.mod = 10;
		System.out.println(a.mod);//10
		c.mod = 20;
		System.out.println(a.mod);//20
		System.out.println(b.mod);
	}

}

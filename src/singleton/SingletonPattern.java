//naveen
package singleton;

public class SingletonPattern {

	// In OOP, singleton class is a class that can have only one object(instance of a class) at a time
			//how to design a singleton class
			//1. make a constructor as private
			//2. write a public static method that has return type object of this singleton class(lazy initialization)
			
	
	private static SingletonPattern singleton_instance = null; //obj reference
	public String str;
	//1
	private  SingletonPattern() {
		str = "Hi there!";
	}
	//2 lazy initialization
	public static SingletonPattern getinstance() {
		if(singleton_instance == null)
			singleton_instance = new SingletonPattern();
			return singleton_instance;
	}
	
	public static void main(String[] args) {
		//instantiating class with 3 variables x,y and z
		SingletonPattern x = SingletonPattern.getinstance();
		SingletonPattern y = SingletonPattern.getinstance();//when it gets into this method now if cond not satisfied but y  is also referring to same object as x is
		SingletonPattern z = SingletonPattern.getinstance();
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}

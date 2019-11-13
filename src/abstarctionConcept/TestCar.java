package abstarctionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		//object of interface can't be created
		//Car c =new Car();//will give can't instantiate error
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		//dynamic polymorphism
		Car c = new BMW();
		c.start();
		c.stop();
		c.refuel();
		//c.theftSafety(); can't do this with dynamic polymorph, as it is child class's unique nonover-ridden method
	}

}

package abstarctionConcept;
//implements keyword is used to use interface
public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("BMW start method");
	}

	@Override
	public void stop() {
		System.out.println("BMW stop method");
	}

	@Override
	public void refuel() {
		System.out.println("BMW refuel method");
	}
	
	//non over-rideen method
	public void theftSafety() {
		System.out.println("BMW theft safety method");
	}
	
}

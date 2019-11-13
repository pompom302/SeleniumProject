package abstarctionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCbank hb =new HDFCbank();
		hb.loan();
		hb.credit();
		hb.debit();
		hb.funds();

		//dynamic polymorphism
		Bank b = new HDFCbank();
		//b.loan();
		b.credit();
		b.debit();
		//b.funds();//child classes unique method so can't be called by dynamic poly.
		
		//object of abstract class can't be created
		//Bank b1 = new Bank();//will give can't instantiate error
	}

}

//pankaj
//whenever we have to pass fixed inputs we use enumerators
package durgaSoft;

public class JavaExample20 {

	public enum Directions{
		EAST,
		NORTH,
		WEST,
		SOUTH
	}
	
	public void getMyDirection(Directions dir) { //can't receive input except in enum 
		switch(dir) {
		case EAST:
			System.out.println("In East direction");
			break;
			
		case NORTH:
			System.out.println("In North direction");
			break;
		
		case WEST:
			System.out.println("In West direction");
			break;
			
		default:
				System.out.println("In South direction");
				break;
		}
	}
	public static void main(String[] args) {
		JavaExample20 obj1 = new JavaExample20();
		obj1.getMyDirection(Directions.NORTH);
		JavaExample20 obj2 = new JavaExample20();
		obj2.getMyDirection(Directions.SOUTH);

	}

}

package durgaSoft;
//naveen

public class TwoDimArray {

	public static void main(String[] args) {


		String x[][] = new String[2][3];//creates 2D array
		System.out.println(x.length);//gives total num of rows
		System.out.println(x[0].length);//gives total num of cols
		
		//1st row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		//2nd row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		
		for(int row = 0; row < x.length; row++) {
			for(int col=0; col < x[0].length; col++)
			System.out.println(x[row][col]);
		}
	}

}

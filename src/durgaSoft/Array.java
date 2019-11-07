package durgaSoft;
//naveen
public class Array {

	public static void main(String[] args) {
		//disadvantage of array: 
		//1>size is fixed---to overcome this we use collections,like arraylist or hashtable, which are called dynamic array
		//2> stores only similar data types---to overcome this, use object array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println("length of array i: " + i.length);
		//System.out.println(i[4]); Array Index Out Of Bounds Exception
		
		for(int j=0; j < i.length ; j++) {
			System.out.println(i[j]);
		}
		
		//object array---used to store diff data type values
		Object ob[] = new Object[6]; //Object is a class; 6 is a size of an object array
		ob[0] = "Tom";
		ob[1] = 5;
		ob[2] = 5.7;
		ob[3] = "1/2/1995";
		ob[4] = '$';
		ob[5] = 15.888;
		int k = ob.length;
		for(int j=0; j < k ; j++) {
			System.out.println(ob[j]);
		}
	}
}

//naveen
//we are not calling finalize method in main method but it still produce output
//finalize: finalize is a method. 
//just before garbage collector, finalize method is automatically geared up, just to clean up processing of the object
package durgaSoft;

public class ConceptOfFinalize {

	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {

		ConceptOfFinalize f1 = new ConceptOfFinalize();
		ConceptOfFinalize f2 = new ConceptOfFinalize();
		
		f1 = null; //there is an object with name f1 but it is referring to nothing making f1 a blank object
		f2 = null;
		//garbage collector will come inside a java memory,and will destroy blank object which is having nothing just wasting memory
		//so gc frees up the memory, it gears up automatically but cant be known of when 
		
		//to call gc manually
		System.gc();
		//Calling the gc method suggests that the Java VirtualMachine expend effort toward recycling unused objects...
		// in order tomake the memory they currently occupy available for quick reuse.	
	}
}


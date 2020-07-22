package arrayPrograms;


//Clone() method in java is used for creating the exact copy of the elements.
//This creates a new example of a class of the current object and then initialize all its field with exactly the content of the 
//corresponding field of this object.


public class Program2 {
	
//	In this program we are copying the elements from the array1 into the array1 using clone() method in java.

	public static void main(String args[]) {
		
		int a[] = {1,2,3}; // Here we are initializing the values in the array a[].
		
		int b[] = a.clone(); // Here we are copying the elements of array a[] to the array b[] using clone method.		
		
		
//		b[0]++;
		
		
//		In case you want to check that whether the clone method performs efficiently we can increment the b by b[0]++. 
//		If the value gets incremented by 1 which means instead of 1,2,3 it should print 2,2,3. 
		
		
		// Here we are printing the original array which is a[].
				
		System.out.print("Contents of a: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		
		
		// Here we are printing the copied array which is b[].
		System.out.print("Contents of b: ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
		
		System.out.println();
	}
}

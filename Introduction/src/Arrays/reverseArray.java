package Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// Here we are printing the original array in the reverse format.
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Printing the original array:  ");
		
		for(int i=0; i<arr.length; i++) 
		{
			System.out.print(arr[i] + "    ");
		}
		
		// Here we are printing the array in the reverse manner.
		
		System.out.println("\n");
		
		System.out.println("Printing the reverse array:  ");
		
		for(int i=arr.length-1; i>=0; i--) 
			
			System.out.print(arr[i] + "    ");

		

	}

}

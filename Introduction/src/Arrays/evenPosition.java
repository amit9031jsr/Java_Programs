package Arrays;

public class evenPosition {

	public static void main(String[] args) {
		// Printing all the elements present in the even position
		
		int arr[] = {2,1,4,3,6,5,8,7,10,9};
		
		System.out.println("The original array is: ");
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + "   ");
		}
		
		System.out.println( " \n ");
		
		
		System.out.println("The elements of an array present on even position: ");
		
		for(int i=1; i<arr.length;i=i+2) {
			System.out.print(arr[i] + "   ");
		}
		
		
	}

}

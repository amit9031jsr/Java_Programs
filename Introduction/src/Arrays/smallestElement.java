package Arrays;

public class smallestElement {

	public static void main(String[] args) {
		// Printing the smallest element in the array
		
		int arr[] = {65,1,66,89,74,93,100};
		
		int min = arr[0];
		
		System.out.println("The original elements in the array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "    ");
		}
		System.out.println("   \n ");
		
		System.out.println("The smallest element in the array: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}

		System.out.println(min + "  ");
	}

}
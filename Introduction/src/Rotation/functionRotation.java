package Rotation;
import java.util.*;

public class functionRotation {
	void rotatebyTwo(int arr[],int d,int n) {
		
		System.out.println("The original array is: ");
		for(int i=0;i<n;i++) {
			System.out.println (arr[i]+ "   ");
		}
			int j, temp;
			
			for(int i=0; i<d; i++) {
				
				temp = arr[0];
				
				for( j =0; j<n-1; j++) 
				{
					arr[j]=arr[j+1];
				}
				arr[j]=temp;		
			}
	}
	
	void print(int arr[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + "    ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		functionRotation rotate = new functionRotation();
		
		int arr[]= {1,2,3,4,5};
		
		rotate.rotatebyTwo(arr,2,5);
		
		rotate.print(arr, 5);
		
	}

}

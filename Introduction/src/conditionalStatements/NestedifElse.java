
//Max of 3 numbers find out which one is greater

package conditionalStatements;
import java.util.Scanner;
public class NestedifElse {

	public static void main(String[] args) {
		System.out.println("Please enter the value to find out your lucky pot: ");
		
		Scanner sc = new Scanner(System.in);
		
		int  a= sc.nextInt();
		int  b= sc.nextInt();
		int  c= sc.nextInt();
		
		if(a>b) {
			
			System.out.println("Here A is greater than B." );
		}
		if(a>c) {
			
			System.out.println("Again A is greatest than C and among all.");
		}
		
		else if (b>a) {
				System.out.println("The value of B is greater than A.");
			
			if(b>c) {
				
				System.out.println("The value of B is greatest than C and among all.");
			}
		}
		
		else {
			System.out.println("The value of C is greatest than all");
		}

	}

}

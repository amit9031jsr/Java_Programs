package doWhile;
import java.util.Scanner;

public class exampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		do {
			System.out.println("uh-oh! you cant vote according to your age");
		}while(n>=18);
		
	}

}

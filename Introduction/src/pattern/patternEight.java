package pattern;
import java.util.Scanner;

public class patternEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rows =2*n-1;
		for(int i=1; i<=rows; i++) {
			for(int j=1;j<=i;j++) {
				if(i<=n) {
				System.out.print("* ");
				}
			}
		}
		
	}

}

package whileLoops;
//import java.util.Scanner; 

public class testingProgram2 {

	public static void main(String[] args) {
		// This approach is solving the question by taking the input from the user where the log is being used to calculate the number
//		of digits where looping starts from 0.
		
		int sum=0;
		int temp;
		
	
		
		int n = 235;
		
		int numberOfdigits = (int)Math.log10(n)+1;
		
		System.out.println(numberOfdigits);
		
		for(int i=1; i<=numberOfdigits; i++) {
			
			temp = n%10;
			sum = sum+temp;
			
			n /=10;
		}
		System.out.println(sum);
		
	}

}

package Arrays;

public class arrayIntro {

	public static void main(String[] args) {
		// Introduction for arrays
		
//		int[] marks = new int[10]; this is a type1 declaration of arrays
		
//		int[] marks;
//		marks = new int[10]; This is a type2 array declaration
		
		
//		int marks [] = new int[10]; we can declare it in the following ways
		
//		Declaring multiple array in the single line
		
//		int[] classRank, rollNumbers;
//		
//		int[] marks = new int[5];
//		System.out.println(marks[3]);
		
		int[] roll_no= {10,11,12,50};
		double[] marks = {85.5,65.5,32.5,88.5};
		
		System.out.println("The student marks with the roll number " + roll_no[0]+ " is " + marks[0] );
		System.out.println("The student marks with the roll number " + roll_no[1]+ " is " + marks[1] );
		System.out.println("The student marks with the roll number " + roll_no[2]+ " is " + marks[2] );
		System.out.println("The student marks with the roll number " + roll_no[3]+ " is " + marks[3] );

	}

}

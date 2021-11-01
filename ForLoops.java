
public class ForLoops {

	public static void main(String[] args) {		// 3 most common ways people use for loops

		for(int i = 0; i < 10; i++) {
			System.out.println("I love dogs!");		// 1. Repeat code over and over again
			
		}
		
		for(int i = 0; i < 15; i++) {				// 2. Repeat code with special variable i
			System.out.println(i);
		}
		
		int[] grades = {98, 87, 100, 95, 89, 93};
		
		for(int i = 0; i < grades.length; i++) {	// 3. Repeat code and use special variable i to access elements in an array 
			System.out.println(grades[i]);
		}
	}

}

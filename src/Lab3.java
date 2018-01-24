import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// Variable Declaration
		Scanner scan = new Scanner(System.in);
		int userNumber = 0;
		int squared;
		int cubed;
		int i;
		String keepGoing = "y";
		
		//Greeting Statement
		System.out.println("Learn your squares and cubes!");

		while (keepGoing.equalsIgnoreCase("y")) {
			// User Prompt for number & validation for correct input
			System.out.print("\nEnter an integer: ");
			while(!scan.hasNextInt()) {
				System.out.println("Please enter a valid integer! Try again: ");
				scan.nextLine();

			}
		
				userNumber = scan.nextInt();
		

			// Set up table
			System.out.println("\nNumber   \tSquared  \tCubed");
			System.out.println("=======  \t=======  \t======");

			// Add to table for number entered
			for (i = 1; i <= userNumber; ++i) {
				squared = i * i;
				cubed = i * i * i;
				System.out.println(i + "   \t\t" + squared + "  \t\t" + cubed);
			}

			// Kill loop or continue with more?
			System.out.print("\nContinue? (y/n): ");
			keepGoing = scan.next();

		}

		scan.close();
		System.out.println("Goodbye.");
	}

}

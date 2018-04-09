
import java.util.Scanner;

public class CheckDigitSums {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Declare variables needed for user input

		String firstNum;
		String secondNum;

		int firstNumLength;
		int secondNumLength;

		// Prompt user, get two numbers from console

		do {
			System.out.println("Please enter first number.");
			firstNum = input.nextLine();
			System.out.println("Please enter second number of equal length.");
			secondNum = input.nextLine();

			// Get length of user inputs

			firstNumLength = firstNum.length();
			secondNumLength = secondNum.length();

			// Check that inputs are equal and loop back to prompts if they aren't

			if (firstNumLength != secondNumLength) {
				System.out.println("Numbers are not equal length. Try again.");
			}
		} while (firstNumLength != secondNumLength);

		input.close();

		// Declare variables for digit by digit comparison

		int firstNumFirstDigit;
		int secondNumFirstDigit;

		// Declare variables for verification that inputs are numeric

		int firstNumInt;
		int secondNumInt;

		// Convert strings to integer, trap the error if non-numeric // Could be done
		// later in individual digit processing, but why process invalid inputs

		try {
			firstNumInt = Integer.parseInt(firstNum);
			secondNumInt = Integer.parseInt(secondNum);

			// Get first digit of each number

			firstNumFirstDigit = Integer.parseInt(firstNum.substring(0, 1));
			secondNumFirstDigit = Integer.parseInt(secondNum.substring(0, 1));

			// Add the two first digits

			int firstTestDigit = firstNumFirstDigit + secondNumFirstDigit;

			// Declare variables for subsequent digits

			int firstNumNextDigit;
			int secondNumNextDigit;

			// Declare variables for testing of subsquent digit sims

			boolean digitSumsMatch = true;
			int nextTestDigit;
			int i = 1;

			// Compare each subsequent digit sum to first

			do {

				// Get next digits from each number

				firstNumNextDigit = Integer.parseInt(firstNum.substring(i, i + 1));
				secondNumNextDigit = Integer.parseInt(secondNum.substring(i, i + 1));

				// Add the teo digits together

				nextTestDigit = firstNumNextDigit + secondNumNextDigit;

				// Compare each digit sum to the first and set true if equal, false if not

				if (nextTestDigit == firstTestDigit) {
					digitSumsMatch = true;
				} else {
					digitSumsMatch = false;
				}

				// Increment to position for next digit

				i = i + 1;

				// Repeat until end of inputs, or digit sums not equal

			} while ((i < (firstNumLength)) & (digitSumsMatch == true));

			// Output result: true is all digit sums equal, false if not

			System.out.println("Result is: " + digitSumsMatch);
		}

		// Trap non-numeric condition on inputs and output error message

		catch (NumberFormatException ex) {
			System.out.println("Value entered not numeric.");
		}

	}

}

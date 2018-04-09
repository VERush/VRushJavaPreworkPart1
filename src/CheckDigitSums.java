
import java.util.Scanner;

public class CheckDigitSums {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String firstNum;
		String secondNum;

		int firstNumLength;
		int secondNumLength;

		do {
			System.out.println("Please enter first number.");
			firstNum = input.nextLine();
			System.out.println("Please enter second number of equal length.");
			secondNum = input.nextLine();

			firstNumLength = firstNum.length();
			secondNumLength = secondNum.length();

			if (firstNumLength != secondNumLength) {
				System.out.println("Numbers are not equal length. Try again.");
			}
		} while (firstNumLength != secondNumLength);

		System.out.println("Numbers:" + firstNum + " " + secondNum);
		System.out.println("Length = " + firstNumLength);

		int firstNumFirstDigit;
		int secondNumFirstDigit;
		int firstNumInt;
		int secondNumInt;

		try {
			firstNumInt = Integer.parseInt(firstNum);
			secondNumInt = Integer.parseInt(secondNum);

			firstNumFirstDigit = Integer.parseInt(firstNum.substring(0, 1));
			secondNumFirstDigit = Integer.parseInt(secondNum.substring(0, 1));

			int firstTestDigit = firstNumFirstDigit + secondNumFirstDigit;

			System.out.println("First Test Value = " + firstTestDigit);

			int firstNumNextDigit;
			int secondNumNextDigit;
			boolean digitSumsMatch = true;
			int nextTestDigit;
			int i = 1;

			do {
				System.out.println("i = " + i);
				System.out.println("FirstNum = " + firstNum);
				System.out.println("Substring = " + firstNum.substring(i, i + 1));

				firstNumNextDigit = Integer.parseInt(firstNum.substring(i, i + 1));
				secondNumNextDigit = Integer.parseInt(secondNum.substring(i, i + 1));

				nextTestDigit = firstNumNextDigit + secondNumNextDigit;

				System.out.println("First test value = " + firstTestDigit);
				System.out.println("Next test value = " + nextTestDigit);
				System.out.println(digitSumsMatch);

				if (nextTestDigit == firstTestDigit) {
					digitSumsMatch = true;
				} else {
					digitSumsMatch = false;
				}
				System.out.println(digitSumsMatch);
				i = i + 1;
			} while ((i < (firstNumLength)) & (digitSumsMatch == true));

			System.out.println("Result is: " + digitSumsMatch);
		}

		catch (NumberFormatException ex) {
			System.out.println("Value entered not numeric.");
		}

	}

}

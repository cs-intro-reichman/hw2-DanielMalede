// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		// Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		String checkIfVOrCString = args[1];
		int roundCounter = 1;
		int counter = 0;

		if (checkIfVOrCString.valueOf("v") == "v") {
			for (int i = 0; i < number; i++) {
				System.out.print(i + 1 + " ");
				number = i + 1;
				while (counter < 3) {
					if (number % 2 == 0) {
						number = number / 2;
						System.out.print(number + " ");

					} else {
						number = (3 * number) + 1;
						System.out.print(number + " ");
					}
					roundCounter += 1;
					counter++;

				}
				while (number != 1) {
					if (number % 2 == 0) {
						number = number / 2;
						System.out.print(number + " ");

					} else {
						number = (3 * number) + 1;
						System.out.print(number + " ");
					}
					roundCounter += 1;

				}

				System.out.print("(" + roundCounter + ")");
				number = Integer.parseInt(args[0]);
				roundCounter = 1;
				System.out.println("");
			}
			System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
		} else {
			System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
		}
	}
}
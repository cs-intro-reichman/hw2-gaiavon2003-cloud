// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String mode = args[1];

		for (int seed = 1; seed <= n; seed++) {
			int currentNumber = seed;
			int steps = 1;

			if (mode.equals("v")) {
				System.out.print(currentNumber + " ");
			}

			do {
				if (currentNumber % 2 == 0) {
					currentNumber = currentNumber / 2;

				} else {
					currentNumber = (currentNumber * 3) + 1;
				}
				steps++;
				if (mode.equals("v")) {
					System.out.print(currentNumber + " ");
				}
			} while (currentNumber != 1);
			if (mode.equals("v")) {
				System.err.print("(" + steps + ")");
				System.out.println();
			}

		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1");

		// their
		// 1 4 2 1 (4)
		// Every one of the first 1 hailstone sequences reached 1
		// our
		// 1 4 2 1 (4)
		// Every one of the first 1 hailstone sequences reached 1.
		//

	}
}

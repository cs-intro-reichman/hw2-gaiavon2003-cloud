// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
	int n = Integer.parseInt(args[0]);
	String mode = args [1];
	for ( int seed = 1; seed <= n ; seed ++) {
		int currentNumber = seed; 
		int steps = 0;
		
		if (mode.equals("v")) {
			System.out.print( currentNumber + " ");
		}
		while (currentNumber != 1 ) {
			if (currentNumber % 2 == 0 ) {
				currentNumber = currentNumber / 2;
				
			} else { 
				currentNumber = (currentNumber * 3) + 1;
			}
			steps++;
			if (mode.equals("v")) {
				System.out.print(currentNumber + " ");	
			}
	}
	if (mode.equals("v")) {
		System.out.println();
		System.out.println("Seed "+ seed + "took "+ steps + "steps.");
		System.out.println("---");
	} 
	
	
	
	}
	System.out.println("Verified the Collatz conjecture for seeds 1 to " + n + ".");
}
}




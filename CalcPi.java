// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		double sum = 0.0;
		for ( int i = 0; i < n ; i++){
			double term = 1 / (2 * i +1);
			if ( i % 2 == 0){
				sum = sum + term; 
			} else { 
				sum = sum - term;
			}
		}
		double approxPi = sum * 4 ;
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi approximated: "+ approxPi);

	}
}

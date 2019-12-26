package signintestsuite;

public class Factorial {

	static int factorial(int number) {

		int startNumber = 1;

		for(int i = 1; i <= number; i++){
			startNumber *= i;
		}
		return startNumber;
	}

	public static void main(String[] args){
		System.out.println( factorial( 4 ) );
	}
}

package signintestsuite;

import java.util.ArrayList;

public class SumOfNumbers {

	static int sumNumbers(int number){
		ArrayList<Integer> numbersList = new ArrayList<>( number );
		int sum = 0;
		for ( int i = 1; i <= number; i++ ){
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println( sumNumbers( 100 ) );
	}
}

/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P3_Consecutive {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program calculates if three input values are consecutive.");
		Arrays.sort(test);
		for (int i = 0; i< test.length -1; i++) {
			if (test[i] +1 != test [i + 1]) {
				//Not sequential
			
			}
		}
		String doItAgainResponse = "";
		
		do {
			System.out.print("7");
			int num1 = console.nextInt();
			System.out.print("6 ");
			int num2 = console.nextInt();
			System.out.print("8");
			int num3 = console.nextInt();
		
			System.out.printf( "a: %d, b: %d, c: %d -> ", num1, num2, num3);

			
			
			System.out.print("Would you like to do it again (enter 'n' to quit)? ");
			doItAgainResponse = console.next();
		} while( !doItAgainResponse.equalsIgnoreCase("n"));
		
		System.out.println("Thanks!");
	}
	


}

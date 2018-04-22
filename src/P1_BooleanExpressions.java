/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expression predictions:
 
 1. not false
 2. false or true
 3. 32 > -1 and -1 > 32
 4. false
 5. false
 6. false
 7. true
 8. true
   
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1. I put not false, should have been true
 2. No should have been true
 3.  No false
 4. no, I put false should have been true as 27 is less than 32
 
 5. I had right but second guessed
 6. correct
 7. correct
 8. correct

 */
public class P1_BooleanExpressions {

	public static void main(String[] args) {
		int x = 27; 
		int y = -1; 
		int z = 32; 
		boolean b = false; 
		
		System.out.println( (x < y) == b   );
	}

}

import java.util.Random;
import Test1.*;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		// Generates a random number from 0 (included) to 10 (not included)
		System.out.println(r.nextInt(10));
		
		// Generates a random number in a range from -2^31 (-2147483647) to 2^31 (2147483647), which are the minimum and maximum values for int data type.
		System.out.println(r.nextInt());
	
	}

}

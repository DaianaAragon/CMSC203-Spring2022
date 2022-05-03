import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		int [] nums = {1, 2, 3};
		
		// Unchecked Exception -> not checked at compile time (does not show syntax error)

		System.out.println("Enter a number: ");
		
		int num;
		Circle c = new Circle("Sun", "Yellow", 5);
		
		try {
			
			num = input.nextInt();
			
			System.out.println(num);
			
			System.out.println(nums[num]);
			
			System.out.println("After crash");
			
			//System.out.println(c.findArea());
			
		}
		
		// We should first catch the specific exceptions, then general exceptions
		/*catch (InputMismatchException e) 
		{
			System.out.println("Wrong input");
		}
		
		catch (Exception e)
		{
			System.out.println("Something went wrong " + e.getMessage());
		}*/
		
		// Content will always be executed, regardless there's an exception or not
		
		finally
		{
			System.out.println("In finally block");
		}


	}

}
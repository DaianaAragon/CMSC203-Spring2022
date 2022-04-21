import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		
		// File should be in the project folder for it to be found.
		File f1 = new File("test.txt");
		
		double total = 0;
		
		try 
		{
			// Pass file object to the scanner
			Scanner input = new Scanner(f1);
			// Scans the lines until it reaches the end of the file
			while (input.hasNext())
			{
				total += input.nextDouble();				
			}
			System.out.println(total);
			System.out.println(10/0);
			System.out.println("Hello");
		} 
		// Handle exception to prevent code from crashing.
		// If something goes wrong in the try block, the catch block executes.
		// You can have multiple catch blocks for one try block
		catch (FileNotFoundException | ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		
		/*catch (ArithmeticException e)
		{
			System.out.println("You cannot divide by zero");
		}*/

		System.out.println("End of main");
		
	}

}

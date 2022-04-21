import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFileDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		int n1, n2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integer numbers: ");
		
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		// Creates file if it does not exist
		// Overwrites file if it exists
		PrintWriter file = new PrintWriter("output.txt");
		
		file.println(n1 + " my first number");
		file.println(n2 + " my second number");
		
		file.close();
		input.close();
	}

}

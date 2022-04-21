import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileDemoTwo {

	public static void main(String[] args) {
		
		File f1 = new File("numbers.txt");
		
		double total = 0;
		
		try 
		{
			Scanner input = new Scanner(f1);
			
			while (input.hasNext())
			{
				String line = input.nextLine();	
				String [] array = line.split(" ");
				System.out.println(Double.parseDouble(array[0]));
				System.out.println(line);
			}

		} 

		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}

		System.out.println("End of main");
		
	}

}

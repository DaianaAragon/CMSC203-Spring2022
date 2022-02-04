import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogicalOperatorsAndFileDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		int x = 4;
		int y = -2;
		boolean result;
		
		//Precedence: !=, &&, ||
		//() forces precedence.
		System.out.println(x > 0 || y < 2);
		result = x > 0 || y < 2 && y != 0;
		System.out.println(x > 5 && y < 2);
		System.out.println(x > 5 || y < 2);
		
		
		///////////////////////////////////////////////////////////
		
		
		//Create a File object.
		File myFile = new File("numbers.txt");
		
		//Create a scanner object to read from the file.
		Scanner readFile = new Scanner(myFile);
		
		
		//.nextInt() reads only the next integer from the file.
		//System.out.println(readFile.nextInt());
		
		
		String line;
		String [] nameScore;
		
		
		//To read ALL the ints from the file.
		while (readFile.hasNextLine())
		{
			
			//Read one whole line from the file and save its content in a string variable.
			line = readFile.nextLine();
			
			//System.out.println(line);
			
			//Splits the line previously stored in the string variable when it encounters a space.
			//You can choose to split the string at any character you want. For example: . , : a 9 etc.
			//The character must be between " ", because .split is a String method.
			nameScore = line.split(" ");
			
			
			//Display the information at index 0, index 1, and index 2.
			System.out.println(nameScore[0] + " " + "has score of " + nameScore[1] + " and the age is " + nameScore[2]);
		}
		
		
		//Close the scanner object
		readFile.close();
	}

}
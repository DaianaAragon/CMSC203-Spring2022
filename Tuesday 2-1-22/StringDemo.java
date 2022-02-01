import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		int age;
		String firstName;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++)
		{
		
			System.out.println("Enter your age: ");
			
			age = input.nextInt();
			
			if (age < 1)
			{
				System.out.println("Age cannot be negative");				
			}
			
			else 
			{				
				//Consume new line
				input.nextLine();
				
				
				System.out.println("You entered " + age 
									+ " as your age");
				
				System.out.println("Enter your first name: ");
				firstName = input.nextLine();
				
				//1.- After the user enters the first name, show the first name
				//    as all upper case letters.
				
				//2.- Show how many letters are in the first name.
				
				
				while (firstName.equals(""))
				{
					System.out.println("First name cannot be empty.");
					System.out.println("Enter your first name: ");
					firstName = input.nextLine();
				}
				
				System.out.println("Your first name is " + firstName);
				System.out.println(firstName.toUpperCase());
				
				//Strings are IMMUTABLE.
				System.out.println("After calling to upper case: " + firstName);
	
				System.out.println("The length of the string is: " + firstName.length());
				
				//3.- Show the first and last letter of the name that
				//    the user enters.
				
				System.out.println("The first letter is: " + firstName.charAt(0));
				System.out.println("The last letter is: " + firstName.charAt(firstName.length()-1));
				
				//4.- Get the first three letters of the name if the name length is more than three.
				//    Otherwise, display the message "The name is too short".
				
				if (firstName.length() >= 3)
				{
					System.out.println(firstName.substring(2));
					System.out.println(firstName.substring(0, 3));
				}
				
				else 
				{
					System.out.println("The name is too short");
				}
				
				
				
				
				
			}
		
		} //End of the for loop
		
		input.close();

	}

}
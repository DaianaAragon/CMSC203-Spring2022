import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		
		int age;
		String lastName, firstName;
		
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
							
				while (firstName.equals(""))
				{
					System.out.println("First name cannot be empty.");
					System.out.println("Enter your first name: ");
					firstName = input.nextLine();
				}
				
				System.out.println("Your first name is " + firstName);
	
			}
		
		} //End of the for loop
		
		input.close();

	}

}



public class Review {

	public static void main(String[] args) {
		String n1 = "Apple";
		String n2 = "apple";
		
		if (n1.compareTo(n2) < 0) 
		{
			System.out.println(n1 + " is less than " + n2);
		}
		
		
		System.out.println(n1.compareTo(n2));
		
		System.out.println(n1.compareToIgnoreCase(n2));
		
		// Assume n3 is a variable of type String already defined and set.
		// Write a conditional statement that checks if the substring of n3 
		// starting at the second character is equal to apple.
		
		// Solution n1 (Long solution)
		String n3 = "Ap";
		String myStr = "Apple";
		boolean flag = true;
		
		for (int i = 1; i < n3.length(); i++)
		{
			if (n3.charAt(i) != myStr.charAt(i-1))
			{
				flag = false;
				break;
			}
		}
		
		if (flag == true)
		{
			//System.out.println();
		}
		
		// Get the substring of n3
		// Solution 2 
		
		// Start at index (1) 
		if (n3.substring(1).equals(myStr));
		
		// Start at index 1, end at index 2 (not included)
		if (n3.substring(1, 2).equals(myStr));
		
		
		switch () //Switch works with char, int and String (not double! neither conditions such as x > 4)
		{
		case "Apple":
		case 'a':
			break;
			
		case 10:
			break;
		
		case 10/3:
			break;
		}
		
		// Write a while loop checking for the input to be positive
		
		/*while ( x < 0 )
		{
			
		}*/

		
	}

}

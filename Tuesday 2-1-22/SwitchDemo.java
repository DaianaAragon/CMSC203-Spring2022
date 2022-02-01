import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		//1.- Create code to ask the user to enter a letter.
		//    Use the switch statement to test the value of letter
		//	  and do the following:
		//    -   If letter is 's' or 'S', display message "sun"
		//    -   If letter is 'm' or 'M', display message "moon"
		//    -   Otherwise, display "something else".
				
		Scanner input = new Scanner(System.in);
		
		String word;
		char letter;		
		
		System.out.println("Enter a letter or word: ");
		
		word = input.next();
		
		letter = word.charAt(0);
		
		//Switch does not work with range values
		//neither boolean, nor double.
		//Only works with constant values.
		switch (letter) 
		{
			case 's' : 				
			case 'S' :
				System.out.println("sun");
				break;
				
			case 'm':
			case 'M':
				System.out.println("moon");
				break;
				
			default:
				System.out.println("something else");
				//Optional
				break;	
				
		}
		

	}

}
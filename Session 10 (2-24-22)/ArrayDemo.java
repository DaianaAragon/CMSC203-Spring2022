import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// An array is a collection of data with the same type.
		// Consecutive location. One next to the other.
		
		// 1.- Create an array of type double and size 5 named scores.
		
		final int SIZE = 5;
		double scores[] = new double[SIZE];
		
		// 2.- Set the first element of scores array to 10.
		scores[0] = 10;
		
		
		// 3.- Set the last element of scores array to 50.
		scores[4] = 50;
		scores[SIZE - 1]= 50;
		scores[scores.length-1] = 50;
		
		
		// 4.- Set the third element of scores array to the sum of first and last element.
		scores[2] = scores[0] + scores[scores.length-1];
		
		
		// 5.- Display the content of the third element.
		System.out.println(scores[2]);
		
		
		// 6.- Use a loop to display the entire content of the scores array.
		for (int i=0; i<scores.length; i++)
		{
			System.out.println(scores[i]);
		}
		
		//7.- Show the content of the array backwards.
		
		for (int i=scores.length-1; i>=0; i--)
		{
			System.out.println(scores[i]);
		}
		
		//8.- Show every other content of the array. 
		int [] otherScores = {12, 49, 51, 71, 69, 93, 550};
		
		for (int i=0; i<otherScores.length; i+=2)
		{
			System.out.println(otherScores[i]);
		}
		
		//9.- Display all the odd numbers in the array.
		
		for (int i=0; i<otherScores.length; i++)
		{
			if (otherScores[i]%2==0)
				System.out.println(otherScores[i]);
		}
		
		// 10.- Display the contents of the whole array
		System.out.println(Arrays.toString(otherScores));

	}

}
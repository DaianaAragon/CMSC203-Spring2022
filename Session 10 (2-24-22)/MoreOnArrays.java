import java.util.Arrays;

public class MoreOnArrays {

	public static void main(String[] args) {
		
		// 1.- Create an array named stNames and initialize the array to the following:
		//     Apple, Orange, Mango, Banana.
		
		String [] stNames = {"Apple", "Orange", "Mango", "Banana"};
		
		// 2.- Create another array named cities and initialize it to the following:
		//     Gaithersburg, Bethesda, Rockville, Germantown
		
		String cities [] = {"Gaithersburg", "Bethesda", "Rockville", "Germantown"}; 
		
		// 3.- Display the second character of each element of stNames using a for loop.
		
		for (int i = 0; i < stNames.length; i++)
		{
			System.out.println(stNames[i].charAt(1));
		}
		
		// 4.- Display the number of characters of every element of cities array.
		
		for (int i = 0; i < cities.length; i++)
		{
			System.out.println(cities[i].length());
		}
		
		// 5.- Display the total number of characters of the elements of the cities array.
		
		int sum = 0;
		
		for (int i = 0; i < cities.length; i++)
		{
			sum += cities[i].length();					
		}
		
		System.out.println(sum);
		
		// 6.- Create a copy of stNames array named stNamesCopy.
		
		// Shallow copy (both variables point to the same object)
		//String [] stNamesCopy = stNames;
		
		// Deep copy
		String [] stNamesCopy = new String[stNames.length];
		
		System.out.println(stNamesCopy[0]);
		
		for(int i = 0; i < stNames.length; i++)
		{
			stNamesCopy[i] = stNames[i];
		}
		
		// Optionally: (deep copy)
		// String [] stNamesCopy = stNames.clone();
		
		// 7.- Display the content of stNamesCopy.
		System.out.println(Arrays.toString(stNamesCopy));

	}

}

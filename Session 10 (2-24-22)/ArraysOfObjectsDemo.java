import java.util.Arrays;

public class ArraysOfObjectsDemo {

	public static void main(String[] args) {
		
		// 1.- Create an array of type Vehicle named vehicles of size 3.
		
		Vehicle [] vehicles = new Vehicle[3];
		
		// 2.- Initialize the first element to an object with the following information:
		//     Corolla, Toyota, Black, 2020, 30000.
		
		vehicles[0] = new Vehicle("Corolla", "Toyota", "Black", 2020, 30000);
		
		// 3.- Display the content of the first element.
		
		System.out.println(vehicles[0]);
		
		// Displays the whole array
		System.out.println(Arrays.toString(vehicles));
		
		
		
		

	}

}

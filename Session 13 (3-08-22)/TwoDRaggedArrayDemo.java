
public class TwoDRaggedArrayDemo {

	public static void main(String[] args) {
		
		// Ragged array: 
		
		// 1.- Define an array called vehicles with four rows and 
		//     each rows having the following number of columns:
		//	   row 1 = 1, row 2 = 2, row 3 = 3, row 4 = 1.
		
		Vehicle [][] vehicles = new Vehicle [6][];
		
		vehicles[0] = new Vehicle [1];
		vehicles[1] = new Vehicle [2];
		vehicles[2] = new Vehicle [3];
		vehicles[3] = new Vehicle [1];
		vehicles[5] = new Vehicle [2];
		
		// 2.- Display the content of vehicles using nested loops.
		
		for (int row = 0; row < vehicles.length; row++)
		{
			for (int col = 0; col < vehicles[row].length; col++)
			{
					System.out.print(vehicles[row][col] + " ");
			}
			System.out.println();
		}
		
		// 3.- Set the third row and second column of vehicles to 
		//     a vehicle with the following information:
		//	   make = Subaru, model = Outback, color = Pink
		//     year = 2001, price = 20000
		//     and display the information.
		
		// Anonymous Object
		vehicles[2][1] = new Vehicle("Subaru", "Outback", "Pink", 2001, 20000);
		
		System.out.println(vehicles[2][1]);
		
		System.out.println("---------------");
				
		Vehicle v1 = vehicles[2][1];
		
		v1.setMake("Toyota");
		
		System.out.println(vehicles[2][1].getMake());
		
		// Using copy constructor.
		// We can pass v1 or vehicles[2][1]
		Vehicle v2 = new Vehicle(vehicles[2][1]);
		
		// Make array location point to v2 object.
		vehicles[2][0] = v2;
		
	}

}

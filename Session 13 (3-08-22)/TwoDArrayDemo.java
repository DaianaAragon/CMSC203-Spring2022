
public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		// 1.- Create a 2-D array of two rows and three columns 
		//	   of type int named ages.
		
		final int ROW = 2;
		final int COL = 3;
		
		int [][] ages = new int [ROW][COL];
		
		// 2.- Set the content of the array to what you see on the whiteboard.
		
		ages[0][0] = 20;
		ages[0][1] = 13;
		ages[0][2] = 32;
		
		ages[1][0] = 26;
		ages[1][1] = 17;
		ages[1][2] = 18;
		
		// 3.- Using a for loop, display the content of the first row.
		
		for (int col = 0; col < ages[0].length; col++)
		{
			System.out.print(ages[0][col] + " ");

		}
		
		System.out.println();
		
		// 4.- Using a for loop, display the content of the second row.
		
		for (int col = 0; col < ages[1].length; col++)
		{
			System.out.print(ages[1][col] + " ");
		}

		System.out.println("\n--------------");
		
		// 5.- Create a nested loop that shows the content of the array.
		
		// Length of the 2D array (ages.length) = number of rows
		
		for (int row = 0; row < ages.length; row++) 
		{
			// ages[row].length = Length of the array at row number row
			for (int col = 0; col < ages[row].length; col++)
			{
				System.out.print(ages[row][col] + " ");
			}
			System.out.println();
		}
	

	}

}

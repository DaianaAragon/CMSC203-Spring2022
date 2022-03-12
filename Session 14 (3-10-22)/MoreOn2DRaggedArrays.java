
public class MoreOn2DRaggedArrays {

	public static void main(String[] args) {
		// 1.- Create a ragged array called ages of type int.
		int [][] ages = new int [5][];
		
		//Create and initialize
		//int [][] agesCopy = {{10}, {20, 40}, {10, 1}, {3}, {2 , 5, 7}};

		ages[0] = new int[1];
		ages[1] = new int[2];
		ages[2] = new int[2];
		ages[3] = new int[1];
		ages[4] = new int[3];
		
		// Initialize
		ages[0][0] = 10;
		ages[1][0] = 20;
		ages[1][1] = 40;
		ages[2][0] = 10;
		ages[2][1] = 1;
		ages[3][0] = 3;
		ages[4][0] = 2;
		ages[4][1] = 5;
		ages[4][2] = 7;
		
		//System.out.println(findColSum(ages, 2));
		
		System.out.println(findLowest(ages, 1));

	}
	
	// Generic method to find the sum of elements in a specific column index.
	public static int findColSum(int [][] someArray, int colIndex)
	{
		int sum = 0; 
		
		for (int row = 0; row < someArray.length; row++)
		{
			if (someArray[row].length >= colIndex + 1)
			{
				sum += someArray[row][colIndex];
			}
		}
		
		return sum;
	}
	
	// Generic method to find the lowest number in a specific column index.
	
	public static int findLowest(int [][] someArray, int colIndex)
	{
		int lowest = Integer.MAX_VALUE;
		
		for (int row = 0; row < someArray.length; row++) 
		{
			if (someArray[row].length >= colIndex + 1) // Check if the column exists
			{
				if (someArray[row][colIndex] < lowest)
				{
					lowest = someArray[row][colIndex];
				}
			}
		}
		
		return lowest;
	}

}

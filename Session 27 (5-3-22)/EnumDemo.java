public class EnumDemo {

	public static void main(String[] args) {
		
		// Create an object: Box, Yellow, 2D
		
		Shape s1 = new Shape("Box", "Yellow", Dimensions.TWO_D);
		
		// Check the dimension of s1 is not 3D
		
		if (!s1.getDimension().equals(Dimensions.THREE_D))
		{
			System.out.println("Not THREE_D");
		}

	}

}
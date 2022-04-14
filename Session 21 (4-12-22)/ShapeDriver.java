import java.util.ArrayList;

public class ShapeDriver {

	public static void main(String[] args) {
		
		// 1.- Create an arrayList named shapes and 
		// store two rectangles and two circles
		// objects in the shapes array.
		
		ArrayList<Shape> shapes = new ArrayList();
		
		Rectangle r1 = new Rectangle("Box", "Blue", 2, 4);
		
		// Add to arrayList
		shapes.add(r1);
		
		// Anonymous object
		shapes.add(new Circle());
		
		shapes.add(new Rectangle("Table", "Red", 12, 20));
		
		shapes.add(new Circle());

		
		// 2.- Use a loop to show the area of each shape.
		
		for (int i = 0; i < shapes.size(); i++)
		{
			System.out.println(shapes.get(i).findArea());
		}
		
	}

}
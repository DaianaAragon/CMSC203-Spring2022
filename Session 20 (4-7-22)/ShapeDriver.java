
public class ShapeDriver {

	public static void main(String[] args) {
		
		Rectangle s1 = new Rectangle();
		
		s1.setName("Box");
		s1.setColor("Brown");
		s1.setLength(7);
		s1.setWidth(10);
		System.out.println(s1.findArea());
		
		Rectangle s2 = new Rectangle("Box", "Brown", 7, 10);

	}

}

public class Rectangle extends Shape implements Moveable, Paintable {
	// A subclass (child) can only extend one super class (parent)
	// But it can implement multiple interfaces (using commas)
	
	private double length, width;
	
	public Rectangle()
	{
		super();
		length = 0;
		width = 0;
	}
	
	public Rectangle(String name, String color,
			         double length, double width)
	{
		super(name, color);
		this.length = length;
		this.width = width;		
	}
	
	// Overriding from Shape class
	@Override
	public double findArea()
	{
		return length * width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	public void moveUp() {
		System.out.println("Move Rectangle Up");
	}

	@Override
	public void moveDown() {
		System.out.println("Move Rectangle Down");	
	}

	@Override
	public void paintWithBrush() {
		
		
	}

	@Override
	public void paintWithSpray() {
		
		
	}
	
}
public class Rectangle extends Shape {
	
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
	
}